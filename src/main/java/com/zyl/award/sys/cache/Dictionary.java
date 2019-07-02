package com.zyl.award.sys.cache;

import com.zyl.award.exception.BusinessException;
import com.zyl.award.sys.entity.po.SysDict;
import com.zyl.award.sys.entity.po.SysDictCatalog;
import com.zyl.award.sys.service.SysDictCatalogService;
import com.zyl.award.sys.service.SysDictService;
import com.zyl.award.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-07-02 08:49
 **/
@Slf4j
@Component
public class Dictionary {

    @Autowired
    SysDictService sysDictService;

    @Autowired
    SysDictCatalogService sysDictCatalogService;

    private static ConcurrentHashMap<String, HashMap<String,String>> sysAllDictMap = new ConcurrentHashMap<>();

    public synchronized void loadAllDict(){
        List<SysDictCatalog> sysDictCatalogList = sysDictCatalogService.selectAll();
        for (SysDictCatalog sysDictCatalog : sysDictCatalogList) {
            String catalogCode = sysDictCatalog.getCatalogCode();
            Example example = new Example(SysDict.class);
            example.createCriteria().andEqualTo("catalogCode",catalogCode);
            List<SysDict> sysDictsList = sysDictService.selectCondition(example);
            if(!CollectionUtils.isEmpty(sysDictsList)){
                HashMap<String,String> hashMap = new HashMap<>();
                for (SysDict sysDict : sysDictsList) {
                    hashMap.put(sysDict.getDictKey(),sysDict.getDictValue());
                }
                sysAllDictMap.put(catalogCode,hashMap);

            }

        }

    }

    public static String get(String catalogCode,String key){
        Map<String,String> dictMap = sysAllDictMap.get(catalogCode);
        if(dictMap==null){
            throw new BusinessException("无此字典分类");
        }
        String value = dictMap.get(key);
        if(StringUtil.isEmpty(value)){
            throw new BusinessException(catalogCode+"分类字典中无此KEY值");
        }else{
            return value;
        }
    }
}

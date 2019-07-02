package com.zyl.award.sys.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_dict")
public class SysDict extends BasePO<Integer> {


    @Column(name = "dict_key")
    private String dictKey;

    @Column(name = "dict_value")
    private String dictValue;

    @Column(name = "catalog_code")
    private String catalogCode;

    @Column(name = "sort")
    private Integer sort;


    /**
     * @return dict_key
     */
    public String getDictKey() {
        return dictKey;
    }

    /**
     * @param dictKey
     */
    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    /**
     * @return dict_value
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * @param dictValue
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
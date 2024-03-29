package com.zyl.award.commons.file.controller;

import com.zyl.award.annotations.ResponseResult;
import com.zyl.award.commons.file.service.FileService;
import com.zyl.award.commons.file.util.FileUtils;
import com.zyl.award.result.PlatformResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @desc:
 * @author: create by SunHJ
 * @date:2018/6/19 9:48
 */
@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    FileService fileService;

    @Autowired
    FileUtils fileUtils;

    @PostMapping("/upload")
    public String upLoad(MultipartFile file){
        if(fileUtils.isPic(file)){
            return fileService.uploadPic(file);
        }else if(fileUtils.isExcel(file)){
            return fileService.uploadExcel(file);
        }
        return fileService.uploadFileToPath(file,"D:/tmp/");

    }
}

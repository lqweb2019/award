package com.zyl.award.sys.config;

import com.zyl.award.sys.cache.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author sunhaijun
 * @description:
 * @create: 2019-07-02 09:15
 **/
@Component
@Order(1)
public class InitDictStartRunner implements CommandLineRunner {
    @Autowired
    Dictionary dictionary;

    @Override
    public void run(String... args) throws Exception {
        dictionary.loadAllDict();
    }
}

package com.it.service.impl;

import com.it.domain.EsUser;
import com.it.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;


@Service
public class EsServiceImpl implements EsService {

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;


    @Override
    public void save(EsUser esUser) {
//        elasticsearchTemplate.createIndex("imoc");
        elasticsearchTemplate.putMapping(EsUser.class);
    }
}

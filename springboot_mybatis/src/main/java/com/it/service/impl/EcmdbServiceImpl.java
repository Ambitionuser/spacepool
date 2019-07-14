package com.it.service.impl;

import com.it.dao.EcmdbMapper;
import com.it.domain.MmsInter;
import com.it.service.EcmdbService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EcmdbServiceImpl implements EcmdbService{
    @Resource
    EcmdbMapper ecmdbMapper;

    @Override
    public void updateInterList(MmsInter mmsInter) {
        ecmdbMapper.updateInterList(mmsInter);
    }
}

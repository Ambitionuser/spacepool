package com.it.service.impl;

import com.it.dao.EcmdbMapper;
import com.it.domain.MmsInter;
import com.it.service.EcmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EcmdbServiceImpl implements EcmdbService{
    @Autowired
    EcmdbMapper ecmdbMapper;


    @Override
    public void updateInterList(MmsInter mmsInter) {
        ecmdbMapper.updateInterList(mmsInter);
    }

    @Override
    public void insertInterList(List<MmsInter> mmsInters) {
        ecmdbMapper.insertInterList(mmsInters);
    }
}

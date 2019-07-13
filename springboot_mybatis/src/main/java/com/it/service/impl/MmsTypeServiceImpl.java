package com.it.service.impl;

import com.it.dao.MmsTypeMapper;
import com.it.domain.MmsType;
import com.it.service.MmsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MmsTypeServiceImpl implements MmsTypeService{

    @Resource
    MmsTypeMapper mmsTypeMapper;

    @Override
    public List<MmsType> getMmsTypeList(String id) {
        List<MmsType> mmsTypeList = mmsTypeMapper.getMmsTypeList(id);
        return mmsTypeList;
    }
}

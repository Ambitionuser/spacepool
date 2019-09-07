package com.it.cloud.service.impl;

import com.it.cloud.dao.teacher.InfoMapper;
import com.it.cloud.domain.entity.teacher.Info;
import com.it.cloud.service.InfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Resource
    InfoMapper infoMapper;

    @Override
    public List<Info> selectAll() {
        return infoMapper.selectAll();
    }
}

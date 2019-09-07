package com.it.cloud.service;

import com.it.cloud.domain.entity.teacher.Info;

import java.util.List;

public interface InfoService {
    List<Info> selectAll();
}

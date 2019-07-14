package com.it.dao;

import com.it.domain.MmsInter;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EcmdbMapper {
    void updateInterList(MmsInter mmsInter);
}

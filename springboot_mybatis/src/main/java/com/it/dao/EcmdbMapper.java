package com.it.dao;

import com.it.domain.MmsInter;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface EcmdbMapper {
    void updateInterList(MmsInter mmsInter);
    void ecmdbInterList(List<MmsInter> mmsInters);
}

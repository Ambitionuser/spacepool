package com.it.dao;

import com.it.domain.MmsInter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EcmdbMapper {
    void updateInterList(MmsInter mmsInter);
    void insertInterList( @Param("mmsInters") List<MmsInter> mmsInters);
}

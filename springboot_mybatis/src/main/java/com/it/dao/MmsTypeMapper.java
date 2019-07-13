package com.it.dao;

import com.it.domain.MmsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MmsTypeMapper {
    List<MmsType> getMmsTypeList(String id);
}

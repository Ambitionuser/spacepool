package com.it.dao;


import com.it.domain.MongodbUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Mapper
public interface MongodbMapper extends MongoRepository{
    List<MongodbUser> selectUserList(String name);

    List<MongodbUser> selectUserAllList();

    void saveUser(MongodbUser mongodbUser);

}

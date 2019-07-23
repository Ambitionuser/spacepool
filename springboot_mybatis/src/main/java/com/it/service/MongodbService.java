package com.it.service;

import com.it.domain.MongodbUser;

import java.util.List;

public interface MongodbService {
    List<MongodbUser> selectUserList(String name);

    List<MongodbUser> selectUserAllList();

    void saveUser(MongodbUser mongodbUser);
}

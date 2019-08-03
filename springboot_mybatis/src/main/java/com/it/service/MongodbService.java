package com.it.service;

import com.it.domain.MongodbUser;

import java.util.List;

public interface MongodbService {

    void save(MongodbUser mongodbUser);

    void update(MongodbUser mongodbUser);

    void deleteById(Long id);

    MongodbUser findById(Long id);

    List<MongodbUser> findAll();

    List<MongodbUser> findByName(String name);
}

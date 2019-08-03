package com.it.service.impl;

import com.it.domain.MongodbUser;
import com.it.service.MongodbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.regex.Pattern;


@Service
public class MongodbServiceImpl implements MongodbService{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(MongodbUser mongodbUser) {
        mongoTemplate.save(mongodbUser);
    }

    @Override
    public void update(MongodbUser mongodbUser) {
        //创建更新条件
        Query query = new Query();
        Criteria criteria = Criteria.where("id").is(mongodbUser.getId());
        query.addCriteria(criteria);

        //创建更新对象
        Update update = new Update();
        update.set("name", mongodbUser.getName());
        update.set("age", mongodbUser.getAge());

        //更新所有符合条件的记录
        mongoTemplate.updateMulti(query, update, MongodbUser.class);
    }

    @Override
    public void deleteById(Long id) {
        //创建删除条件
        Query query = new Query();
        Criteria criteria = Criteria.where("id").is(id);
        query.addCriteria(criteria);
        mongoTemplate.remove(query, MongodbUser.class);
    }

    @Override
    public MongodbUser findById(Long id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("id").is(id);
        query.addCriteria(criteria);
        return mongoTemplate.findOne(query, MongodbUser.class);
    }

    @Override
    public List<MongodbUser> findAll() {
        return mongoTemplate.findAll(MongodbUser.class);
    }

    @Override
    public List<MongodbUser> findByName(String name) {
        Query query = new Query();
        //模糊查询，不区分大小写
        Pattern pattern = Pattern.compile("^.*" + name + ".*$", Pattern.CASE_INSENSITIVE);
        Criteria criteria = Criteria.where("name").regex(pattern);
        query.addCriteria(criteria);
        return mongoTemplate.find(query, MongodbUser.class);
    }
}

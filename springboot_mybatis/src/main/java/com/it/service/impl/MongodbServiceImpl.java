package com.it.service.impl;

import com.it.dao.MongodbMapper;
import com.it.domain.MongodbUser;
import com.it.service.MongodbService;
import com.mongodb.client.result.UpdateResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MongodbServiceImpl implements MongodbService{
    @Resource
    MongodbMapper mongodbMapper;

    @Resource
    MongoTemplate mongoTemplate;

    @Override
    public List<MongodbUser> selectUserList(String name) {
        return mongodbMapper.selectUserList(name);
    }

    @Override
    public List<MongodbUser> selectUserAllList() {
        return mongodbMapper.selectUserAllList();
    }

    @Override
    public void saveUser(MongodbUser mongodbUser) {
        mongoTemplate.save(mongodbUser);
    }

   /* @Override
    public void removeUser(Long id) {
        Query query = new Query(Criteria.where("id").is(id));//查找其id字段的值与传入参数id相等的数据
        mongoTemplate.remove(query,User.class);
    }

    @Override
    public User findUserByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        User user = mongoTemplate.findOne(query,User.class);
        return user;
    }

    @Override
    public int updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("name",user.getName()).set("password",user.getPassword());
        //更新查询返回的结果集的第一条数据
        UpdateResult result = mongoTemplate.updateFirst(query,update,User.class);
        //更新查询到的所有结果集
        //UpdateResult all_result = mongoTemplate.updateMulti(query,update,User.class);
        if(result!= null)
            return (int) result.getModifiedCount();
        else
            return 0;
    }*/


}

package com.huawei.main.mapper;

import com.huawei.main.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
/*
ElasticsearchRepository是Elasticsearch提供的一个类
通过继承这个类，可以实现对数据的CRUD
用法和JPA差不多
Elasticsearch自带的有基本的CRUD方法，
如果要自定义方法，方法名必须要按照规范书写,
如：findById  fingByIdAndName 等
 */
@ComponentScan
public interface UserMapper extends ElasticsearchRepository<User,Integer> {

    public User queryUserById(Integer id);
}

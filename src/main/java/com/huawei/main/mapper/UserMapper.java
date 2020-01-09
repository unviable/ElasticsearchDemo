package com.huawei.main.mapper;

import com.huawei.main.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserMapper extends ElasticsearchRepository<User,Integer> {

    public User queryUserById(Integer id);
}

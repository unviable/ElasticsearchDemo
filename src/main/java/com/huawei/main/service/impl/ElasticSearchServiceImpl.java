package com.huawei.main.service.impl;

import com.huawei.main.mapper.UserMapper;
import com.huawei.main.pojo.User;
import com.huawei.main.service.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {
    @Autowired
    private UserMapper mapper;
    @Override
    public User findById(Integer id) {
        User user = mapper.queryUserById(1);
        return user;
    }
}

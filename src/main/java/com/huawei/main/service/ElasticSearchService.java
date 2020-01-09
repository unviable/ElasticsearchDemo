package com.huawei.main.service;

import com.huawei.main.pojo.User;

public interface ElasticSearchService {
    public User findById(Integer id);
}

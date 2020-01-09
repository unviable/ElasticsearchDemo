package com.huawei.main.handler;

import com.huawei.main.mapper.UserMapper;
import com.huawei.main.pojo.User;
import com.huawei.main.service.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHandler {
    @Autowired
    private ElasticSearchService service;
    @Autowired
    private UserMapper mapper;
    @RequestMapping("/find")
    public User get(Integer id){
        User user = service.findById(id);
        return user;
    }
    @RequestMapping("/save")
    public String save(){
        User user = new User(1, "jacob", "male");
        mapper.save(user);
        return  "成功";
    }
}

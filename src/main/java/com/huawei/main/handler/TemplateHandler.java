package com.huawei.main.handler;

import com.huawei.main.pojo.User;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/*
java中使用ElasticsearchCrudRepository来操作ElasticSearch
复杂的用ElasticsearchTemplate
    Elasticsearch存在的一个关键问题就是索引的设置及字段的属性指定,常见的
    问题就是，某个字段我们并不希望ES对其进行分词，但如果使用自动模板创建索引
    默认所有string类型都会被分词的，因此必须要显式指定字段的not_analyzed
ElasticsearchTemplate是Spring对ES的java api进行的封装，提供了大量的相关的类来完成各种各样的查询
 */
@RestController
public class TemplateHandler {
    @Autowired
    private ElasticsearchTemplate template;

    @RequestMapping("/query")
    public List<User> query() {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.queryStringQuery("1"))
                .build();
        List<User> users = template.queryForList(searchQuery, User.class);
        return users;
    }
}

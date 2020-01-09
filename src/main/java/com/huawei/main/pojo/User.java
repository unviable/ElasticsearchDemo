package com.huawei.main.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "java58",type="myuser", shards = 1, replicas = 0, refreshInterval = "-1")
public class User {
    private Integer id;
    private String name;
    private String sex;

}

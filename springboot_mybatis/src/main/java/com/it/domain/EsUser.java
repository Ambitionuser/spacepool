package com.it.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "imoc",type = "mms",shards = 1,replicas = 0, refreshInterval = "-1")
public class EsUser {

    @Id private String id;
    @Field(index = true,type = FieldType.Object)
    public String name;
    @Field(index = true,type = FieldType.Integer)
    public int age;
}

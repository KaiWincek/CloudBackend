package com.example.cloudbackend;

import javax.persistence.*;

@Entity
@Table(name="content_object")
public class ContentObject {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "content")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

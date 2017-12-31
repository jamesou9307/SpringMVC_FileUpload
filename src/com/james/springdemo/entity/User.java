package com.james.springdemo.entity;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class User {

    private long id;
    private String name;
    private String password;
    List<MultipartFile> images;

    public User() {
    }

    public User(long id, String name, String password, List<MultipartFile> images) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.images = images;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MultipartFile> getImages() {
        return images;
    }

    public void setImages(List<MultipartFile> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "userId:"+id+" "+"userName:"+name+" "+"password:"+password;
    }
}

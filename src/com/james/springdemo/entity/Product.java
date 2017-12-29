package com.james.springdemo.entity;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class Product {

    private String name;
    private String discription;
    private Float price;
    private List<MultipartFile> images;//上传到SpringMVC的文建会被包在一个MultipartFile对象中

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<MultipartFile> getImages() {
        return images;
    }

    public void setImages(List<MultipartFile> images) {
        this.images = images;
    }
}

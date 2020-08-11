package com.templateloop.demo.pojo;


import java.math.BigDecimal;

//分类模型
public class Category {

    //分类id
    Long categoryId;
    public Long getCategoryId() {
        return this.categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    //分类名称
    private String categoryName;
    public String getCategoryName() {
        return this.categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    //打印
    public String toString(){
        return " Category:categoryId=" + categoryId +" categoryName=" + categoryName;
    }
}

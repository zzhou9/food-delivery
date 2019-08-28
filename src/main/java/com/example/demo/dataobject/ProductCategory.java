package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="product_category")
@DynamicUpdate
public class ProductCategory implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer categoryId;


    @Column(name="category_name")
    private String categoryName;


    @Column(name="category_type")
    private Integer categoryType;

    public ProductCategory(){

    }

    public ProductCategory(String categoryName,Integer categoryType){
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    private Date createTime;


    private Date updateTime;


}

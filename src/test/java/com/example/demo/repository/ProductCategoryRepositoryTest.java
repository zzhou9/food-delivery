package com.example.demo.repository;

import com.example.demo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    public ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
       ProductCategory productCategory = repository.findById(1).orElse(null);
       System.out.println(productCategory.toString());
    }

    @Test
    public void updateDirectly(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(7);
        repository.save(productCategory);
    }

    @Test
    public void updateAfterQuery(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(20);
        repository.save(productCategory);
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }

}
package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
@Table(name ="product_info")
public class ProductInfo {

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name ="product_name")
    private String productName;

    @Column(name ="product_price")
    private BigDecimal productPrice;

    /** the number of product */
    @Column(name = "product_stock")
    private Integer productStock;

    @Column(name ="product_description")
    private String productDescription;

    /** Icon picture */
    @Column(name ="product_icon")
    private String productIcon;

    @Column(name ="product_status")
    private Integer productStatus;

    @Column(name ="category_type")
    private Integer categoryType;


    private Date createTime;

    private Date updateTime;
}

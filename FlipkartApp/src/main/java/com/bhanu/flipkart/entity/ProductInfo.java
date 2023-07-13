package com.bhanu.flipkart.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class ProductInfo implements Serializable
{
   @Column(name="alt_key")
   private int altKey;
   
   @Column(name="name")
   private String name;
   
   @Column(name="product_type")
   private String productType;
   
   @Column(name="price")
   private long price;
   
   @Column(name="description")
   private String description;
   
   @Column(name="mfg_date")
   private String mfgDate;
}

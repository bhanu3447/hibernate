package com.bhanu.flipkart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="stock_info")
public class StockInfo  implements Serializable
{
  @Column(name="alt_key")
  private int altKey;
  
  @Column(name="product_id")
  private int productId;
  
  
  @Column(name="quantity")
  private int quantity;
  
 
}

package com.bhanu.flipkart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderInfo implements Serializable
{
  @Column(name="alt_key")
  private long altKey;
  
  @Column(name="product_id")
  private int productId;
  
  @Column(name="quantity")
  private int quantity;
  
  @Column(name="total_price")
  private long totalPrice;
  
  @Column(name="sold_date")
  private String soldDate;
  
  @Column(name="payment_mode")
  private String paymentMode;
}

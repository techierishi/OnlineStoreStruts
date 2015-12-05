/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknikstore.domain;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Sales {
  private int sales_id;
  private int order_id;
  private int product_id;
  private String product_name;
  private double product_price;
  private int product_quantity;
  private Date sold_on;
  private int user_id;
}

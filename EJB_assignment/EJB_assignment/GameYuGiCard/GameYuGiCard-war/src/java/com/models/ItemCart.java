/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author HP
 */
public class ItemCart {
    private String productIDD ;
    private String namepro;
//    private int levelproduct;
//    private String attributepro;
//    private String typepro;
//    private int attpointpro;
//    private int defpointpro;
//  private String  descriptionpro ;
  //private String imgpro ="";
  private int pricepro;
  private int quanpro;
  private int total;

    public ItemCart() {
    }

    public ItemCart(String productIDD, int pricepro, int quanpro) {
        this.productIDD = productIDD;
        this.pricepro = pricepro;
        this.quanpro = quanpro;
    }

    public ItemCart(String productIDD, int quanpro) {
        this.productIDD = productIDD;
        this.quanpro = quanpro;
    }

    public ItemCart(String productIDD, String namepro, int pricepro, int quanpro, int total) {
        this.productIDD = productIDD;
        this.namepro = namepro;
        this.pricepro = pricepro;
        this.quanpro = quanpro;
        this.total = total;
    }

  

    public ItemCart(String productIDD, int pricepro, int quanpro, int total) {
        this.productIDD = productIDD;
        this.pricepro = pricepro;
        this.quanpro = quanpro;
        this.total = total;
    }

    public String getProductIDD() {
        return productIDD;
    }

    public void setProductIDD(String productIDD) {
        this.productIDD = productIDD;
    }

    public String getNamepro() {
        return namepro;
    }

    public void setNamepro(String namepro) {
        this.namepro = namepro;
    }

    public int getPricepro() {
        return pricepro;
    }

    public void setPricepro(int pricepro) {
        this.pricepro = pricepro;
    }

    public int getQuanpro() {
        return quanpro;
    }

    public void setQuanpro(int quanpro) {
        this.quanpro = quanpro;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    

  

  
  
}
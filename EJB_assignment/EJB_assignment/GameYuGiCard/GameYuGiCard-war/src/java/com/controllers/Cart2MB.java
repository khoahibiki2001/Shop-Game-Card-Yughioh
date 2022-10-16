/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.entities.ProductDetail;
import com.models.ItemCart;
import com.sesionbeans.ProductDetailFacadeLocal;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 *
 * @author HP
 */
@Named(value = "cart2MB")
@SessionScoped

public class Cart2MB implements Serializable{

    @EJB
    private ProductDetailFacadeLocal productDetailFacade;
    private HashMap<Integer, Integer> cart = new HashMap<Integer, Integer>();
private List<ItemCart> listCart = new ArrayList<>();
    private ItemCart[] aCart;
    private ItemCart itemCart = new ItemCart();
    private ProductDetail product = new ProductDetail();
    private List<ItemCart> lst = new ArrayList<>();
     private String Productnumber ;
    private String Productnames;
     private int Productprices;
  private int Productquan;
  private int total;
  private int cartTotal;

    public Cart2MB() {
    }

  public List<ItemCart> showCart(){
      return listCart;
  }
  
public  List<ItemCart> allcart(){
  lst = new ArrayList<>();
  cartTotal = 0;
  for(ItemCart itemC : listCart){
      Productnumber = itemC.getProductIDD();
      Productnames = productDetailFacade.find(Productnumber).getProductName();
      Productprices = productDetailFacade.find(Productnumber).getProductPrice();
      Productquan = itemC.getQuanpro();
      total = Productprices * Productquan;
      cartTotal += total;
      ItemCart cart = new  ItemCart(Productnumber,Productnames, Productprices, total, total);
  lst.add(cart);
  }
  return  lst;
  }

    public HashMap<Integer, Integer> getCart() {
        return cart;
    }

    public void setCart(HashMap<Integer, Integer> cart) {
        this.cart = cart;
    }

    public List<ItemCart> getListCart() {
        return listCart;
    }

    public void setListCart(List<ItemCart> listCart) {
        this.listCart = listCart;
    }

    public ItemCart[] getaCart() {
        return aCart;
    }

    public void setaCart(ItemCart[] aCart) {
        this.aCart = aCart;
    }

    public ItemCart getItemCart() {
        return itemCart;
    }

    public void setItemCart(ItemCart itemCart) {
        this.itemCart = itemCart;
    }

    public ProductDetail getProduct() {
        return product;
    }

    public void setProduct(ProductDetail product) {
        this.product = product;
    }

    public List<ItemCart> getLst() {
        return lst;
    }

    public void setLst(List<ItemCart> lst) {
        this.lst = lst;
    }

    public String getProductnumber() {
        return Productnumber;
    }

    public void setProductnumber(String Productnumber) {
        this.Productnumber = Productnumber;
    }

    public String getProductname() {
        return Productnames;
    }

    public void setProductname(String Productname) {
        this.Productnames = Productname;
    }

    public int getProductprice() {
        return Productprices;
    }

    public void setProductprice(int Productprice) {
        this.Productprices = Productprice;
    }

    public int getProductquan() {
        return Productquan;
    }

    public void setProductquan(int Productquan) {
        this.Productquan = Productquan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(int cartTotal) {
        this.cartTotal = cartTotal;
    }
}
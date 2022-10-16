/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.entities.ProductDetail;
import com.sesionbeans.ProductDetailFacadeLocal;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.servlet.http.Part;

/**
 *
 * @author HP
 */
@Named(value = "productControllers")
@RequestScoped
public class ProductControllers {

    @EJB
    private ProductDetailFacadeLocal productDetailFacade;
    private ProductDetail pd = new ProductDetail();
    private Part file;
    String i;

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
    private int selectNum = 1;// ko dùng
    private String selectnumvarchar = "A001";
    private String numproduct;// la id lun 
    private String nameproduct;
    private int levelproduct;
    private String attributeproduct;
    private String typeproduct;
    private int attpoint;
    private int defpoint;
    private String description;
    private String imgproduct = "";
    private int priceproduct;
    private int quanproduct;

    public String find() {

        pd = productDetailFacade.find(selectnumvarchar);
        return "ad-products_find";
    }

    public String idProduct() {

        for (ProductDetail p : allProduct()) {
            i = p.getProductCardNumber();
        }

        return i + 1;

    }
    private String temp = "id";

    public String prodetail(String id) {

        temp = id;
        pd = productDetailFacade.find(id);

        return "sp";
    }

    public String edit() {
        imgproduct = file.getSubmittedFileName();
        ProductDetail p = new ProductDetail(selectnumvarchar, nameproduct, description, imgproduct, priceproduct);
        productDetailFacade.edit(p);
        return "ad-products";

    }

    public String idProductadd() {
        for (ProductDetail p : allProduct()) {
            i = p.getProductCardNumber();
        }
        productDetailFacade.create(pd);
        return "ad-products";
    }

//    public ProductDetail(String productCardNumber, String productName, String productDescription, String productImg, Integer productPrice) {
//        this.productCardNumber = productCardNumber;
//        this.productName = productName;
//        this.productDescription = productDescription;
//        this.productImg = productImg;
//        this.productPrice = productPrice;
//    }

    
    
    public String addP() {

        imgproduct = file.getSubmittedFileName();
        ProductDetail p = new ProductDetail(idProduct(), nameproduct, description, imgproduct, priceproduct);
        productDetailFacade.create(p);
        return "ad-products";
    }

    public String add() {

        return "ad-products_add";
    }

    public String delete(String id) {
        ProductDetail p = productDetailFacade.find(selectnumvarchar);
        productDetailFacade.remove(p);
        return "ad-products";

    }

    public String back() {

        return "ad-products";
    }

    public String findedit() {
        ProductDetail p = productDetailFacade.find(selectnumvarchar);
        numproduct = p.getProductCardNumber();
        nameproduct = p.getProductName();
        priceproduct = p.getProductPrice();
        description = p.getProductDescription();

        return "ad-products_edit";
    }

    public String findbyID(String numb) {
        ProductDetail pro = productDetailFacade.find(numb);
        return pro.getProductImg();
    }

    public ProductControllers() {
    }

    public List<ProductDetail> findAll() {
        return this.productDetailFacade.findAll();
    }

    public List<ProductDetail> allProduct() {
        return productDetailFacade.findAll();
    }

    public String ProductsDetail(String num) {
        pd = productDetailFacade.find(num);
        return "ProductDetails";
    }

    public ProductDetail getPd() {
        return pd;
    }

    public void setPd(ProductDetail pd) {
        this.pd = pd;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public int getLevelproduct() {
        return levelproduct;
    }

    public void setLevelproduct(int levelproduct) {
        this.levelproduct = levelproduct;
    }

    public String getAttributeproduct() {
        return attributeproduct;
    }

    public void setAttributeproduct(String attributeproduct) {
        this.attributeproduct = attributeproduct;
    }

    public String getTypeproduct() {
        return typeproduct;
    }

    public void setTypeproduct(String typeproduct) {
        this.typeproduct = typeproduct;
    }

    public int getAttpoint() {
        return attpoint;
    }

    public void setAttpoint(int attpoint) {
        this.attpoint = attpoint;
    }

    public int getDefpoint() {
        return defpoint;
    }

    public void setDefpoint(int defpoint) {
        this.defpoint = defpoint;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgproduct() {
        return imgproduct;
    }

    public void setImgproduct(String imgproduct) {
        this.imgproduct = imgproduct;
    }

    public int getPriceproduct() {
        return priceproduct;
    }

    public void setPriceproduct(int priceproduct) {
        this.priceproduct = priceproduct;
    }

    public int getQuanproduct() {
        return quanproduct;
    }

    public void setQuanproduct(int quanproduct) {
        this.quanproduct = quanproduct;
    }

    public String getNumproduct() {
        return numproduct;
    }

    public void setNumproduct(String numproduct) {
        this.numproduct = numproduct;
    }

    public int getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(int selectNum) {
        this.selectNum = selectNum;
    }

    public String getSelectnumvarchar() {
        return selectnumvarchar;
    }

    public void setSelectnumvarchar(String selectnumvarchar) {
        this.selectnumvarchar = selectnumvarchar;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}

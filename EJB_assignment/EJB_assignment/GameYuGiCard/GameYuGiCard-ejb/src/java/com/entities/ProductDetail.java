/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Product_Detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductDetail.findAll", query = "SELECT p FROM ProductDetail p")
    , @NamedQuery(name = "ProductDetail.findByProductCardNumber", query = "SELECT p FROM ProductDetail p WHERE p.productCardNumber = :productCardNumber")
    , @NamedQuery(name = "ProductDetail.findByProductName", query = "SELECT p FROM ProductDetail p WHERE p.productName = :productName")
    , @NamedQuery(name = "ProductDetail.findByProductLevel", query = "SELECT p FROM ProductDetail p WHERE p.productLevel = :productLevel")
    , @NamedQuery(name = "ProductDetail.findByProductAttribute", query = "SELECT p FROM ProductDetail p WHERE p.productAttribute = :productAttribute")
    , @NamedQuery(name = "ProductDetail.findByProductType", query = "SELECT p FROM ProductDetail p WHERE p.productType = :productType")
    , @NamedQuery(name = "ProductDetail.findByProductAttackPoints", query = "SELECT p FROM ProductDetail p WHERE p.productAttackPoints = :productAttackPoints")
    , @NamedQuery(name = "ProductDetail.findByProductDefensePoints", query = "SELECT p FROM ProductDetail p WHERE p.productDefensePoints = :productDefensePoints")
    , @NamedQuery(name = "ProductDetail.findByProductDescription", query = "SELECT p FROM ProductDetail p WHERE p.productDescription = :productDescription")
    , @NamedQuery(name = "ProductDetail.findByProductPrice", query = "SELECT p FROM ProductDetail p WHERE p.productPrice = :productPrice")
    , @NamedQuery(name = "ProductDetail.findByProductQuantity", query = "SELECT p FROM ProductDetail p WHERE p.productQuantity = :productQuantity")})
public class ProductDetail implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pdNum")
    private Collection<Orderchitiet> orderchitietCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Product_Card_Number")
    private String productCardNumber;
    @Size(max = 255)
    @Column(name = "Product_Name")
    private String productName;
    @Column(name = "Product_Level")
    private Integer productLevel;
    @Size(max = 255)
    @Column(name = "Product_Attribute")
    private String productAttribute;
    @Size(max = 255)
    @Column(name = "Product_Type")
    private String productType;
    @Column(name = "Product_Attack_Points")
    private Integer productAttackPoints;
    @Column(name = "Product_Defense_Points")
    private Integer productDefensePoints;
    @Size(max = 5000)
    @Column(name = "Product_Description")
    private String productDescription;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Product_Img")
    private String productImg;
    @Column(name = "Product_Price")
    private Integer productPrice;
    @Column(name = "Product_Quantity")
    private Integer productQuantity;
    @OneToMany(mappedBy = "productCardNumberr")
    private Collection<OrderDetail> orderDetailCollection;

    public ProductDetail() {
    }

    public ProductDetail(String productCardNumber) {
        this.productCardNumber = productCardNumber;
    }

    public String getProductCardNumber() {
        return productCardNumber;
    }

    public void setProductCardNumber(String productCardNumber) {
        this.productCardNumber = productCardNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductDetail(String productCardNumber, String productName, String productDescription, String productImg, Integer productPrice) {
        this.productCardNumber = productCardNumber;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImg = productImg;
        this.productPrice = productPrice;
    }

    public Integer getProductLevel() {
        return productLevel;
    }

    public void setProductLevel(Integer productLevel) {
        this.productLevel = productLevel;
    }

    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getProductAttackPoints() {
        return productAttackPoints;
    }

    public void setProductAttackPoints(Integer productAttackPoints) {
        this.productAttackPoints = productAttackPoints;
    }

    public Integer getProductDefensePoints() {
        return productDefensePoints;
    }

    public void setProductDefensePoints(Integer productDefensePoints) {
        this.productDefensePoints = productDefensePoints;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    @XmlTransient
    public Collection<OrderDetail> getOrderDetailCollection() {
        return orderDetailCollection;
    }

    public void setOrderDetailCollection(Collection<OrderDetail> orderDetailCollection) {
        this.orderDetailCollection = orderDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCardNumber != null ? productCardNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDetail)) {
            return false;
        }
        ProductDetail other = (ProductDetail) object;
        if ((this.productCardNumber == null && other.productCardNumber != null) || (this.productCardNumber != null && !this.productCardNumber.equals(other.productCardNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.ProductDetail[ productCardNumber=" + productCardNumber + " ]";
    }

    @XmlTransient
    public Collection<Orderchitiet> getOrderchitietCollection() {
        return orderchitietCollection;
    }

    public void setOrderchitietCollection(Collection<Orderchitiet> orderchitietCollection) {
        this.orderchitietCollection = orderchitietCollection;
    }
    
}

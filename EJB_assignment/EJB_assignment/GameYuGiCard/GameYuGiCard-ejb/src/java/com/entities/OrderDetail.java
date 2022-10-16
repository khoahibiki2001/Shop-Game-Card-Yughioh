/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Order_Detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDetail.findAll", query = "SELECT o FROM OrderDetail o")
    , @NamedQuery(name = "OrderDetail.findByOrderID", query = "SELECT o FROM OrderDetail o WHERE o.orderID = :orderID")
    , @NamedQuery(name = "OrderDetail.findByOrderQuantity", query = "SELECT o FROM OrderDetail o WHERE o.orderQuantity = :orderQuantity")
    , @NamedQuery(name = "OrderDetail.findByOrderTotalPrices", query = "SELECT o FROM OrderDetail o WHERE o.orderTotalPrices = :orderTotalPrices")
    , @NamedQuery(name = "OrderDetail.findByDateDh", query = "SELECT o FROM OrderDetail o WHERE o.dateDh = :dateDh")})
public class OrderDetail implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oid")
    private Collection<Orderchitiet> orderchitietCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "OrderID")
    private String orderID;
    @Column(name = "Order_Quantity")
    private Integer orderQuantity;
    @Column(name = "Order_Total_Prices")
    private Integer orderTotalPrices;
    @Column(name = "date_dh")
    @Temporal(TemporalType.DATE)
    private Date dateDh;
    @JoinColumn(name = "CustomerIDd", referencedColumnName = "CustomerID")
    @ManyToOne
    private Customer customerIDd;
    @JoinColumn(name = "Product_Card_Numberr", referencedColumnName = "Product_Card_Number")
    @ManyToOne
    private ProductDetail productCardNumberr;

    public OrderDetail() {
    }

    public OrderDetail(String orderID) {
        this.orderID = orderID;
    }

    public OrderDetail(String selectID, Date ngaydh, int tong, Customer c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Integer getOrderTotalPrices() {
        return orderTotalPrices;
    }

    public void setOrderTotalPrices(Integer orderTotalPrices) {
        this.orderTotalPrices = orderTotalPrices;
    }

    public Date getDateDh() {
        return dateDh;
    }

    public void setDateDh(Date dateDh) {
        this.dateDh = dateDh;
    }

    public Customer getCustomerIDd() {
        return customerIDd;
    }

    public void setCustomerIDd(Customer customerIDd) {
        this.customerIDd = customerIDd;
    }

    public ProductDetail getProductCardNumberr() {
        return productCardNumberr;
    }

    public void setProductCardNumberr(ProductDetail productCardNumberr) {
        this.productCardNumberr = productCardNumberr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetail)) {
            return false;
        }
        OrderDetail other = (OrderDetail) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.OrderDetail[ orderID=" + orderID + " ]";
    }

    @XmlTransient
    public Collection<Orderchitiet> getOrderchitietCollection() {
        return orderchitietCollection;
    }

    public void setOrderchitietCollection(Collection<Orderchitiet> orderchitietCollection) {
        this.orderchitietCollection = orderchitietCollection;
    }
    
}

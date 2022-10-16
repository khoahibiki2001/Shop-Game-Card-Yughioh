/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerID", query = "SELECT c FROM Customer c WHERE c.customerID = :customerID")
    , @NamedQuery(name = "Customer.findByCustomerName", query = "SELECT c FROM Customer c WHERE c.customerName = :customerName")
    , @NamedQuery(name = "Customer.findByCustomerAddress", query = "SELECT c FROM Customer c WHERE c.customerAddress = :customerAddress")
    , @NamedQuery(name = "Customer.findByCutomerPhone", query = "SELECT c FROM Customer c WHERE c.cutomerPhone = :cutomerPhone")
    , @NamedQuery(name = "Customer.findByCustomerUserName", query = "SELECT c FROM Customer c WHERE c.customerUserName = :customerUserName")
    , @NamedQuery(name = "Customer.findByCustomerPassWord", query = "SELECT c FROM Customer c WHERE c.customerPassWord = :customerPassWord")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CustomerID")
    private String customerID;
    @Size(max = 255)
    @Column(name = "Customer_Name")
    private String customerName;
    @Size(max = 255)
    @Column(name = "Customer_Address")
    private String customerAddress;
    @Column(name = "Cutomer_Phone")
    private Integer cutomerPhone;
    @Size(max = 255)
    @Column(name = "Customer_UserName")
    private String customerUserName;
    @Size(max = 255)
    @Column(name = "Customer_PassWord")
    private String customerPassWord;
    @OneToMany(mappedBy = "customerIDd")
    private Collection<OrderDetail> orderDetailCollection;

    public Customer() {
    }

    public Customer(String customerID) {
        this.customerID = customerID;
    }

    public Customer(String customerID, String customerName, String customerAddress, Integer cutomerPhone, String customerUserName, String customerPassWord) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.cutomerPhone = cutomerPhone;
        this.customerUserName = customerUserName;
        this.customerPassWord = customerPassWord;
    }

  

   

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getCutomerPhone() {
        return cutomerPhone;
    }

    public void setCutomerPhone(Integer cutomerPhone) {
        this.cutomerPhone = cutomerPhone;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public String getCustomerPassWord() {
        return customerPassWord;
    }

    public void setCustomerPassWord(String customerPassWord) {
        this.customerPassWord = customerPassWord;
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
        hash += (customerID != null ? customerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerID == null && other.customerID != null) || (this.customerID != null && !this.customerID.equals(other.customerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Customer[ customerID=" + customerID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "Order_chitiet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderchitiet.findAll", query = "SELECT o FROM Orderchitiet o")
    , @NamedQuery(name = "Orderchitiet.findById", query = "SELECT o FROM Orderchitiet o WHERE o.id = :id")
    , @NamedQuery(name = "Orderchitiet.findBySoluong", query = "SELECT o FROM Orderchitiet o WHERE o.soluong = :soluong")
    , @NamedQuery(name = "Orderchitiet.findByThanhtien", query = "SELECT o FROM Orderchitiet o WHERE o.thanhtien = :thanhtien")})
public class Orderchitiet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "soluong")
    private int soluong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "thanhtien")
    private int thanhtien;
    @JoinColumn(name = "Oid", referencedColumnName = "OrderID")
    @ManyToOne(optional = false)
    private OrderDetail oid;
    @JoinColumn(name = "pd_Num", referencedColumnName = "Product_Card_Number")
    @ManyToOne(optional = false)
    private ProductDetail pdNum;

    public Orderchitiet() {
    }

    public Orderchitiet(String id) {
        this.id = id;
    }

    public Orderchitiet(String id, int soluong, int thanhtien) {
        this.id = id;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }

    public OrderDetail getOid() {
        return oid;
    }

    public void setOid(OrderDetail oid) {
        this.oid = oid;
    }

    public ProductDetail getPdNum() {
        return pdNum;
    }

    public void setPdNum(ProductDetail pdNum) {
        this.pdNum = pdNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderchitiet)) {
            return false;
        }
        Orderchitiet other = (Orderchitiet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Orderchitiet[ id=" + id + " ]";
    }
    
}

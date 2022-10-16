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
@Table(name = "Administrators")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrators.findAll", query = "SELECT a FROM Administrators a")
    , @NamedQuery(name = "Administrators.findByAdminUserName", query = "SELECT a FROM Administrators a WHERE a.adminUserName = :adminUserName")
    , @NamedQuery(name = "Administrators.findByAdminPassWord", query = "SELECT a FROM Administrators a WHERE a.adminPassWord = :adminPassWord")})
public class Administrators implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Admin_UserName")
    private String adminUserName;
    @Size(max = 255)
    @Column(name = "Admin_PassWord")
    private String adminPassWord;

    public Administrators() {
    }

    public Administrators(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminPassWord() {
        return adminPassWord;
    }

    public void setAdminPassWord(String adminPassWord) {
        this.adminPassWord = adminPassWord;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminUserName != null ? adminUserName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrators)) {
            return false;
        }
        Administrators other = (Administrators) object;
        if ((this.adminUserName == null && other.adminUserName != null) || (this.adminUserName != null && !this.adminUserName.equals(other.adminUserName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entities.Administrators[ adminUserName=" + adminUserName + " ]";
    }
    
}

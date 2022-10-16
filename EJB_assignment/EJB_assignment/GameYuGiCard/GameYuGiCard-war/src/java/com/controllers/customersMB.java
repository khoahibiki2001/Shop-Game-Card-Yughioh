/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.entities.Customer;
import com.entities.OrderDetail;
import com.sesionbeans.CustomerFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author HP
 */
@Named(value = "customersMB")
@RequestScoped
public class customersMB {

    @EJB
    private CustomerFacadeLocal customerFacade;

    private String customerID;
    private Customer cst = new Customer();
    private List<OrderDetail> listOrder = new ArrayList<>();

    private List<Customer> listKH = new ArrayList<>();

    private String cname = "";
    private String cemail = "";
    private String username = "";
    private String password = "";
   private int cphone;
    private String message = "";
    private String selectID ;
    private String i;
    private String SelectIDvarchar  ="KH001";
    

    public List<Customer> allKhachHang() {

        return customerFacade.findAll();
    }

    
     public String delete(String  id){
        Customer k = customerFacade.find(id);
        customerFacade.remove(k);
        return "ad-account";
    }

    
    public customersMB() {
    }

    public String CusID() {
        for (Customer ct : allKhachHang()) {
            i = ct.getCustomerID();
        }
        return i + 1;
    }

    
    
    public String find(){
        cst = customerFacade.find(SelectIDvarchar);
        //set form edit
//        cname = cst.getCustomerName();
//        cemail = cst.getCustomerAddress();
//        password = cst.getCustomerPassWord();
//        username = cst.getCustomerUserName();
//        cphone = cst.getCutomerPhone();
        
        return "ad-account_find";
    }
    
     public String add(){
        Customer kh = new Customer(CusID(),cname,cemail,cphone,username,password);
         try {

            Customer c1 = customerFacade.findbyUsername(username);

            if (c1.getCustomerName() != null) {
                message = "username da ton tai !!";
                return "ad-account";
            }else{}
        } catch (Exception e) {
            System.out.println("not find");
        }
//        String customerID, String customerName, String customerAddress, Integer cutomerPhone, String customerUserName, String customerPassWord) {
       
        customerFacade.create(kh);
        
        return "ad-account";
    }
        
    
    public String addCustomer() {

        try {

            Customer c1 = customerFacade.findbyUsername(username);

            if (c1.getCustomerName() != null) {
                message = "username da ton tai !!";
                return "signup";
            }
        } catch (Exception e) {
            System.out.println("not find");
        }
//        String customerID, String customerName, String customerAddress, Integer cutomerPhone, String customerUserName, String customerPassWord) {
        Customer kh = new Customer(CusID(),cname,cemail,cphone,username,password);
        customerFacade.create(kh);
        message = CusID() + "Đã đăng kí thành công!!";
        return "signup";
    }

    
    
     
    public List<OrderDetail> getListOrder() {
        return listOrder;
    }

    public void setListOrder(List<OrderDetail> listOrder) {
        this.listOrder = listOrder;
    }

    public List<Customer> getListKH() {
        return listKH;
    }

    public void setListKH(List<Customer> listKH) {
        this.listKH = listKH;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSelectID() {
        return selectID;
    }

    public void setSelectID(String selectID) {
        this.selectID = selectID;
    }

    public int getCphone() {
        return cphone;
    }

    public void setCphone(int cphone) {
        this.cphone = cphone;
    }

    public CustomerFacadeLocal getCustomerFacade() {
        return customerFacade;
    }

    public void setCustomerFacade(CustomerFacadeLocal customerFacade) {
        this.customerFacade = customerFacade;
    }

    public String getSelectIDvarchar() {
        return SelectIDvarchar;
    }

    public void setSelectIDvarchar(String SelectIDvarchar) {
        this.SelectIDvarchar = SelectIDvarchar;
    }

    public Customer getCst() {
        return cst;
    }

    public void setCst(Customer cst) {
        this.cst = cst;
    }

}

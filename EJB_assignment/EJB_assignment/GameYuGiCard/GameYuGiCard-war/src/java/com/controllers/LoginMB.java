/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.entities.Administrators;
import com.entities.Customer;
import com.sesionbeans.AdministratorsFacadeLocal;
import com.sesionbeans.CustomerFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
@Named(value = "loginMB")
@SessionScoped
public class LoginMB implements Serializable {

    @EJB
    private AdministratorsFacadeLocal administratorsFacade;

    @EJB
    private CustomerFacadeLocal customerFacade;

    private String username;
    private String password;
    private String message = "";

    public LoginMB() {
    }

    public void checkLogin(ComponentSystemEvent event) {

        FacesContext context = FacesContext.getCurrentInstance();

        NavigationHandler navigationHandler = context.getApplication().getNavigationHandler();
        if (username == null) {

            navigationHandler.handleNavigation(context, null, "login");
        }
    }

    public String Name() {

        try {

            Customer kh = customerFacade.findbyUsername(username);
            return kh.getCustomerName();
        } catch (Exception e) {
        }
        return null;
    }

    public String Login(){
        try {
             Customer kh = customerFacade.findbyUsername(username);
             if (kh.getCustomerPassWord().equals(password)) {
                 message = "Login successfully";
                 return "index";
            }
        } catch (Exception e) {
            
        }
        try {
            Administrators ad = administratorsFacade.findbyUsername(username);
             if (ad.getAdminPassWord().equals(password)) {
                 message = "Login successfully";
                 return "ad-products";
            }
        } catch (Exception e) {
            
        }
         message = "Ten dang nhap hoac mat khau Khong chinh xac!";
        return "login";
    }
    
    public String Loginn() {
                Customer kh = customerFacade.findbyUsername(username);

        if (username.equals("ad") && password.equals("123")) {

            message = "Login successfully";
            return "admin";
        } else {

            try {

                if ( kh.getCustomerPassWord().equals(password)) {
//kh.getCustomerUserName().equals(username)
                    return "customer";
                }
            } catch (Exception e) {
            }
//             Customer kh = customerFacade.findbyUsername(username);
//         String a =   kh.getCustomerUserName();
//            System.out.println(a);
           // message = "Ten dang nhap hoac mat khau Khong chinh xac!";
           message = "uname" + username + " - "+password;
           
        }

        return "login";
    }

    public String logout() {
        username = null;
        password = null;
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
        return "index";

    }

    public CustomerFacadeLocal getCustomerFacade() {
        return customerFacade;
    }

    public void setCustomerFacade(CustomerFacadeLocal customerFacade) {
        this.customerFacade = customerFacade;
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

}

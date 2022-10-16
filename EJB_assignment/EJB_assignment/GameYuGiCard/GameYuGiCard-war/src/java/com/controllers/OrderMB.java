/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.entities.Customer;
import com.entities.OrderDetail;
import com.sesionbeans.CustomerFacadeLocal;
import com.sesionbeans.OrderDetailFacadeLocal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author HP
 */
@Named(value = "orderMB")
@RequestScoped
public class OrderMB {

    @EJB
    private CustomerFacadeLocal customerFacade;

    @EJB
    private OrderDetailFacadeLocal orderDetailFacade;
    private String selectID = "";
    private String iddh;
    private String idkh;
    private Date ngaydh;
    private int tong;
    private String i;
    private OrderDetail dh = new OrderDetail();
    private Customer kh = new Customer();

    public OrderMB() {
    }

    public List<OrderDetail> allOrder() {
        return orderDetailFacade.findAll();

    }

    public String delete(String id) {
        orderDetailFacade.remove(orderDetailFacade.find(id));
        return "ad-orders";
    }

    private List<OrderDetail> listOrders = new ArrayList<>();

    public String idOrder() {

        for (OrderDetail ls : allOrder()) {
            i = ls.getOrderID();
        }

        return i + "*";
    }

//     public String find() {
//
//        pd = productDetailFacade.find(selectnumvarchar);
//        return "ad-products_find";
//    }
//    
    public String find() {
//    OrderDetail o = orderDetailFacade.find(selectID);
//    idkh = o.getCustomerIDd().getCustomerID();
//    ngaydh = o.getDateDh();
//    tong = o.getOrderTotalPrices();

        dh = orderDetailFacade.find(selectID);

        return "ad-ordersdetail";
    }

    public String add() {

        Customer c = customerFacade.find(idkh);
        OrderDetail o = new OrderDetail();
        o.setOrderID(idOrder());
        o.setCustomerIDd(c);
        o.setDateDh(ngaydh);
        o.setOrderTotalPrices(tong);
        orderDetailFacade.create(o);
        return "ad-orders";

    }

    public List<OrderDetail> getListOrders() {
        return listOrders;
    }

    public void setListOrders(List<OrderDetail> listOrders) {
        this.listOrders = listOrders;
    }

    public String edit() {

        Customer c = customerFacade.find(idkh);

        OrderDetail o = new OrderDetail(selectID, ngaydh, tong, c);
        orderDetailFacade.edit(o);

        return "ad-orders";
    }

    public String getSelectID() {
        return selectID;
    }

    public void setSelectID(String selectID) {
        this.selectID = selectID;
    }

    public String getIddh() {
        return iddh;
    }

    public void setIddh(String iddh) {
        this.iddh = iddh;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public Date getNgaydh() {
        return ngaydh;
    }

    public void setNgaydh(Date ngaydh) {
        this.ngaydh = ngaydh;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public OrderDetail getDh() {
        return dh;
    }

    public void setDh(OrderDetail dh) {
        this.dh = dh;
    }

    public Customer getKh() {
        return kh;
    }

    public void setKh(Customer kh) {
        this.kh = kh;
    }

}

package com.entities;

import com.entities.Customer;
import com.entities.Orderchitiet;
import com.entities.ProductDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-04T18:10:09")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Date> dateDh;
    public static volatile CollectionAttribute<OrderDetail, Orderchitiet> orderchitietCollection;
    public static volatile SingularAttribute<OrderDetail, String> orderID;
    public static volatile SingularAttribute<OrderDetail, ProductDetail> productCardNumberr;
    public static volatile SingularAttribute<OrderDetail, Integer> orderTotalPrices;
    public static volatile SingularAttribute<OrderDetail, Customer> customerIDd;
    public static volatile SingularAttribute<OrderDetail, Integer> orderQuantity;

}
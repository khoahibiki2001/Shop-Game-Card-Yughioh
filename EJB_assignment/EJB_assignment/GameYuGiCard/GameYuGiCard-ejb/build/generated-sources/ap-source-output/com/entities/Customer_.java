package com.entities;

import com.entities.OrderDetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-04T18:10:09")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> customerAddress;
    public static volatile SingularAttribute<Customer, Integer> cutomerPhone;
    public static volatile SingularAttribute<Customer, String> customerUserName;
    public static volatile CollectionAttribute<Customer, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<Customer, String> customerID;
    public static volatile SingularAttribute<Customer, String> customerPassWord;
    public static volatile SingularAttribute<Customer, String> customerName;

}
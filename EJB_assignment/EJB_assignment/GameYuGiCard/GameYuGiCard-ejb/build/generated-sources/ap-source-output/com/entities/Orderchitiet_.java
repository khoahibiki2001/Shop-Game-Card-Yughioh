package com.entities;

import com.entities.OrderDetail;
import com.entities.ProductDetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-04T18:10:09")
@StaticMetamodel(Orderchitiet.class)
public class Orderchitiet_ { 

    public static volatile SingularAttribute<Orderchitiet, Integer> thanhtien;
    public static volatile SingularAttribute<Orderchitiet, ProductDetail> pdNum;
    public static volatile SingularAttribute<Orderchitiet, String> id;
    public static volatile SingularAttribute<Orderchitiet, OrderDetail> oid;
    public static volatile SingularAttribute<Orderchitiet, Integer> soluong;

}
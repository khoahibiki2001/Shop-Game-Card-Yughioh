package com.entities;

import com.entities.OrderDetail;
import com.entities.Orderchitiet;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-04T18:10:09")
@StaticMetamodel(ProductDetail.class)
public class ProductDetail_ { 

    public static volatile CollectionAttribute<ProductDetail, OrderDetail> orderDetailCollection;
    public static volatile SingularAttribute<ProductDetail, String> productImg;
    public static volatile SingularAttribute<ProductDetail, Integer> productDefensePoints;
    public static volatile SingularAttribute<ProductDetail, String> productName;
    public static volatile SingularAttribute<ProductDetail, String> productAttribute;
    public static volatile SingularAttribute<ProductDetail, Integer> productQuantity;
    public static volatile SingularAttribute<ProductDetail, String> productCardNumber;
    public static volatile SingularAttribute<ProductDetail, Integer> productLevel;
    public static volatile CollectionAttribute<ProductDetail, Orderchitiet> orderchitietCollection;
    public static volatile SingularAttribute<ProductDetail, Integer> productAttackPoints;
    public static volatile SingularAttribute<ProductDetail, String> productType;
    public static volatile SingularAttribute<ProductDetail, String> productDescription;
    public static volatile SingularAttribute<ProductDetail, Integer> productPrice;

}
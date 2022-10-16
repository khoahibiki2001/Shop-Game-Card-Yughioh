/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbeans;

import com.entities.ProductDetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface ProductDetailFacadeLocal {

    void create(ProductDetail productDetail);

    void edit(ProductDetail productDetail);

    void remove(ProductDetail productDetail);

    ProductDetail find(Object id);

    List<ProductDetail> findAll();

    List<ProductDetail> findRange(int[] range);

    int count();
    
}

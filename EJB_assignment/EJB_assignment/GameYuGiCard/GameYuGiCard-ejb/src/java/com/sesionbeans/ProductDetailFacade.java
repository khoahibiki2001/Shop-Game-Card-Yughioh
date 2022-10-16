/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbeans;

import com.entities.ProductDetail;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class ProductDetailFacade extends AbstractFacade<ProductDetail> implements ProductDetailFacadeLocal {

    @PersistenceContext(unitName = "GameYuGiCard-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductDetailFacade() {
        super(ProductDetail.class);
    }
    
}

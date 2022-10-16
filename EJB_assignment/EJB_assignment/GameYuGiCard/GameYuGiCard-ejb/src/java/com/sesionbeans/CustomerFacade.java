/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbeans;

import com.entities.Customer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class CustomerFacade extends AbstractFacade<Customer> implements CustomerFacadeLocal {

    @PersistenceContext(unitName = "GameYuGiCard-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    @Override
    public Customer findbyUsername(String uname){
    
        Query q = em.createNamedQuery("Customer.findByCustomerUserName");
        q.setParameter("customerUserName", uname);
        return (Customer) q.getSingleResult();
    }

    public CustomerFacade() {
        super(Customer.class);
    }
    
}

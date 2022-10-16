/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbeans;

import com.entities.Administrators;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
@Stateless
public class AdministratorsFacade extends AbstractFacade<Administrators> implements AdministratorsFacadeLocal {

    @PersistenceContext(unitName = "GameYuGiCard-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministratorsFacade() {
        super(Administrators.class);
    }
    @Override
     public Administrators findbyUsername(String uname){
    
         Query q = em.createNamedQuery("Administrators.findByAdminUserName");
        q.setParameter("adminUserName", uname);
        return  (Administrators) q.getSingleResult();
    }
    
}

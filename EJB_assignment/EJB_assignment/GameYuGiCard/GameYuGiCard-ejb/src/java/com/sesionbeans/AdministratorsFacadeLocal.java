/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbeans;

import com.entities.Administrators;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface AdministratorsFacadeLocal {

    void create(Administrators administrators);

    void edit(Administrators administrators);

    void remove(Administrators administrators);

    Administrators find(Object id);

    List<Administrators> findAll();

    List<Administrators> findRange(int[] range);

    int count();

    public Administrators findbyUsername(String uname);
    
}

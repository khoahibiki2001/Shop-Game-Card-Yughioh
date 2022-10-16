/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbeans;

import com.entities.Orderchitiet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HP
 */
@Local
public interface OrderchitietFacadeLocal {

    void create(Orderchitiet orderchitiet);

    void edit(Orderchitiet orderchitiet);

    void remove(Orderchitiet orderchitiet);

    Orderchitiet find(Object id);

    List<Orderchitiet> findAll();

    List<Orderchitiet> findRange(int[] range);

    int count();
    
}

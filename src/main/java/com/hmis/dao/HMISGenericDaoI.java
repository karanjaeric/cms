/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmis.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author karanjaeric
 */
public interface HMISGenericDaoI<T, PK extends Serializable> {
    T save(T t);
    T findById(PK id);
    T merge(T t);
    List<T> findAll();
    boolean remove(T t);
}


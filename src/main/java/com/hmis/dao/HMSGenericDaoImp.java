/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmis.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

/**
 *
 * @author karanjaeric
 */
public class HMSGenericDaoImp<T, PK extends Serializable> implements HMISGenericDaoI<T, PK> {
    private Class<T> entityClass;
    private EntityManager entityManager;


    public HMSGenericDaoImp(Class<T> entityClass, EntityManager entityManager) {
        this.entityClass = entityClass;
        this.entityManager = entityManager;
        
    }

    public T save(T t) {
        try {
            this.entityManager.persist(t);
            return t;
        } catch (PersistenceException pe) {
           
            return null;
        }
    }

    public T findById(PK id) {
        try {
            return this.entityManager.find(entityClass, id);
        } catch (PersistenceException pe) {
            
            return null;
        }
    }

    public T merge(T t) {
        try {
            return this.entityManager.merge(t);
        }  catch (PersistenceException pe) {
            
            return null;
        }
    }

    public List<T> findAll() {
        return this.entityManager.createQuery("SELECT t FROM " + entityClass.getSimpleName() + " t").getResultList();
    }

    public boolean remove(T t) {
        try {
            t = this.entityManager.merge(t);
            this.entityManager.remove(t);
            return true;
        }  catch (PersistenceException pe) {
            
            return false;
        }
    }
}

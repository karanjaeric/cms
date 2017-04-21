/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmis.dao;

import com.hmis.hmis.Patient;
import javax.persistence.EntityManager;

/**
 *
 * @author karanjaeric
 */
public class ReceptionistDao extends HMSGenericDaoImp<Patient, Long> {
    public ReceptionistDao(EntityManager entityManager) {
        super(Patient.class, entityManager);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmis.beans;

import com.hmis.hmis.Patient;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.hmis.dao.*;


/**
 *
 * @author karanjaeric
 */
@Stateless(name="Receptionist")
public class ReceptionistBean implements ReceptionistI{
    @PersistenceContext(unitName = "MISPU")
    EntityManager em;

    @Override
    public boolean registerPatient(Patient patient) {
        ReceptionistDao receptionistDao=new ReceptionistDao(em);
        return receptionistDao.save(patient) !=null;
        
        
        
    }
    
}

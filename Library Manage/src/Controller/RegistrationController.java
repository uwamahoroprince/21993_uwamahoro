/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Registration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author prince
 */
public class RegistrationController {
    public void insert(Registration registration){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.save(registration);
    ss.getTransaction().commit();
    ss.close();
 } 
    public List<Registration> listrecords(){
         Session ss = NewHibernateUtil.getSessionFactory().openSession();
         Query q = ss.createQuery("from Registration");
         List<Registration> lst = q.list();
         ss.close();
         return lst;
     }
}


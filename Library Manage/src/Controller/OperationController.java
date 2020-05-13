/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import Model.Operations;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author prince
 */
public class OperationController {
       public void CreateOpe(Operations o) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(o);
        s.getTransaction().commit();
        s.close();
     
    }
    public List<Operations> findAll(){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
      Query q = s.createQuery("from Operations");
        List<Operations> li = q.list();
        s.close();
        return li;
    }
}

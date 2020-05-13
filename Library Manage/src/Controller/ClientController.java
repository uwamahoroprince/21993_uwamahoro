/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Client;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author prince
 */
public class ClientController {
    public void insert(Client client){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.save(client);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void update(Client client){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.update(client);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void delete(Client client){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.delete(client);
    ss.getTransaction().commit();
    ss.close();
 } 
  public List<Client> listClients(){
         Session ss = NewHibernateUtil.getSessionFactory().openSession();
         Query q = ss.createQuery("from Client");
         List<Client> lst = q.list();
         ss.close();
         return lst;
     }
  public Client findById(String id){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Client x = (Client) s.get(Client.class, id);
        s.close();
        return x;
    }
    
    public List<Client> findAll(){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Client a ");
        List<Client> list = q.list();
        s.close();
        return list;
    }
}

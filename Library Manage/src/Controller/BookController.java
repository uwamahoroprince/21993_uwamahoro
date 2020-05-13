/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author prince
 */
public class BookController {
    public void insert(Book book){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.save(book);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void update(Book book){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.update(book);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void delete(Book book){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.delete(book);
    ss.getTransaction().commit();
    ss.close();
 } 
  public List<Book> listBooks(){
         Session ss = NewHibernateUtil.getSessionFactory().openSession();
         Query q = ss.createQuery("from Book");
         List<Book> lst = q.list();
         ss.close();
         return lst;
     }
  public Book findById(String id){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Book x = (Book) s.get(Book.class, id);
        s.close();
        return x;
    }
    
    public List<Book> findAll(){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("SELECT a FROM Book a ");
        List<Book> list = q.list();
        s.close();
        return list;
}
}


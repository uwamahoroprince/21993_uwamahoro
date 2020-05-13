/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.NewHibernateUtil.getSessionFactory;
import Model.BookCategory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author prince
 */
public class BookCategoryController {
    public void insert(BookCategory bookcategory){
    Session ss = getSessionFactory().openSession();
    ss.beginTransaction();
    ss.save(bookcategory);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void update(BookCategory bookcategory){
    Session ss = getSessionFactory().openSession();
    ss.beginTransaction();
    ss.update(bookcategory);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void delete(BookCategory bookcategory){
    Session ss = getSessionFactory().openSession();
    ss.beginTransaction();
    ss.delete(bookcategory);
    ss.getTransaction().commit();
    ss.close();
 } 
  public List<BookCategory> listBookCategory(){
         Session ss = getSessionFactory().openSession();
         Query q = ss.createQuery("from BookCategory");
         List<BookCategory> lst = q.list();
         ss.close();
         return lst;
     }
}

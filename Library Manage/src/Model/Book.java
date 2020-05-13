/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author prince
 */
@Entity
@Table(name = "Book")
public class Book {
    @Id
  private String bookid; 
   private String title;
   private String pubhouse;
   private Date dateofpub;
   private String author;
   private int pages;
   private String bookcategories;

    public Book() {
    }

    public Book(String bookid, String title, String pubhouse, Date dateofpub, String author, int pages, String bookcategories) {
        this.bookid = bookid;
        this.title = title;
        this.pubhouse = pubhouse;
        this.dateofpub = dateofpub;
        this.author = author;
        this.pages = pages;
        this.bookcategories = bookcategories;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubhouse() {
        return pubhouse;
    }

    public void setPubhouse(String pubhouse) {
        this.pubhouse = pubhouse;
    }

    public Date getDateofpub() {
        return dateofpub;
    }

    public void setDateofpub(Date dateofpub) {
        this.dateofpub = dateofpub;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getBookcategories() {
        return bookcategories;
    }

    public void setBookcategories(String bookcategories) {
        this.bookcategories = bookcategories;
    }
    
}

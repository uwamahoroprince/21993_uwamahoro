/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author prince
 */
@Entity
public class Operations {
    @Id
    private String ClientId;
    private String Clientname;
    private String ClientPhoto;
    private String BookId;
    private String title;
    private String author;
    private String date;
    private String status;

    public Operations() {
    }

    public Operations(String ClientId, String Clientname, String ClientPhoto, String BookId, String title, String author, String date, String status) {
        this.ClientId = ClientId;
        this.Clientname = Clientname;
        this.ClientPhoto = ClientPhoto;
        this.BookId = BookId;
        this.title = title;
        this.author = author;
        this.date = date;
        this.status = status;
    }

    public String getClientPhoto() {
        return ClientPhoto;
    }

    public void setClientPhoto(String ClientPhoto) {
        this.ClientPhoto = ClientPhoto;
    }

 
    

    public String getClientId() {
        return ClientId;
    }

    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public String getClientname() {
        return Clientname;
    }

    public void setClientname(String Clientname) {
        this.Clientname = Clientname;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}

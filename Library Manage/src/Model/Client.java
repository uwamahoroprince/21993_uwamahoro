/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author prince
 */
@Entity
@Table(name= "Client")
public class Client {
    @Id
    private String regno;
    private String fname;
    private String lname;
    private int  phone;
    private String email;
    private ClientCategory clientCategory;
    private String photo; 

    public Client() {
    }

    public Client(String regno, String fname, String lname, int phone, String email, ClientCategory clientCategory, String photo) {
        this.regno = regno;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.email = email;
        this.clientCategory = clientCategory;
        this.photo = photo;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClientCategory getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(ClientCategory clientCategory) {
        this.clientCategory = clientCategory;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }    
}

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
@Table(name="Registration")
public class Registration {
@Id
 private String username;
 private String password;
 private String repassword;

    public Registration() {
    }

    public Registration(String username, String password, String repassword) {
        this.username = username;
        this.password = password;
        this.repassword = repassword;
        

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}

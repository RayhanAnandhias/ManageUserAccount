/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;
/**
 *
 * @author rayhan-andika
 */
@Document
public class User {
    @Id
    private String id;
    
    private String email;
    private String username;
    private String password;
    private String fullName;
    private List<String> listIdFollowers;
    private List<String> listIdFollowing;
    private List<Status> listStatus;
    private Date birthDate;
    private Date createdDate;

    public User() {}

    public User(String id, String email, String username, String password, 
            String fullName, Date birthDate, Date createdDate) {
        
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.createdDate = createdDate;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<String> getListIdFollowers() {
        return listIdFollowers;
    }

    public void setListIdFollowers(List<String> listIdFollowers) {
        this.listIdFollowers = listIdFollowers;
    }

    public List<String> getListIdFollowing() {
        return listIdFollowing;
    }

    public void setListIdFollowing(List<String> listIdFollowing) {
        this.listIdFollowing = listIdFollowing;
    }

    public List<Status> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<Status> listStatus) {
        this.listStatus = listStatus;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;
import java.util.List;

/**
 *
 * @author rayhan-andika
 */
@Document(collection = "status")
public class Status {
    @Id
    private String id;
    
    private String status;
    private String idUser;
    private List<String> listIdLikerUser;
    private List<Comment> listCommentar;

    public Status() {}

    public Status(String status, String idUser) {
        super();
        this.status = status;
        this.idUser = idUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public List<String> getListIdLikerUser() {
        return listIdLikerUser;
    }

    public void setListIdLikerUser(List<String> listIdLikerUser) {
        this.listIdLikerUser = listIdLikerUser;
    }

    public List<Comment> getListCommentar() {
        return listCommentar;
    }

    public void setListCommentar(List<Comment> listCommentar) {
        this.listCommentar = listCommentar;
    }
    
}

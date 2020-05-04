/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rayhan-andika
 */
public class Comment {
    private String idUserCommentator;
    private String comment;

    public Comment() {
    }
    
    public Comment(String idUserCommentator, String comment) {
        this.idUserCommentator = idUserCommentator;
        this.comment = comment;
    }

    public String getIdUserCommentator() {
        return idUserCommentator;
    }

    public void setIdUserCommentator(String idUserCommentator) {
        this.idUserCommentator = idUserCommentator;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

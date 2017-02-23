package com.noworder.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Lucas
 */
@Named(value = "switchFrame")
@RequestScoped
public class switchFrame {

    private String message;
    private int id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
        System.out.println(id);
    }

    private Integer userNumber = null;

    public void setUserNumber(Integer user_number) {
        userNumber = user_number;
    }

    public Integer getUserNumber() {
        return userNumber;
    }
}

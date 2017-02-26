package com.noworder.mb;

import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Lucas
 */
@Named(value = "switchFrame")
@RequestScoped
public class switchFrame {
    private int id;

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
    public String src(){
        if(id == 1 || getId() == 1){
            return "teste1";
        }else{
            return "teste2";
        }
    }

}

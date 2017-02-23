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

    private int id;

    public String src(){
        int num = getId();
        if(num == 1){
            return "Ok teste";
        }else{
            return "Erro no teste";
        }
                 
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println(id);
    }
}

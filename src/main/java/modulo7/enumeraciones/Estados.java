/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo7.enumeraciones;

public enum Estados {
    TODO("TO DO"), INPROGESS("IN PROGRESS"), DONE("DONE");
    
    private String status;
    
    private Estados(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
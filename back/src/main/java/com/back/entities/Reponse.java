package com.back.entities;

/**
 * Created by EVER on 16/05/2017.
 */
public class Reponse {

    private int idReponse;
    private String reponse;

    public Reponse(int idReponse, String reponse) {
        this.idReponse = idReponse;
        this.reponse = reponse;
    }

    public int getIdReponse() {
        return idReponse;
    }

    public void setIdReponse(int idReponse) {
        this.idReponse = idReponse;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}

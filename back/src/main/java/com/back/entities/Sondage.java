package com.back.entities;

import java.util.Date;

/**
 * Created by EVER on 16/05/2017.
 */
public class Sondage {

    private int idSondage;
    private String Titre;
    private String question;
    private Date dateFin;
    private Date dateDebut;

    public Sondage(int idSondage, String titre, String question, Date dateFin, Date dateDebut) {
        this.idSondage = idSondage;
        Titre = titre;
        this.question = question;
        this.dateFin = dateFin;
        this.dateDebut = dateDebut;
    }

    public Sondage(){}

    public int getIdSondage() {
        return idSondage;
    }

    public void setIdSondage(int idSondage) {
        this.idSondage = idSondage;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
}

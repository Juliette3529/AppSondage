package com.back.entities;

/**
 * Created by EVER on 16/05/2017.
 */
public class Utilisateur {

    private int idUtilisateur;

    private String pseudo;
    private String motDePasse;
    private Boolean isAdmin;

    public Utilisateur(int idUtilisateur, String pseudo, String motDePasse, Boolean isAdmin) {
        this.idUtilisateur = idUtilisateur;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.isAdmin = isAdmin;
    }

    //constructeur vide
    public Utilisateur(){}

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}

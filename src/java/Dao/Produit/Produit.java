/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.Produit;

/**
 *
 * @author SEND NUDES
 */
public class Produit {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }
    int id,quantite;
    String libelle,categorie;
    Float prix;
    
    
     
  public Produit(int id, String libelle,String categorie,Float prix,int quantite){
   this.id=id;
   this.libelle=libelle;
   this.categorie=categorie;
   this.prix=prix;
   this.quantite=quantite;
       
   } 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Dao.Produit.Produit;

/**
 *
 * @author SEND NUDES
 */
public class Panier {
    Produit produit;
    int quantite;
    
   public Panier(Produit p,int q){this.produit=p;this.quantite=q;};

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Dao.Produit.Produit;
import Dao.Client.Client;
import java.sql.ResultSet;

/**
 *
 * @author SEND NUDES
 */
public interface IDao {
    
   void ajouter(Produit produit,Client client);//selon parametre passer
   void modifier(Produit produit,Client client);
   void supprimer(int id);
   ResultSet afficher();
   ResultSet getById(int id);
    
}

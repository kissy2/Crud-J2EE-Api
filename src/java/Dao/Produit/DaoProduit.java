/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.Produit;

import Dao.Client.Client;
import Dao.IDao;
import Database.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author SEND NUDES
 */
public class DaoProduit implements IDao {
   Connection connection;
    
    public DaoProduit() {
        connection = DataBase.connection();
    }
    
    
    
    //Methode Afficher pour produit
    @Override
    public  ResultSet afficher(){
       
        
        try
       {
       Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from produit");
       
        return rs;
         } 
        catch (SQLException e) {
System.out.println(e.toString());  return null;  }
    }
    
    
    
    //Methode Ajouter pour produits
    @Override
    public void ajouter(Produit produit,Client client) {
   
try{        
PreparedStatement stmt   =connection.prepareStatement("insert into produit(id,libelle,categorie,prix,quantite_stk) values(?,?,?,?,?)");
stmt.setInt(1,produit.getId());
stmt.setString(2,produit.getLibelle());
stmt.setString(3,produit.getCategorie());
stmt.setFloat(4,produit.getPrix());
stmt.setInt(5,produit.getQuantite());
stmt.executeUpdate();
connection.close();
}
catch (SQLException e) {
System.out.println(e.toString()+"produit Invalide ou deja Existant");    }
    

    
    }
    ////Methode modifier pour produits
 
   @Override
    public void modifier(Produit produit,Client client) {
           
try{        
PreparedStatement stmt   =connection.prepareStatement("update produit set libelle=?,categorie=?,prix=?,quantite_stk=? where id=?");


stmt.setInt(5,produit.getId());
stmt.setString(1,produit.getLibelle());
stmt.setString(2,produit.getCategorie());
stmt.setFloat(3,produit.getPrix());
stmt.setInt(4,produit.getQuantite());
stmt.executeUpdate();


}
catch (SQLException e) {
System.out.println(e.toString()+"produit Introuvable ou données erronées");    }
        
    }

    
    
    
    //Methode Supprimer pour produit//
    
 @Override
    public void supprimer(int id) {
     
try{        
PreparedStatement stmt   =connection.prepareStatement("delete from produit where id=?");

stmt.setInt(1,id);
stmt.executeUpdate();


}
catch (SQLException e) {
System.out.println(e.toString()+"produit Introuvable ou données erronées");    }
       
    }

    
     
    
    @Override
    public  ResultSet getById(int id) {
     
try{         

   PreparedStatement stmt = connection.prepareStatement("select * from produit where id = ?");
stmt.setInt(1,id);
ResultSet rs = stmt.executeQuery();

return rs;

    }
catch (SQLException e) {
System.out.println(e.toString()+"produit Introuvable ou données erronées"); return null;   }
    


    }
}
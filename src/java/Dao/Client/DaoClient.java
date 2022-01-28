/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.Client;

import Dao.IDao;
import Dao.Produit.Produit;
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
public class DaoClient implements IDao{
      Connection connection;
    
    public DaoClient() {
        connection = DataBase.connection();
    }
 
    //Methode Afficher pour Client
    @Override
    public ResultSet afficher(){
       
        
        try
       {
       Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from client");
        
        return rs;
         } 
        catch (SQLException e) {
System.out.println(e.toString());  return null;  }
    }
    
    
    
    //Methode Ajouter pour Clients
  @Override
    public void ajouter(Produit produit,Client client) {
   
try{        
PreparedStatement stmt   =connection.prepareStatement("insert into client(id,nom,prenom,email,age,sexe,login,password,ncompte_bancaire,pays) values(?,?,?,?,?,?,?,?,?,?)");
stmt.setInt(1,client.getId());
stmt.setString(2,client.getNom());
stmt.setString(3,client.getPrenom());
stmt.setString(4,client.getEmail());
stmt.setInt(5,client.getAge());
stmt.setString(6,client.getSexe());
stmt.setString(7,client.getLogin());
stmt.setString(8,client.getPassword());
stmt.setString(9,client.getNcompte_bancaire());
stmt.setString(10,client.getPays());
stmt.executeUpdate();
connection.close();

}
catch (SQLException e) {
System.out.println(e.toString()+"Client Invalide ou deja Existant");    }
    

    
    }
    ////Methode modifier pour Clients
 
   @Override
    public void modifier(Produit produit,Client client) {
           
try{        
PreparedStatement stmt   =connection.prepareStatement("update client set nom=?,prenom=?,email=?,age=?,sexe=?,login=?,password=?,ncompte_bancaire=?,pays=? where id=?");

stmt.setInt(10,client.getId());
stmt.setString(1,client.getNom());
stmt.setString(2,client.getPrenom());
stmt.setString(3,client.getEmail());
stmt.setInt(4,client.getAge());
stmt.setString(5,client.getSexe());
stmt.setString(6,client.getLogin());
stmt.setString(7,client.getPassword());
stmt.setString(8,client.getNcompte_bancaire());
stmt.setString(9,client.getPays());
stmt.executeUpdate();


}
catch (SQLException e) {
System.out.println(e.toString()+"Client Introuvable ou données erronées");    }
        
    }

    
    
    
    //Methode Supprimer pour Client//
    
 @Override
    public void supprimer(int id) {
     
try{        
PreparedStatement stmt   =connection.prepareStatement("delete from client where id=?");

stmt.setInt(1,id);
stmt.executeUpdate();


}
catch (SQLException e) {
System.out.println(e.toString()+"Client Introuvable ou données erronées");    }
       
    }

    
     
    
    @Override
    public  ResultSet getById(int id) {
     
try{         

   PreparedStatement stmt = connection.prepareStatement("select * from client where id=?");
stmt.setInt(1,id);
ResultSet rs = stmt.executeQuery();

return rs;

    }
catch (SQLException e) {
System.out.println(e.toString()+"Client Introuvable ou données erronées"); return null;   }
    


    }
    
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.Client;

/**
 *
 * @author SEND NUDES
 */
public class Client { 
    int id,age;
    String nom,prenom,email,sexe,login,password,ncompte_bancaire,pays;
    
   public Client(int id,String nom,String prenom,String email,int age,String sexe,String login,String password,String ncompte_bancaire,String pays)
    {this.id=id;
    this.nom=nom;
    this.prenom=prenom;
    this.email=email;
    this.age=age;
    this.sexe=sexe;
    this.login=login;
    this.password=password;
    this.ncompte_bancaire=ncompte_bancaire;        
    this.pays=pays;       
            
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNcompte_bancaire() {
        return ncompte_bancaire;
    }

    public void setNcompte_bancaire(String ncompte_bancaire) {
        this.ncompte_bancaire = ncompte_bancaire;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    
}

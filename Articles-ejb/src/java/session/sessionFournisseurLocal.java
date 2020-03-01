/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Fournisseur;
import entity.type;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author adeline
 */
@Local
public interface sessionFournisseurLocal {

    void creerFournisseur(String nom, String adresse, type typ);

    Collection tousLesFournisseur();

    void creerVetement(String designation, double prix, String coloris, long num);

    void creerFraicheur(String designation, double prix, Date datelimite,  long num);

    void creerArticle(String designation, double prix,  long num);

    Collection afficherArticle(long num);

    double SommePrix(long id);

    Collection Touslesart();

    Fournisseur rechercherFourni(long id);

   
    
}

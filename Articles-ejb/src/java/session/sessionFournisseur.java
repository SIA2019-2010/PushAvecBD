/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Article;
import entity.ArticleFacade;
import entity.Fournisseur;
import entity.type;
import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import entity.FournisseurFacadeLocal;
import entity.FraicheurFacadeLocal;
import entity.VetementFacadeLocal;
import java.util.Date;


/**
 *
 * @author adeline
 */
@Stateless
public class sessionFournisseur implements sessionFournisseurLocal {

    @EJB
    private FraicheurFacadeLocal fraicheurFacade;

    @EJB
    private ArticleFacade articleFacade;

    @EJB
    private VetementFacadeLocal vetementFacade;

    @EJB
    private FournisseurFacadeLocal fournisseurFacade;
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void creerFournisseur(String nom, String adresse, type typ) {
        fournisseurFacade.CreerFournisseur(nom, adresse, typ);
    }
    

    @Override
    public Collection tousLesFournisseur() {
    Collection <Fournisseur> col = new ArrayList<Fournisseur> ();
    col =fournisseurFacade.TouslesFournisseurs(); 
        return col; 
        
    }

    @Override
    public void creerVetement(String designation, double prix, String coloris, long num) {
        Fournisseur  f= fournisseurFacade.rechercherFournisseur(num);
        vetementFacade.creerVetement(designation, prix, coloris, f);
    }

    @Override
    public void creerFraicheur(String designation, double prix, Date datelimite,   long num) {
        Fournisseur f = fournisseurFacade.rechercherFournisseur(num);
        fraicheurFacade.creerFraicheur(designation, prix, datelimite, f);
    }

    @Override
    public void creerArticle(String designation, double prix,  long num) {
        Fournisseur  f= fournisseurFacade.rechercherFournisseur(num);
        articleFacade.creerArticle(designation, prix, f);
    }

    @Override
    public Collection afficherArticle( long num ) {
        Collection <Article> a = new ArrayList<Article> (); 
        Fournisseur leFournisseur = fournisseurFacade.rechercherFournisseur(num);
       if (leFournisseur != null){
            a= articleFacade.afficherArticle(leFournisseur);
       }
       else {
           System.out.println("Le fournisseur n'existe pas");
       }
           return a; 
      
     
    }
    

    @Override
    public double SommePrix(long id) {
        double c = 0; 
        
        Fournisseur leFournisseur = fournisseurFacade.rechercherFournisseur(id);
        if (leFournisseur != null){
            c = fournisseurFacade.SommeArticle(id); 
        }
        else {
           System.out.println("Le fournisseur n'existe pas");
       }
        return c;
    }

    @Override
    public Collection Touslesart() {
        Collection <Article> a = new ArrayList<Article> (); 
         a= articleFacade.touslesart();
        return a;
    }

    @Override
    public Fournisseur rechercherFourni(long id) {
        Fournisseur leFournisseur = fournisseurFacade.rechercherFournisseur(id);
        return leFournisseur;
    }
    
    

    
    
    

}

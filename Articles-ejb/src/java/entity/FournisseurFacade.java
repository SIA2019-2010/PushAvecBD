/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Fournisseur;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author adeline
 */
@Stateless
public class FournisseurFacade extends AbstractFacade<Fournisseur> implements FournisseurFacadeLocal {

    @PersistenceContext(unitName = "Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FournisseurFacade() {
        super(Fournisseur.class);
    }

    @Override
    public void CreerFournisseur(String nom, String adresse,type typ) {
    Fournisseur f = new Fournisseur();
    f.setNom(nom);
    f.setAdresse(adresse);
    f.setTyp(typ);
    em.persist(f);
    }

    @Override
    public java.util.Collection<Fournisseur> TouslesFournisseurs() {
        List<Fournisseur> c; 
        String tx = "SELECT c FROM Fournisseur AS c "; 
        Query req = getEntityManager().createQuery(tx); 
        c = req.getResultList (); 
        return c;
    }

    @Override
    public Fournisseur rechercherFournisseur(long num) {
        Fournisseur result = null; 
        Query req = getEntityManager().createQuery("Select c from Fournisseur as c where c.id=:num"); 
        req.setParameter("num", num); 
        result = (Fournisseur) req.getSingleResult(); 
        return result;
    }

    @Override
    public Double SommeArticle(long n) {
        double c; 
        String tx= "SELECT sum(art.prix) FROM Fournisseur AS c , IN(c.articles)art WHERE c.id=:i"; 
        Query req = getEntityManager().createQuery(tx); 
        req = req.setParameter("i",n); 
        c=(Double)req.getSingleResult();
        return c;
    }
    
    
    
    
}

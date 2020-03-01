/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Collection;
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
public class ArticleFacade extends AbstractFacade<Article> {

    @PersistenceContext(unitName = "Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticleFacade() {
        super(Article.class);
    }

    public void creerArticle(String designation, double prix, Fournisseur leFournisseur) {
    Article a= new Article();
    a.setDesignation(designation);
    a.setPrix(prix);
    a.setLeFournisseur(leFournisseur);
    em.persist(a);
    }

    public Collection afficherArticle(Fournisseur lefournisseur) {
        List<Article> c; 
        String tx = "SELECT c FROM Article AS c where c.leFournisseur=:id"; 
        Query req = getEntityManager().createQuery(tx); 
        req.setParameter("id", lefournisseur); 
        c= req.getResultList (); 
        return c;
        
   
        
    }

    public Collection touslesart() {
        List<Article> c; 
        String tx = "SELECT c FROM Article AS c "; 
        Query req = getEntityManager().createQuery(tx); 
        c= req.getResultList (); 
        return c;
    }
    
    
    
}

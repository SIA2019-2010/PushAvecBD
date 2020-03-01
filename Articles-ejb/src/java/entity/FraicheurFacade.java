/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adeline
 */
@Stateless
public class FraicheurFacade extends AbstractFacade<Fraicheur> implements FraicheurFacadeLocal {

    @PersistenceContext(unitName = "Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FraicheurFacade() {
        super(Fraicheur.class);
    }

    @Override
    public void creerFraicheur(String designation, double prix, Date datelimite, Fournisseur leFournisseur) {
    Fraicheur f = new Fraicheur();
    f.setDesignation(designation);
    f.setPrix(prix);
    f.setDatelimite(datelimite);
    f.setLeFournisseur(leFournisseur);
    em.persist(f);
    }
    
}

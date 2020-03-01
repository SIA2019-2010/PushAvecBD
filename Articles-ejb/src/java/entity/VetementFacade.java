/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adeline
 */
@Stateless
public class VetementFacade extends AbstractFacade<Vetement> implements VetementFacadeLocal {

    @PersistenceContext(unitName = "Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VetementFacade() {
        super(Vetement.class);
    }

    @Override
    public void creerVetement(String designation, double prix, String coloris, Fournisseur leFournisseur) {
    Vetement v= new Vetement();
    v.setDesignation(designation);
    v.setPrix(prix);
    v.setColoris(coloris);
    v.setLeFournisseur(leFournisseur);
    em.persist(v);
    }
}

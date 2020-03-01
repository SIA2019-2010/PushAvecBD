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
 * @author 6170137
 */
@Stateless
public class NewEntityFacade extends AbstractFacade<NewEntity> implements NewEntityFacadeLocal {

    @PersistenceContext(unitName = "Articles-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NewEntityFacade() {
        super(NewEntity.class);
    }
    
}

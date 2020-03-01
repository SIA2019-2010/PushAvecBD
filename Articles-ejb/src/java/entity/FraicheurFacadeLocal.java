/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author adeline
 */
@Local
public interface FraicheurFacadeLocal {

    void create(Fraicheur fraicheur);

    void edit(Fraicheur fraicheur);

    void remove(Fraicheur fraicheur);

    Fraicheur find(Object id);

    List<Fraicheur> findAll();

    List<Fraicheur> findRange(int[] range);

    int count();

    void creerFraicheur(String designation, double prix, Date datelimite, Fournisseur leFournisseur);
    
}

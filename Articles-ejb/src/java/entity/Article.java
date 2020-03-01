/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 *
 * @author adeline
 */
@Entity
@Inheritance
(strategy = InheritanceType.TABLE_PER_CLASS)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Article[ id=" + id + " ]";
    }
    
    private String designation;

    /**
     * Get the value of designation
     *
     * @return the value of designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Set the value of designation
     *
     * @param designation new value of designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    private double prix;

    /**
     * Get the value of prix
     *
     * @return the value of prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Set the value of prix
     *
     * @param prix new value of prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
    

    @ManyToOne
    private Fournisseur leFournisseur;

    /**
     * Get the value of leFournisseur
     *
     * @return the value of leFournisseur
     */
    public Fournisseur getLeFournisseur() {
        return leFournisseur;
    }

    /**
     * Set the value of leFournisseur
     *
     * @param leFournisseur new value of leFournisseur
     */
    public void setLeFournisseur(Fournisseur leFournisseur) {
        this.leFournisseur = leFournisseur;
    }

}

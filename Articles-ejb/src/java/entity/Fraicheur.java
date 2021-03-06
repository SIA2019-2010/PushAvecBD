/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author adeline
 */
@Entity
@Inheritance
(strategy = InheritanceType.TABLE_PER_CLASS)
public class Fraicheur extends Article implements Serializable {

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

    private Date datelimite;

    /**
     * Get the value of datelimite
     *
     * @return the value of datelimite
     */
    public Date getDatelimite() {
        return datelimite;
    }

    /**
     * Set the value of datelimite
     *
     * @param datelimite new value of datelimite
     */
    public void setDatelimite(Date datelimite) {
        this.datelimite = datelimite;
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
        if (!(object instanceof Fraicheur)) {
            return false;
        }
        Fraicheur other = (Fraicheur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Fraicheur[ id=" + id + " ]";
    }
    
}

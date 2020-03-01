package entity;

import entity.Article;
import entity.type;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-03-01T20:30:10")
@StaticMetamodel(Fournisseur.class)
public class Fournisseur_ { 

    public static volatile SingularAttribute<Fournisseur, String> adresse;
    public static volatile SingularAttribute<Fournisseur, type> typ;
    public static volatile SingularAttribute<Fournisseur, Long> id;
    public static volatile ListAttribute<Fournisseur, Article> articles;
    public static volatile SingularAttribute<Fournisseur, String> nom;

}
package entity;

import entity.Fournisseur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2020-03-01T20:30:10")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, Double> prix;
    public static volatile SingularAttribute<Article, Fournisseur> leFournisseur;
    public static volatile SingularAttribute<Article, Long> id;
    public static volatile SingularAttribute<Article, String> designation;

}
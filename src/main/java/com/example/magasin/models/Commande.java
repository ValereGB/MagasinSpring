package com.example.magasin.models;



import java.util.Set;

import javax.persistence.*;


	
@Entity
@Table(name = "commande")
public class Commande {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero")
    private Integer numero;
    
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Produit> produits;


}

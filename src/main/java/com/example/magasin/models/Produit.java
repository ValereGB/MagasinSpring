package com.example.magasin.models;


import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "produit")
public class Produit {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "nom")
    private String nom;
	
	@Column(name = "prix")
    private Integer prix;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="commande_id", referencedColumnName = "id")
    private Commande commande;
	
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Categorie> categories;

	
}

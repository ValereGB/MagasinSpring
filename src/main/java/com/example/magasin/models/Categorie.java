package com.example.magasin.models;



import javax.persistence.*;



@Entity
@Table(name = "categorie")
public class Categorie {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;


}

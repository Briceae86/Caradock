package com.eql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "vehicule")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false)
    private String categorie;
    @Column(nullable = false)
    private String marque;
    @Column(nullable = false)
    private String famille;
    @Column(nullable = false)
    private String modele;
    @Column(nullable = false)
    private String type;
    @Column
    private String year;
    @Column
    private String vin;
    @Column
    private long voltage;


}

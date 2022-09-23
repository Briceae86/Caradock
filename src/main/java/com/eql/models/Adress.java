package com.eql.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "adresse")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    public String nomRue;
    @Column
    public long numRue;
    @Column
    public String nomVille;
    @Column
    public long codePostal;
}

package com.eql.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "placedeparking")
public class PlaceDeParking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String nbPlaceDeParking;
    @Column
    private LocalDate dateDeLibération;

}

package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "disfraz")
public class Costume {

    @Id
    @Column(name = "disfraz_nombre", nullable = false,unique = true)
    private String name;

    @Column(name="disfraz_precio",nullable = false)
    private double price;

    @OneToMany()
    @JoinColumn(name = "id_animador", nullable = false)
    List<Entreteiner> entreteiners ;
}

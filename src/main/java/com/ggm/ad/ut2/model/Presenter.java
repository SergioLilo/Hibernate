package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "presentador")
public class Presenter {

    @Column(name = "presentador_nombre", nullable = false)
    private String name;

    @Column(name = "presentador_apellido", nullable = false)
    private String lastName;
    @Id
    @Column(name = "presentador_dni", nullable = false,unique = true)
    private String dni;

    @Column(name = "presentador_anyo", nullable = false)
    private int year;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<Event> events;

}

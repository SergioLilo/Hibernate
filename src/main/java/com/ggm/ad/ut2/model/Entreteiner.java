package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "animador")
public class Entreteiner {
    @Column(name = "animador_nombre", nullable = false)
    private String firstName;

    @Column(name = "animador_apellido", nullable = false)
    private String lastName;

    @Id
    @Column(name = "animador_dni", unique = true, nullable = false)
    private String dni;

    @ManyToMany(mappedBy = "animador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Event> events;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Costume costume;

}


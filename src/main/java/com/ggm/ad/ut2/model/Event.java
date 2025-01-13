package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "evento")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "evento_nombre", nullable = false,unique = true)
    private String name;

    @Column(name = "evento_horario", nullable = false)
    private LocalDateTime schedule;

    @Column(name = "evento_descripcion", nullable = false)
    private String description;

    @Column(name = "evento_precio", nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "id_presentador", nullable = false)
    private Presenter presentador;

    @ManyToMany(mappedBy = "evento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Client> clients;

    @ManyToMany(mappedBy = "evento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Entreteiner> entreteiners;
}

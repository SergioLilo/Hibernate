package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contratos")
public class Contract {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ciudad_evento", nullable = false)
    private String ciudadEvento;


    @ManyToOne
    @JoinColumn(name = "id_evento", nullable = false)
    private Event event;


    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Client client;
}

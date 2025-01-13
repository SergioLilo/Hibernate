package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contratos")
public class Contract {

    @Column(name = "ciudad_evento", nullable = false)
    private String ciudadEvento;

    @ManyToOne
    @JoinColumn(name = "id_evento", nullable = false)
    private Event evento;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Client cliente;
}

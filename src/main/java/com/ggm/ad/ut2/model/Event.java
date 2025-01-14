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

    @OneToOne
    @JoinColumn(name = "id_presentador", nullable = false)
    private Presenter presentador;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Client> clients;

    @ManyToMany()
    @JoinTable(name="Participa",
    joinColumns = @JoinColumn(name="id_evento"),inverseJoinColumns = @JoinColumn(name="animador_id"))
    private List<Entreteiner> entreteiners;

    public void setEntreteiners(List<Entreteiner> entreteiners) {
        this.entreteiners = entreteiners;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setPresentador(Presenter presentador) {
        this.presentador = presentador;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

    public void setName(String name) {
        this.name = name;
    }
}

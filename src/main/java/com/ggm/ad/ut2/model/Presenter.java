package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "presentador")
public class Presenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "presentador_nombre", nullable = false)
    private String name;

    @Column(name = "presentador_apellido", nullable = false)
    private String lastName;

    @Column(name = "presentador_dni", nullable = false,unique = true)
    private String dni;

    @Column(name = "presentador_anyo", nullable = false)
    private int year;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<Event> events;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

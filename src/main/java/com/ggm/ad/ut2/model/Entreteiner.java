package com.ggm.ad.ut2.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

@Entity
@Table(name = "animador")
public class Entreteiner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "animador_nombre", nullable = false)
    private String firstName;

    @Column(name = "animador_apellido", nullable = false)
    private String lastName;


    @Column(name = "animador_dni", unique = true, nullable = false)
    private String dni;

    @ManyToMany()
    @JoinTable(name="Participa",
            joinColumns = @JoinColumn(name="animador_id"),inverseJoinColumns = @JoinColumn(name="id_evento"))
    private List<Event> event;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_disfraz", nullable = false)
    Costume costume;


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }



    public void setCostume(Costume costume) {
        this.costume = costume;
    }

    @Override
    public String toString() {
        return "Entreteiner{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni='" + dni + '\'' +
                ", event=" + event +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


package com.ggm.ad.ut2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes_particulares")
public class Particular extends Client {
    @Column(name = "nombre", nullable = false)
    private String firstName;

    @Column(name = "apellido", nullable = false)
    private String lastName;

    @Id
    @Column(name = "dni", unique = true, nullable = false)
    private String dni;


    @Override
    public String toString() {
        return "Particular{" + super.toString() +
                ", firstName='" + firstName + "', lastName='" + lastName + "', dni='" + dni + "'}";
    }
}

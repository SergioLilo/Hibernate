package com.ggm.ad.ut2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //herencia
@Table(name = "clientes")
public abstract class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "provincia", nullable = false)
    private String province;

    @Column(name = "telefono", nullable = false)
    private String phone;

    @Column(name = "calle", nullable = false)
    private String street;

    @Column(name = "municipio", nullable = false)
    private String municipality;

   @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contract> contratos;


    @Override
    public String toString() {
        return "Cliente{id=" + id + ", province='" + province + "', phone='" + phone +
                "', street='" + street + "', municipality='" + municipality + "'}";
    }
}

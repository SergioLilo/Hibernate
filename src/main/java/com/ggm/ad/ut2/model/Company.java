package com.ggm.ad.ut2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes_empresas")
public class Company extends Client {
    @Id
    @Column(name = "cif", unique = true, nullable = false)
    private String cif;

    @Column(name = "contacto", nullable = false)
    private String contactPerson;

    @Column(name = "nombre_empresa", nullable = false)
    private String name;


    @Override
    public String toString() {
        return "Empresa{" + super.toString() +
                ", taxId='" + cif + "', contactPerson='" + contactPerson + "', name='" + name + "'}";
    }
}

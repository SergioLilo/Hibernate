package com.ggm.ad.ut2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "disfraz")
public class Costume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "disfraz_nombre", nullable = false,unique = true)
    private String name;

    @Column(name="disfraz_precio",nullable = false)
    private double price;

    @OneToMany(mappedBy = "costume", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Entreteiner> entreteiners ;

    public void setName(String name) {
        this.name = name;
    }

    public void setEntreteiners(List<Entreteiner> entreteiners) {
        this.entreteiners = entreteiners;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Costume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", entreteiners=" + entreteiners +
                '}';
    }

}

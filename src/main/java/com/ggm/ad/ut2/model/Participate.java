package com.ggm.ad.ut2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "participar")
public class Participate {

    @ManyToMany
    @JoinColumn(name = "id_evento",nullable = false)
    Event event;

    @ManyToMany
    @JoinColumn(name = "id_animador",nullable = false)
    Entreteiner entertainer;
}



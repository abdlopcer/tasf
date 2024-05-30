package com.tasf.practica.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer folio;

        @OneToMany(cascade = CascadeType.ALL)
    private List<SalesDetail> details;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public List<SalesDetail> getDetails() {
        return details;
    }

    public void setDetails(List<SalesDetail> details) {
        this.details = details;
    }
}



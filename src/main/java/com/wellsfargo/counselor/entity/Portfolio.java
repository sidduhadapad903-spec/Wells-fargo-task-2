package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private LocalDate createdDate;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    // Default Constructor
    public Portfolio() {
    }

    // Constructor
    public Portfolio(String portfolioName, LocalDate createdDate,
                     Client client, List<Security> securities) {
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
        this.client = client;
        this.securities = securities;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Client getClient() {
        return client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    // Setters

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
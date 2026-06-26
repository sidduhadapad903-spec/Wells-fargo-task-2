package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    // Default Constructor
    public Security() {
    }

    // Constructor
    public Security(String securityName,
                    String category,
                    LocalDate purchaseDate,
                    Double purchasePrice,
                    Integer quantity,
                    Portfolio portfolio) {
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getSecurityName() {
        return securityName;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    // Setters

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
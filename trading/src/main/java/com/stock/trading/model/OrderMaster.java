package com.stock.trading.model;
import jakarta.persistence.*;


@Entity
@Table(name = "order_master")
public class OrderMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trade_id")
    private TradeDetails tradeDetails;

    private int quantity;

    @Column(name = "price_per_unit")
    private double pricePerUnit;

    private String status;

    // Constructors, Getters, Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

package com.stock.trading.model;


import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trade_details")
public class TradeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trade_date_time")
    private Date tradeDateTime;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "listing_price")
    private double listingPrice;

    private int quantity;

    private String type; // buy or sell

    @Column(name = "price_per_unit")
    private double pricePerUnit;

    // Constructors, Getters, Setters
}

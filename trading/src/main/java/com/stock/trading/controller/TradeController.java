package com.stock.trading.controller;

import com.stock.trading.model.TradeDetails;
import com.stock.trading.services.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trades")
@CrossOrigin(origins = "http://localhost:3000")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @GetMapping
    public List<TradeDetails> getAllTrades() {
        return tradeService.getAllTrades();
    }

    @PostMapping
    public TradeDetails addTrade(@RequestBody TradeDetails tradeDetails) {
        return tradeService.addTrade(tradeDetails);
    }

    @PutMapping
    public TradeDetails updateTrade(@RequestBody TradeDetails tradeDetails) {
        return tradeService.updateTrade(tradeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTrade(@PathVariable Long id) {
        tradeService.deleteTrade(id);
    }
}

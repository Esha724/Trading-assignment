package com.stock.trading.services;


import com.stock.trading.model.TradeDetails;
import com.stock.trading.repository.TradeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TradeService {

    @Autowired
    private TradeDetailsRepository tradeRepository;

    public List<TradeDetails> getAllTrades() {
        return tradeRepository.findAll();
    }

    public TradeDetails addTrade(TradeDetails tradeDetails) {
        return tradeRepository.save(tradeDetails);
    }

    public TradeDetails updateTrade(TradeDetails tradeDetails) {
        return tradeRepository.save(tradeDetails);
    }

    public void deleteTrade(Long id) {
        tradeRepository.deleteById(id);
    }
}

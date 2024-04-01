
package com.stock.trading.repository;



import com.stock.trading.model.TradeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeDetailsRepository extends JpaRepository<TradeDetails, Long> {
}

package coms.SportyShoes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import coms.SportyShoes.model.PurchaseOrder;



public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	
	

}

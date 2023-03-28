package coms.SportyShoes.service;

import java.util.List;

import coms.SportyShoes.model.PurchaseItem;
import coms.SportyShoes.model.PurchaseOrder;
import coms.SportyShoes.model.User;



public interface PurchaseItemService {

	public PurchaseItem getPurchaseItemById(Long id);

	public List<PurchaseItem> getAllItemsByPurchaseOrder(PurchaseOrder order);

	public List<PurchaseItem> getAllPurchaseItemByUserId(User userId);

	public PurchaseItem savePurchaseItem(PurchaseItem purchaseItem);

	public List<PurchaseItem> getAllPurchaseItemList();

}

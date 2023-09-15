package com.nt.service;

import java.util.Optional;

import com.nt.entity.Item_Dim;

public interface IDimOfItemService {
	
	public Item_Dim saveItem(Item_Dim itemInfo);
	
	public Iterable<Item_Dim> saveAllItem(Iterable<Item_Dim> itemList);
	
	public  Long itemRecodCount();
	
	public Optional<Item_Dim> findItemByID(Integer wmItemNbr);
	
	public Iterable<Item_Dim> findAllItemDetails();
	public boolean isItemExist(Integer itemId);
	
	public String deleteItemById(Integer item);
	
	public String deleteAllById(Iterable<Integer> listOfItem);

}

package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Item_Dim;
import com.nt.repo.IDimentionOfItem;

@Service("ItemDimSercviceMngmt")
public class ItemDimServiceImpl implements IDimOfItemService {
	@Autowired
	IDimentionOfItem ItemRepo;

	@Override
	public Item_Dim saveItem(Item_Dim itemInfo) {

		Item_Dim item = null;
		if (itemInfo != null) {
			item = ItemRepo.save(itemInfo);
		}

		return null;
	}

	@Override
	public Iterable<Item_Dim> saveAllItem(Iterable<Item_Dim> itemList) {
		if (((List<Item_Dim>) itemList).size()!=0) 
			return ItemRepo.saveAll(itemList);
			else
			throw new IllegalArgumentException("batch insertion not done");
		
	}

	@Override
	public Long itemRecodCount() {
		
		return ItemRepo.count();
		
	}

	@Override
	public Optional<Item_Dim> findItemByID(Integer wmItemNbr) {
		
	
		return 	ItemRepo.findById(wmItemNbr);
	
	}

	@Override
	public Iterable<Item_Dim> findAllItemDetails() {
		
		return ItemRepo.findAll();
	}

	@Override
	public boolean isItemExist(Integer itemId) {
		
		return ItemRepo.existsById(itemId);
	}

	@Override
	public String deleteItemById(Integer item) {
		Optional<Item_Dim> itm =ItemRepo.findById(item);
		if(itm.isPresent()) {
			ItemRepo.deleteById(item);
			return "Item details is deleted for the item id "+item;
		}
		return "provided item id is incorrect";
	}

	@Override
	public String deleteAllById(Iterable<Integer> listOfItem) {
	      Iterable<Item_Dim> itemList=ItemRepo.findAllById(listOfItem);
	      
	      if(((List<Item_Dim>)itemList).size()!=0) {
	    	  ItemRepo.deleteAllById(listOfItem);
	    	  return "All details are deleted having count "+((List<Item_Dim>)itemList).size();
	      }
	      return "any of the value did't perent in the db";
	}

}

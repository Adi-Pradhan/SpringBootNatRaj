package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ItemDimServiceImpl;
@Component
public class ItemDimRunner implements CommandLineRunner {

	@Autowired
	ItemDimServiceImpl itemServ;
	@Override
	public void run(String... args) throws Exception {
		
		
		try {
			
//		    Item_Dim ite=new Item_Dim(2353958,45,"Studymateria","CourseMaterial","IND","I");
//		   System.out.println( itemServ.saveItem(ite));
		   
//		  Iterable<Item_Dim> listOfItem= itemServ.saveAllItem(List.of(new Item_Dim(2351258,25,"Qwert","lkjd","IND","U"),new Item_Dim(898776,95,"materia","Course","IND","D"),
//				   new Item_Dim(2353958,65,"teria","Coursrial","IND","I"),
//				   new Item_Dim(29123458,45,"Stua","Col","IND","D")));
//		  listOfItem.forEach(item ->{
//			 System.out.println("Item got registred"+ item); 
//		  });
//		   System.out.println( itemServ.itemRecodCount());
//			System.out.println(itemServ.findItemByID(5));
			
//			itemServ.findAllItemDetails().forEach(Item->
//			System.out.println(Item));;
			
//			System.out.println(itemServ.isItemExist(5));
//		System.out.println(	itemServ.deleteItemById(54));
			
			System.out.println(itemServ.deleteAllById(List.of(102,103,104)));
		}
		catch(Exception e) {
			e.fillInStackTrace();
		}
	}

}

package com.example.test1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ShoppingCart {
	ShoppingCartService cartService;

	public void setCalcService(ShoppingCartService calcService) {
		this.cartService = calcService;
	}
ArrayList<Items> items;

public ShoppingCart(){
 items = new ArrayList<Items>();
 
}

private void add(Items item) {
 this.cartService.add(item);
}

public double getTotal() {
	double total = 0;
	for(Items item: items){
	    total += item.getTotal();
	 }
	
	return total;
}

private void remove(Items item)
{
	this.cartService.remove(item);
}

public int getTotalItems() {
 return items.size();
}

public Boolean doesContain(Items itemName) {
 return items.contains(itemName);
}

public Double addToCart(Items addeditem) {
 double total = 0;
 
 for(Items item: items){
     if(item.getName().equals(addeditem.getName())){
    	  total = item.getTotal() + addeditem.getPrice();
         item.setTotal(total); 
     }else {
       this.add(addeditem);
     }
 }
 return this.getTotal();
}

  public Double removeToCart(Items removedItem) {
	
	  for(Items item: items){
	      if(item.getName().equals(removedItem.getName())){
	     	  this.remove(removedItem);
	      }else {
	       throw new Error("item not found");
	      }
	  }
	  return this.getTotal();
  }


}
package com.data_acess;

public interface Pesistable {
	
	void addGift(Gift gift);
	Gift getGift(String name);
	void removeGift(String name);

}

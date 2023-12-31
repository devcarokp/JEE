package com.linkedin;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/* Session Bean implementation class Catalog */
@Stateless
@LocalBean
public class Catalog implements CatalogLocal {

	private List<CatalogItem> items = new ArrayList<>();
	
    public Catalog() {
    }

	@Override
	public List<CatalogItem> getItems() {
		return this.items;
	}

	@Override
	public void addItem(CatalogItem item) {
		this.items.add(item);
	}

}

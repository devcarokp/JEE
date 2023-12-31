package com.linkedin.jsf;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LocalInventoryService implements InventoryService {

	private Map<Long, InventoryItem> items = new HashMap<>();
	
	@Override
	public void createItem(Long catalogItemId, String name) {
		long inventoryItemId = items.size() + 1;
		this.items.put(inventoryItemId,new InventoryItem(inventoryItemId, catalogItemId, name, 0L));
		this.printInventory();
	}

	private void printInventory() {
		System.out.println("Local inventory contains: ");
		for( Entry<Long, InventoryItem> entry : this.items.entrySet() ) {
			System.out.println(entry.getValue().getName());
		}
	}

	@Override
	public Long getQuantity(Long catalogItemId) {
		return 0L;
	}
}
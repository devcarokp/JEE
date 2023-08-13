package com.linkedin;

import java.time.LocalDate;

public class CatalogItem {
	
	private String name;
	private String manufacturer;
	private LocalDate availableDate;
	private String description;
	private Long itemId;
	
	public CatalogItem() {
		super();
	}
	public CatalogItem(String name, String manufacturer, LocalDate availableDate, String description,
			Long itemId) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.availableDate = availableDate;
		this.description = description;
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public LocalDate getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(LocalDate availableDate) {
		this.availableDate = availableDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	@Override
	public String toString() {
		return "CatalogItem [name=" + name + ", manufacturer=" + manufacturer + ", availableDate=" + availableDate
				+ ", description=" + description + ", itemId=" + itemId + "]";
	}	

	
}

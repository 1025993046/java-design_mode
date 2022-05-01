package com.patterns.behavioralPattern.command;

import java.util.ArrayList;

public class Menu{

	private ArrayList<MenuItem> menuItemList;
	
	public void addMenuItem(MenuItem menuItem) {
		if(this.menuItemList == null)
			this.menuItemList = new ArrayList<>();
		this.menuItemList.add(menuItem);
	}
	public MenuItem getMenuItem(String menuItemName) {
		if(this.menuItemList != null)
			for(MenuItem item : this.menuItemList)
				if(item.getMenuItemName().equals(menuItemName))
					return item;
		return null;
	}
}

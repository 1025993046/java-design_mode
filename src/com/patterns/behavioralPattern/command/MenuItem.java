package com.patterns.behavioralPattern.command;

public class MenuItem {
	
	private Command command;
	private String menuItemName;

	public MenuItem(Command command, String menuItemName) {
		this.command = command;
		this.menuItemName = menuItemName;
	}
	public void click() {
		System.out.println("MenuItem " + this.menuItemName + " clicked!");
		this.command.execute();
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public String getMenuItemName() {
		return menuItemName;
	}
	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}
}

package 实验三.命令模式;

public class CommandTest {
	public static void main(String[] args) {
		BoardScreen boardScreen = new BoardScreen();
		Menu menu = new Menu();
		
		Command editCommand = new EditCommand(boardScreen);
		Command openCommand = new OpenCommand(boardScreen);
		Command createCommand = new CreateCommand(boardScreen);
		
		MenuItem editItem = new MenuItem(editCommand, "edit");
		MenuItem openItem = new MenuItem(openCommand, "open");
		MenuItem createItem = new MenuItem(createCommand, "create");
		
		menu.addMenuItem(editItem);
		menu.addMenuItem(openItem);
		menu.addMenuItem(createItem);

		menu.getMenuItem("create").click();
		menu.getMenuItem("open").click();
		menu.getMenuItem("edit").click();
	}
}

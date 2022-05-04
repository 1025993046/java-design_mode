package 实验三.命令模式;

public class EditCommand implements Command {

	private BoardScreen boardScreen;
	
	public EditCommand(BoardScreen boardScreen) {
		this.boardScreen = boardScreen;
	}

	@Override
	public void execute() {
		this.boardScreen.edit();
	}

}

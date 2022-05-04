package 实验三.命令模式;

public class OpenCommand implements Command {
	private BoardScreen boardScreen;
	
	public OpenCommand(BoardScreen boardScreen) {
		this.boardScreen = boardScreen;
	}

	@Override
	public void execute() {
		this.boardScreen.open();
	}
}

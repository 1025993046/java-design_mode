package com.patterns.behavioralPattern.command;

public class CreateCommand implements Command{
	private BoardScreen boardScreen;
	
	public CreateCommand(BoardScreen boardScreen) {
		this.boardScreen = boardScreen;
	}

	@Override
	public void execute() {
		this.boardScreen.create();
	}
}

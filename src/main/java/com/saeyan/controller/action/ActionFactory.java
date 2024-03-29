package com.saeyan.controller.action;

public class ActionFactory {

	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
							//board_list
	public Action getAction(String command) {
		Action action = null;
		
		System.out.println("ActionFactory : " + command);
		//조건식 나열 --> action 구현 클래스 
		if (command.equals("board_list")) {
			action = new BoardListAction();
		} else if(command.equals("board_write_form")) {
			action = new BoardWriteActionForm();
		} else if(command.equals("board_write")) {
			action = new BoardWriteAction();
		} else if(command.equals("board_view")) {
			action = new BoardViewAction();
		}
		
		return action;
	}
	
}

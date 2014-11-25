package com.istic.calc.command;

import com.istic.calc.command.Command;

/**
 * Design pattern command for Add. <br>
 * Calc @see DivCommand
 * @author smed
 *
 */
public class AddCommand implements Command {

	private int parameter;
	private int parameter2;
	
	/**
	 * 
	 * @param a
	 * @param b
	 */
	public AddCommand(int a, int b) {
		this.parameter = a;
		this.parameter2 = b;

	}

	@Override
	public int execute() {
		return parameter + parameter2;
	}

}

package com.istic.calc.command;
import com.istic.calc.command.Command;

public class MulCommand implements Command
{
	private int parameter;
	private int parameter2;
	
	public MulCommand(int a, int b){
		this.parameter=a;
		this.parameter2=b;
		
	}

	public int execute() {
		return parameter*parameter2;
	}
	
}


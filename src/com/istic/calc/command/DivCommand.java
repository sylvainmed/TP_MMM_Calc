package com.istic.calc.command;

import com.istic.calc.command.Command;

public class DivCommand implements Command
{
	private int parameter;
	private int parameter2;
	
	public DivCommand(int a, int b){
		this.parameter=a;
		this.parameter2=b;
		
	}

	public int execute() {
			// if(parameter2==0) {throw new Exception(System.out.println("Division par zéro !");)}
			 //else {
			    return parameter/parameter2;
			  //} 
			  
	}
	
}


package com.istic.calc.command;
import com.istic.calc.command.Command;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class SubCommand implements Command
{
	private int parameter;
	private int parameter2;
	
	public SubCommand(int a, int b){
		this.parameter=a;
		this.parameter2=b;
		
	}

	public int execute() {
		return parameter-parameter2;
	}
}


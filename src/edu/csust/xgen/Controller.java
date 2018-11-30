package edu.csust.xgen;

import java.math.BigDecimal;

import edu.csust.xgen.BtnListener.Callback;

public class Controller implements Callback {
	Model m = new Model();

	public Controller(){
		
	}
	
	public Controller(Model m){
		this.m = m;
	}
	

	@Override
	public void setFirstNum(BigDecimal firstNum) {
		m.setfirstNum(firstNum);
		
	}
	public static void main(String[] args) {
		Model m2 = new Model();
		BigDecimal bd = m2.getfirstNum();
	
	}

	
	
}

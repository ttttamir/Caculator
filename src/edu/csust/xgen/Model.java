package edu.csust.xgen;

import java.math.BigDecimal;
import java.math.MathContext;

public class Model {

	/**
	 * 数字
	 */
	BigDecimal initNum = new BigDecimal(0);
	BigDecimal currentNum = new BigDecimal(0);
	BigDecimal firstNum;
	BigDecimal secondNum;
	BigDecimal resultNum;
	BigDecimal one = new BigDecimal(1);

	/**
	 * 输入第一个数
	 * 
	 * @param firstNum
	 */
	public void setfirstNum(BigDecimal firstNum) {
		this.firstNum = firstNum;
	}

	public BigDecimal getfirstNum() {
		return firstNum;
	}

	/**
	 * 加法 被加数
	 * 
	 * @param secondNum
	 */
	public void add(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.add(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * 减法 被减数
	 * 
	 * @param secondNum
	 */
	public void subtract(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.subtract(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * 乘法 被乘数
	 * 
	 * @param secondNum
	 */
	public void multiply(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.multiply(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * 除法 被除数
	 * 
	 * @param secondNum
	 */
	public void divide(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.divide(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * 取余 被取余数
	 * 
	 * @param secondNum
	 */
	public void remainder(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.remainder(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * 平方
	 */
	public void mysMutiply() {
		resultNum = firstNum.multiply(firstNum, MathContext.DECIMAL32);
	}

	/**
	 * 倒数
	 */
	public void reversed() {
		BigDecimal one = new BigDecimal(1);
		resultNum = one.divide(firstNum, MathContext.DECIMAL32);
	}

}

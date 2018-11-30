package edu.csust.xgen;

import java.math.BigDecimal;
import java.math.MathContext;

public class Model {

	/**
	 * ����
	 */
	BigDecimal initNum = new BigDecimal(0);
	BigDecimal currentNum = new BigDecimal(0);
	BigDecimal firstNum;
	BigDecimal secondNum;
	BigDecimal resultNum;
	BigDecimal one = new BigDecimal(1);

	/**
	 * �����һ����
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
	 * �ӷ� ������
	 * 
	 * @param secondNum
	 */
	public void add(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.add(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * ���� ������
	 * 
	 * @param secondNum
	 */
	public void subtract(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.subtract(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * �˷� ������
	 * 
	 * @param secondNum
	 */
	public void multiply(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.multiply(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * ���� ������
	 * 
	 * @param secondNum
	 */
	public void divide(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.divide(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * ȡ�� ��ȡ����
	 * 
	 * @param secondNum
	 */
	public void remainder(BigDecimal secondNum) {
		this.secondNum = secondNum;
		resultNum = firstNum.remainder(secondNum, MathContext.DECIMAL32);
	}

	/**
	 * ƽ��
	 */
	public void mysMutiply() {
		resultNum = firstNum.multiply(firstNum, MathContext.DECIMAL32);
	}

	/**
	 * ����
	 */
	public void reversed() {
		BigDecimal one = new BigDecimal(1);
		resultNum = one.divide(firstNum, MathContext.DECIMAL32);
	}

}

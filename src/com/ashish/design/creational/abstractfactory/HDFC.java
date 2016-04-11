/**
 * 
 */
package com.ashish.design.creational.abstractfactory;

/**
 * @author agupt40
 *
 */

class HDFC implements Bank {
	private final String BNAME;

	public HDFC() {
		BNAME = "HDFC BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}
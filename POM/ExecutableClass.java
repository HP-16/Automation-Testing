package org.pom;

public class ExecutableClass extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		hitUrl("https://www.amazon.in/");
		POM p = new POM();
		sendValues(p.getSearchBox(), "iphone");
		btnClk(p.getbtnClick());
		btnClk(p.getitemClick());
	}
}

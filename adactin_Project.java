package Abc_Tech.Maven_Project;

import java.io.IOException;

public class adactin_Project extends Reuseable_Method {

	public static void main(String[] args) throws Throwable, IOException {

		browser_Launch("chrome");
		page_Object_Model pom = new page_Object_Model(driver);

		get("http://adactinhotelapp.com/index.php");
		maximize_The_Window();
		hold();

		sendKeys(pom.getUser_name(), "naveenkumar1234");
		sendKeys(pom.getPassword(), "naveen@1234");
		click(pom.getLogin());

		drop_Down(pom.getLocation(), "visibletext", "Paris");
		drop_Down(pom.getHotels(), "visibletext", "Hotel Hervey");
		drop_Down(pom.getRoom_Type(), "visibletext", "Super Deluxe");
		drop_Down(pom.getRoom_No(), "index", "2");

		hold();

		clear(pom.getCheck_In());
		sendKeys(pom.getCheck_In(), "09/12/2022");
		clear(pom.getCheck_Out());
		sendKeys(pom.getCheck_Out(), "10/12/2022");

		drop_Down(pom.getAdult_Room(), "index", "2");
		drop_Down(pom.getChild_Room(), "index", "1");

		takeScreenShot("project");

		click(pom.getSearch());
		click(pom.getSelect());
		hold();
		takeScreenShot("project2");
		click(pom.getContinue());

		sendKeys(pom.getFirst_Name(), "Naveen");
		sendKeys(pom.getLast_Name(), "kumar");
		sendKeys(pom.getAdress(), "No.10,Anna nagar,chenni-600000.");
		sendKeys(pom.getCard_Num(), "1234567890123456");
		drop_Down(pom.getCard_Type(), "visibletext", "VISA");
		drop_Down(pom.getExp_Month(), "index", "7");
		drop_Down(pom.getExp_Year(), "visibletext", "2022");
		sendKeys(pom.getCVV(), "123");

		hold();

		takeScreenShot("project3");
		click(pom.getBook_Now());

		hold();

		takeScreenShot("project4");

		click(pom.getLog_Out());

	}

}

package ZeynepDinc.WebsiteCreaterByAutomatical;

import org.sikuli.api.robot.Key;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class Automation extends Base {
	String metin="<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
			"  <meta charset=\"utf-8\">\r\n" + 
			"  <title>Welcome</title>\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
			"  <!--header -->\r\n" + 
			"<div class=\"fixed-top container-fluied\">\r\n" + 
			"  <nav class=\"navbar fixed-top\" style=\"background-color: #ffffff;margin:0px 25px;padding: 10px 10px;\">\r\n" + 
			"     <a class=\"nav-item nav-link active\" href=\"#about\">About</a>\r\n" + 
			"     <a class=\"nav-item nav-link\" href=\"#experince\">Experince</a>\r\n" + 
			"     <a class=\"nav-item nav-link\" href=\"#project\">Project</a>\r\n" + 
			"     <a class=\"nav-item nav-link\" href=\"#\">Hobby</a>\r\n" + 
			"       <a class=\"nav-item nav-link disabled\" href=\"#\">Contact</a>\r\n" + 
			"  </nav>\r\n" + 
			"</div>\r\n" + 
			"  <!--Gövde About  -->\r\n" + 
			"<div class=\"container-fluied\" id=\"about\">\r\n" + 
			"   <div class=\"jumbotron\" style=\"height: 100%;\"> ";
	@Test
	public void AutomatiOnWebSite() throws FindFailed, InterruptedException {
		System.out.println(System.getProperty("user.dir")+"\\img\\" + "element" + ".png");
	//	rightClick("aracCubugu");
		click("eclipse");
		rightClick("masaustu");
//		bekle(600);
		for (int i = 0; i < 3; i++) {
			type(Key.UP);
		}
		type(Key.RIGHT);
		type(Key.ENTER);
		paste("Otomasyon Web");
		type(Key.ENTER);
		type(Key.ENTER);
		click("aramaCubugu");
		paste("Sublime");
		type(Key.ENTER);
		bekle(5000);
		type(Key.ALT);
		type(Key.ENTER);
		type(Key.ENTER);
		bekle(5000);
		paste(metin);
		type(Key.ALT);
		type(Key.ENTER);
		for(int i=0;i<6;i++) {
			type(Key.DOWN);
		}
		type(Key.ENTER);
		paste("Home");
		type(Key.ENTER);
	}
}

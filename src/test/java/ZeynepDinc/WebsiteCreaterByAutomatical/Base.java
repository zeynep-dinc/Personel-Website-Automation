package ZeynepDinc.WebsiteCreaterByAutomatical;

import javax.swing.plaf.synth.Region;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Base {
	ScreenImage s;
	Region r;
	Screen s1=new Screen();
	
	public String dosyaYolu(String clickImage) {
		return System.getProperty("user.dir")+"\\img\\" + clickImage + ".png";
	}
	public void bekle(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	public void click(String clickImage) {
		try {
			s1.click(dosyaYolu(clickImage));
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doubleClick(String clickImage) {
		try {
			s1.doubleClick(dosyaYolu(clickImage));
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void rightClick(String clickImage) {
		try {
			s1.rightClick(dosyaYolu(clickImage));
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void paste(String text) {
		s1.paste(text);
	}

	public void type(String text) {
		s1.type(text);
	}

}

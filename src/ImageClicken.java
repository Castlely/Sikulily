import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;

import org.sikuli.basics.Debug;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class ImageClicken {

	public static void main(String[] args) throws FindFailed,
			InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Debug.setDebugLevel(3);

		Finder finder=new Finder("C:\\Users\\yilan.ly\\Desktop\\a.JPG");
		Pattern pattern=new Pattern("C:\\Users\\yilan.ly\\Desktop\\331.PNG");
		String rString=finder.find(pattern);
		System.out.println(rString);
		
		/*
		Screen s = new Screen();
		s.find("png//weixin.png"); // identify pause button
		s.click("png//weixin.png"); // click pause button
		System.out.println("WeiXin button clicked");
*/
	}

}
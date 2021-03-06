

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class MySikuliTest {

	public static void main(String[] args) throws FindFailed{
        App.focus("wechat");
        Screen screen = new Screen();
        Pattern p = new Pattern("src/images/backForwardButtons.png");
        Match urlField = screen.wait(p.similar(0.7f), 3);
        urlField.setTargetOffset(70, 0);
        urlField.click();
        screen.type("http://currentlabel.co.uk/flexuscalculus/");
        screen.type(Key.ENTER);
        screen.wait("src/images/pompei.png", 20);
        Match pompei = screen.find("src/images/pompei.png");
        pompei.setTargetOffset(70, 0);
        pompei.click();
        clearField(screen);
        screen.type("0");
        pompei.setTargetOffset(170, 0);
        pompei.click();
        clearField(screen);
        screen.type("0");
        pompei.setTargetOffset(270, 0);
        pompei.click();
        clearField(screen);
        screen.type("0");
        pompei.setTargetOffset(370, 0);
        pompei.click();
        clearField(screen);
        screen.type("0");
        pompei.setTargetOffset(470, 0);
        pompei.click();
        clearField(screen);
        screen.type("0");
        pompei.setTargetOffset(470, -70);
        pompei.click(); // deselect last cell of popei row.

       // assertNotNull("Pompei row should be zeroed out",
       //         screen.wait("src/images/pompeiRowOfZeros.png", 5));

    }



    private static void clearField(Screen screen) {
        screen.type("a", KeyModifier.CMD);
        screen.type(Key.BACKSPACE);
    }

}

package Factory.dialog;

import Factory.Dialog;
import Factory.buttons.DrawButton;
import Factory.interfaces.Button;

public class DrawDialog  extends Dialog {
    public Button createButton() {
        return new DrawButton();
    }
}

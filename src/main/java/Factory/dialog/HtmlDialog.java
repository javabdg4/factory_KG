package Factory.dialog;

import Factory.Dialog;
import Factory.buttons.HtmlButton;
import Factory.interfaces.Button;

public class HtmlDialog extends Dialog {
    public Button createButton() {
        return new HtmlButton();
    }
}

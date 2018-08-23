package Factory.dialog;

import Factory.Dialog;
import Factory.buttons.SwingButton;
import Factory.interfaces.Button;

public class SwingDialog extends Dialog {
    public Button createButton() {
        return new SwingButton();
    }
}

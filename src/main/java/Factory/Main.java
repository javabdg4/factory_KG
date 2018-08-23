package Factory;

import Factory.dialog.DrawDialog;
import Factory.dialog.HtmlDialog;
import Factory.dialog.SwingDialog;

public class Main {

    private static Dialog dialog;

    private static String type;

    public static void main(String[] args) {
        type = "console";
        configure();
        dialog.renderWindow();
    }

    static void configure() {

        if (type.equals("console")) {
            dialog = new DrawDialog();
        } else if (type.equals("graphic")) {
            dialog = new SwingDialog();
        } else if (type.equals("web")) {
            dialog = new HtmlDialog();

        }

    }
}

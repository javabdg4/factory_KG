package Factory.buttons;

import Factory.interfaces.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button To jest przyisk </button>"); onClick();
    }

    public void onClick() {
        System.out.println("Przycisk klikniety");
    }
}

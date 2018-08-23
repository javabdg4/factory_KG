package Factory.buttons;

import Factory.interfaces.Button;

public class DrawButton implements Button {
    public void render() {
        System.out.println("Nacisnij ok"); onClick();
    }

    public void onClick() {
        System.out.println("Przyciusk zostal nacisniety");
    }
}

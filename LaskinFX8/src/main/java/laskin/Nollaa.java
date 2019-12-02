package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {

    private int edellinen;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        edellinen = Integer.parseInt(this.tuloskentta.getText());
        this.tuloskentta.setText("" + 0);
    }

    @Override
    public void peru() {
        this.tuloskentta.setText("" + edellinen);
    }

}

package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Erotus extends Komento {

    private int edellinen;

    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        edellinen = Integer.parseInt(this.tuloskentta.getText());
        int tuloskentta = Integer.parseInt(this.tuloskentta.getText());
        int syotekentta = Integer.parseInt(this.syotekentta.getText());

        int tulos = tuloskentta - syotekentta;

        this.tuloskentta.setText("" + tulos);
    }

    @Override
    public void peru() {
        this.tuloskentta.setText("" + edellinen);
    }

}

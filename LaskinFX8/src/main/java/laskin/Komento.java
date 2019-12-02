package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


abstract class Komento {

    protected TextField tuloskentta;
    protected TextField syotekentta;
    protected Button nollaus;
    protected Button undo;
    protected Sovelluslogiikka sovellus;

    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaus, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaus = nollaus;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    public abstract void suorita();

    public abstract void peru();

}

package modelo;

public class Pedra extends Coisa {

    public Pedra() {
        setGanha("Ganha de");
        setPerde("Perde para");
        setTipo("Pedra");
    }

    @Override
    public int compara(Coisa c) {
        if (c.getTipo().equals("Tesoura")) {
            setResultado(2);
        } else if (c.getTipo().equals("Lagarto")) {
            setResultado(1);
        } else if (c.getTipo().equals("Papel")) {
            setResultado(-1);
        } else if (c.getTipo().equals("Spock")) {
            setResultado(-2);
        } else {
            setResultado(0);
        }
        return getResultado();
    }
}

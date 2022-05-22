package modelo;

public class Tesoura extends Coisa {

    public Tesoura() {
        setGanha("Ganha de");
        setPerde("Perde para");
        setTipo("Tesoura");
    }

    @Override
    public int compara(Coisa c) {
        if (c.getTipo().equals("Lagarto")) {
            setResultado(2);
        } else if (c.getTipo().equals("Papel")) {
            setResultado(1);
        } else if (c.getTipo().equals("Spock")) {
            setResultado(-1);
        } else if (c.getTipo().equals("Pedra")) {
            setResultado(-2);
        } else {
            setResultado(0);
        }
        return getResultado();
    }
}

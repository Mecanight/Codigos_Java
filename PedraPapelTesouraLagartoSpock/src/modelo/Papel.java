package modelo;

public class Papel extends Coisa {

    public Papel() {
        setGanha("Ganha de");
        setPerde("Perde para");
        setTipo("Papel");
    }

    @Override
    public int compara(Coisa c) {
        if (c.getTipo().equals("Spock")) {
            setResultado(2);
        } else if (c.getTipo().equals("Pedra")) {
            setResultado(1);
        } else if (c.getTipo().equals("Tesoura")) {
            setResultado(-1);
        } else if (c.getTipo().equals("Lagarto")) {
            setResultado(-2);
        } else {
            setResultado(0);
        }
        return getResultado();
    }
}

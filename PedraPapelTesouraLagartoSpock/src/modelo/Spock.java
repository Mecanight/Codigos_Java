package modelo;

public class Spock extends Coisa {

    public Spock() {
        setGanha("Ganha de");
        setPerde("Perde para");
        setTipo("Spock");
    }

    @Override
    public int compara(Coisa c) {
        if (c.getTipo().equals("Pedra")) {
            setResultado(2);
        } else if (c.getTipo().equals("Tesoura")) {
            setResultado(1);
        } else if (c.getTipo().equals("Lagarto")) {
            setResultado(-1);
        } else if (c.getTipo().equals("Papel")) {
            setResultado(-2);
        } else {
            setResultado(0);
        }
        return getResultado();
    }
}

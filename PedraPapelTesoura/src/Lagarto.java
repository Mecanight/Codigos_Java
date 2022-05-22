
public class Lagarto extends Coisa {

    public Lagarto() {
        setGanha("Ganha de");
        setPerde("Perde para");
        setTipo("Lagarto");
    }

    @Override
    public int compara(Coisa c) {
        if (c.getTipo().equals("Papel")) {
            setResultado(2);
        } else if (c.getTipo().equals("Spock")) {
            setResultado(1);
        } else if (c.getTipo().equals("Pedra")) {
            setResultado(-1);
        } else if (c.getTipo().equals("Tesoura")) {
            setResultado(-2);
        } else {
            setResultado(0);
        }
        return getResultado();
    }
}

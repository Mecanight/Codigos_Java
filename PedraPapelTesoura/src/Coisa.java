
public class Coisa {

    private String tipo;
    private String ganha;
    private String perde;
    private int resultado;

    public Coisa() {
    }

    public String acao() {
        String res = "";
        switch (getResultado()) {
            case -2:
                res = getPerde();
                break;
            case -1:
                res = getPerde();
                break;
            case 0:
                res = "empata com";
                break;
            case 1:
                res = getGanha();
                break;
            case 2:
                res = getGanha();
                break;

        }
        return res;
    }

    public int compara(Coisa c) {
        return 0;  //será sobrescrito
    }

    public String getGanha() {
        return ganha;
    }

    public void setGanha(String ganha) {
        this.ganha = ganha;
    }

    public String getPerde() {
        return perde;
    }

    public void setPerde(String perde) {
        this.perde = perde;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

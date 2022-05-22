/*Referente exercício 07 e 08*/
package modelo;

public class Filme {

    private String titulo;
    private int duracaoEmMin;

    public Filme() {
    }

    public Filme(String titulo, int duracaoEmMin) {
        this.titulo = titulo;
        this.duracaoEmMin = duracaoEmMin;
    }

    @Override
    public String toString() {
        return "Filmes{" + "titulo=" + titulo + ", duracaoEmMin=" + duracaoEmMin + '}';
    }

    //
    //
    //
    public String exibirDuracaoEmHoras() {
        String aux;
        int th = this.getDuracaoEmMin() / 60;
        int tm = this.getDuracaoEmMin() % 60;
        aux = "O livro: " + this.getTitulo() + " tem duracao de "
                + th + " horas e " + tm + " minutos";
        return aux;
    }
    //
    //
    //

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }

    public void setDuracaoEmMin(int duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }

}

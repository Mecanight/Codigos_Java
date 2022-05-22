/*Referente ao exercício 05 r 06*/
package modelo;

public class Livro {

    private String titulo;
    private int totalPaginas;
    private int paginasLidas;

    public Livro() {
    }

    public Livro(String titulo, int totalPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = paginasLidas;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", totalPaginas=" + totalPaginas
                + ", paginasLidas=" + paginasLidas + '}';
    }

    //
    //
    //
    public String verificaProgresso() {
        String ret;
        double pct;
        pct = (double) (paginasLidas * 100) / totalPaginas;
        ret = "Você já leu " + pct + "% do livro " + this.getTitulo();
        return ret;
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

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

}

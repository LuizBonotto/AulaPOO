public class Livro {
    String titulo;
    String editora;
    Autor autor;

    public Livro(String titulo, String editora, Autor autor) {
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", autor=" + autor +
                '}';
    }
}

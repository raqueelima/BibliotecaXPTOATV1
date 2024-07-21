package BibliotecaXPTO;

public class Livro extends Publicacao{
    private int isbn;
    private int edicao;
    

    public Livro(String titulo , String autor , int ano , String genero , String editora , int qntd, int isbn, int edicao){
        super(titulo, autor, ano, genero, editora, qntd);
        this.isbn = isbn;
        this.edicao = edicao;
    }

    public int getIsbn(){
        return isbn;
    }

    public int getEdicao(){
        return edicao;
    }
    
}

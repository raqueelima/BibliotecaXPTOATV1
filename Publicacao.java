package BibliotecaXPTO;

public class Publicacao{
// atributos
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private String editora;
    private int qntd;

// construtores
    public Publicacao(String titulo , String autor , int ano , String genero , String editora , int qntd){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.editora = editora;
        this.qntd = qntd;
        
// get dos atributos
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
   public int getAno(){
        return ano;
   }
   public String getGenero(){
        return genero;
   }
   public String getEditora(){
        return editora;
   }
   public int getQntd(){
        return qntd;
   }

   public void imprimeDados(){
     System.out.println("Titulo: "+titulo+ "\nAutor: "+autor+ "\nAno de publicacao: "+ano+ "\nGenero do livro: "+genero+"\nEditora: "+editora+"\nQuantidade disponivel: "+qntd+"\nEdicao: "+edicao+"\nIsbn: "+isbn);
     System.out.println("Titulo: "+titulo+ "\nAutor: "+autor+ "\nAno de publicacao: "+ano+ "\nGenero do livro: "+genero+"\nEditora: "+editora+"\nQuantidade disponivel: "+qntd+"\nDiretor:"+diretor+"\nAtor principal"+atorp+"\nDuracao: "+duracao+"\nSinopse: "+sinopse);
   }

}
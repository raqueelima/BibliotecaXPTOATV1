package BibliotecaXPTO;

public class Filmes extends Publicacao{
    public String diretor;
    public String atorP;
    public int duracao;
    public String sinopse;
  
    public Filmes(String titulo , String autor , int ano , String genero , String editora , int qntd, String diretor, String atorP, int duracao, String sinopse){
        super(titulo, autor, ano, genero, editora, qntd);
        this.diretor = diretor;
        this.atorPrincipal = atorP;
        this.duracao = duracao;
        this.sinopse = sinopse;
    }


    public String getDiretor(){
        return diretor;
    }
    public String getAtorP(){
        return atorP;
    }
    public int getDuracao(){
        return duracao;
    }
    public String getSinopse(){
        return sinopse;
    }

 

}

import java.util.ArrayList;

import BibliotecaXPTO.Filmes;
import BibliotecaXPTO.Livro;

public class ProgramaBiblioteca {
    
    public static void main(String[] args) {
        Livro objLivro = new Livro("Senhor dos Aneis", "Tanan da Silva", 2024, "terror", "aaa", 2, 25637, 2);
        Filmes objFilmes = new Filmes("Harry Potter", "Fulano", 2014, "Aventura", "Globo", 5, "Ciclano", "Harry", 120, "Um jovem magico...");
        

        
        ArrayList<Publicacao> lista = new ArrayList<Publicacao>();

        lista.add(objLivro);
        lista.add(objFilmes);
        
        for (Publicacao publicacao : lista){
            publicacao.imprimeDados();
        }
   
   
   
   
    }

}

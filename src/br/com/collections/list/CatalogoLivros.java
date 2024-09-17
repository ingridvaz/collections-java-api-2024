package br.com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private final List<Livros> listLivros;

    public CatalogoLivros() {
        this.listLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        listLivros.add(new Livros(titulo,autor,ano));
    }
    public List<Livros> pesquisaPorAutor(String autor){
        List<Livros> listaDeAutor = new ArrayList<>();
        if(!listLivros.isEmpty()){
            for (Livros livros : listLivros){
                if(livros.getAutor().equalsIgnoreCase(autor)){
                    listaDeAutor.add(livros);
                }
            }
        }

        return listaDeAutor;
    }

    public List<Livros> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livros> livrosIntervaloAno = new ArrayList<>();
        if (!listLivros.isEmpty()){
            for (Livros livros : listLivros){
                if(livros.getAnoPublicacao() >= anoInicial && livros.getAnoPublicacao() <= anoFinal){
                    livrosIntervaloAno.add(livros);
                }
            }
        }
        return livrosIntervaloAno;
    }

    public Livros pesquisaPorTitulo(String titulo){
        Livros porTitulo = null;
        if(!listLivros.isEmpty()){
          for(Livros livros : listLivros){
              if(livros.getTitulo().equalsIgnoreCase(titulo)){
                  porTitulo = livros;
                  break;
              }
          }
        }
        return porTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 0", "Autor 0", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 0", 2023);
        System.out.println("Livros escrito pelo autor " + catalogoLivros.pesquisaPorAutor("Autor 1"));
        System.out.println("Pesquisa por titulo do livro " + catalogoLivros.pesquisaPorTitulo("Livro 0"));
        System.out.println("Livros publicados no intervado de anos " + catalogoLivros.pesquisaPorIntervaloDeAnos(2020,2022));


    }
}

package br.com.collections.set;

import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public void adicionarConvidado(int codigoConvidado, String nome){
        convidadoSet.add(new Convidado(codigoConvidado, nome));
    }

    public void removerConvidado(int codigoConvidado){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvidado() == codigoConvidado){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public Set<Convidado> exibirConvidados(){
        return convidadoSet;
    }
}

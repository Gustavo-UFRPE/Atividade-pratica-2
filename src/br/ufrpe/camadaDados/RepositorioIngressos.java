package br.ufrpe.camadaDados;

import br.ufrpe.CamadaNegocios.Cliente;
import br.ufrpe.CamadaNegocios.Ingresso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RepositorioIngressos {
    private ArrayList<Ingresso> comprados;

    public RepositorioIngressos() {
        this.comprados = new ArrayList<>();
    }
    public void adicionarIngresso(Ingresso vendido){
        comprados.add(vendido);
    }
    public ArrayList<Ingresso> ingressosVendidos(){
        Comparator<? super Ingresso> comparator = new Comparator<Ingresso>() {
            @Override
            public int compare(Ingresso o1, Ingresso o2) {
                return o1.getJogo().getEstadio().compareTo(o2.getJogo().getEstadio());
            }
        };
        comprados.sort(comparator);
        return comprados;
    }
    public ArrayList<String> nomesCompradores(String equipe){
        ArrayList<String> nomes = new ArrayList<>();
        for (Ingresso atual : comprados){
            if (atual.getJogo().getEquipeCasa().equalsIgnoreCase(equipe) ||
            atual.getJogo().getEquipeFora().equalsIgnoreCase(equipe)){
                nomes.add(atual.getPagante().getNome());
            }
        }
        return nomes;
    }
    public ArrayList<Cliente> clientesCompradores(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        for (Ingresso atual : comprados){
            if (atual.getPagante().getPais().equals(atual.getJogo().getEquipeCasa()) ||
            atual.getPagante().getPais().equals(atual.getJogo().getEquipeFora())){
                clientes.add(atual.getPagante());
            }
        }
        return clientes;
    }
}

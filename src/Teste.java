import br.ufrpe.CamadaNegocios.Cliente;
import br.ufrpe.CamadaNegocios.Ingresso;
import br.ufrpe.CamadaNegocios.Jogo;

import java.time.LocalDateTime;

public class Teste {
    public static void main(String[] args){
        Cliente pessoaA = new Cliente("Gustavo", 70133456348L, "Brasil"),
                pessoaB = new Cliente("Pedro", 86793456700L, "Brasil"),
                pessoaC = new Cliente("Josh", 98356789400L, "Estados Unidos");
        Jogo jogo1 = new Jogo("Santa Cruz", "Sport", "arruda",
                LocalDateTime.of(2023,11,5,16,0)),
             jogo2 = new Jogo("Naútico", "Santa Cruz", "aflitos",
                     LocalDateTime.of(2023,11,1,20,0));
        Ingresso ingresso1 = new Ingresso(pessoaA, jogo1, "Setor 1-Cadeira 25A"),
                ingresso2 = new Ingresso(pessoaB, jogo1, "Setor 4-Cadeira 15D"),
                ingresso3 = new Ingresso(pessoaC, jogo2, "Setor 1-Cadeira 5A");
        System.out.println(ingresso1.getPagante().getPais());
        System.out.println(ingresso2.getJogo().getEquipeCasa() + " X " +
                ingresso2.getJogo().getEquipeFora() + " Estádio: " +
                ingresso2.getJogo().getEstadio());
    }
}

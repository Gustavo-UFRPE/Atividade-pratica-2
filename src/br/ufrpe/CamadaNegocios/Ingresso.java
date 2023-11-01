package br.ufrpe.CamadaNegocios;

public class Ingresso {
    private Cliente pagante;
    private Jogo jogo;
    private String assento;

    public Ingresso(Cliente pagante, Jogo jogo, String assento) {
        setPagante(pagante);
        setJogo(jogo);
        setAssento(assento);
    }

    public void setPagante(Cliente pagante) {
        if (pagante != null){
            this.pagante = pagante;
        }
    }

    public void setJogo(Jogo jogo) {
        if (jogo != null){
            this.jogo = jogo;
        }
    }

    public void setAssento(String assento) {
        if (assento != null && !assento.isEmpty()){
            this.assento = assento;
        }
    }

    public Cliente getPagante() {
        return pagante;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public String getAssento() {
        return assento;
    }
}

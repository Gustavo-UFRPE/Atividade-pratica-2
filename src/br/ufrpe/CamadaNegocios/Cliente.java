package br.ufrpe.CamadaNegocios;
public class Cliente {
    private String nome;
    private Long cpf;
    private String pais;

    public Cliente(String nome, Long cpf, String pais) {
        setNome(nome);
        setCpf(cpf);
        this.pais = pais;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void setCpf(Long cpf) {
        if(cpf != 0){
            this.cpf = cpf;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public Long getCpf() {
        return cpf;
    }
}

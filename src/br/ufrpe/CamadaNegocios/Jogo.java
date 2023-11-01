package br.ufrpe.CamadaNegocios;
import java.time.LocalDateTime;

public class Jogo {
    private String equipeCasa;
    private String equipeFora;
    private String estadio;
    private LocalDateTime dataHora;

    public Jogo(String equipeCasa, String equipeFora, String estadio, LocalDateTime dataHora) {
        setEquipeCasa(equipeCasa);
        setEquipeFora(equipeFora);
        setEstadio(estadio);
        setDataHora(dataHora);
    }

    public void setEquipeCasa(String equipeCasa) {
        if (equipeCasa != null && !equipeCasa.isEmpty()){
            this.equipeCasa = equipeCasa;
        }
    }

    public void setEquipeFora(String equipeFora) {
        if (equipeFora != null && !equipeFora.isEmpty()){
            this.equipeFora = equipeFora;
        }
    }

    public void setEstadio(String estadio) {
        if (estadio != null && !estadio.isEmpty()){
            this.estadio = estadio;
        }
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getEquipeCasa() {
        return equipeCasa;
    }

    public String getEquipeFora() {
        return equipeFora;
    }

    public String getEstadio() {
        return estadio;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}

package aula05.exercicio05;

import java.util.ArrayList;
import java.util.Locale;

public class Televisao {
    String marca;
    int tamanhoTela;
    Resolucao resolucao;
    double canalAtual;
    int volumeAtual;
    private boolean isOn;
    private ArrayList<Comandos> historicoComandos = new ArrayList<>();

    public Televisao(){
        canalAtual = 5.1;
        volumeAtual = 15;
    }

    void ligar() {
        if (isOn) {
            System.out.println("A televisão já está ligada.");
            historicoComandos = new ArrayList<>();
        } else {
            isOn = true;
            System.out.println("A televisão foi ligada com sucesso.");
        }
    }

    void desligar() {
        if (isOn) {
            isOn = false;
            System.out.println("A televisão foi desligada com sucesso.");
            historicoComandos.removeAll(historicoComandos);
        } else {
            System.out.println("A televisão já está desligada.");
        }
    }

    void alterarCanal(Comandos comando) {
        if (isOn) {
            switch (comando) {
                case CANAL_PROXIMO:
                    canalAtual += 1;
                    this.historicoComandos.add(comando);
                    break;
                case CANAL_ANTERIOR:
                    canalAtual -= 1;
                    this.historicoComandos.add(comando);
                    break;
                default:
                    System.out.println("Comando inválido para função");
                    break;
            }
            System.out.println("A televisão está no canal " + this.canalAtual);
        } else {
            System.out.println("A televisão está desligada, não é possível alterar o canal.");
        }
    }

    void alterarVolume(Comandos comando) {
        if (isOn) {
            switch (comando) {
                case AUMENTAR_VOLUME:
                    volumeAtual += 1;
                    this.historicoComandos.add(comando);
                    break;
                case DIMINUIR_VOLUME:
                    volumeAtual -= 1;
                    this.historicoComandos.add(comando);
                    break;
                default:
                    System.out.println("Comando inválido para função");
                    break;
            }
            System.out.println("Volume está em " + this.volumeAtual);
        } else {
            System.out.println("A televisão está desligada, não é possível alterar o volume.");
        }
    }

    void mostrarRelatorio() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String s = "";
        s += "Televisão " + this.marca;
        s += ", Tamanho da tela: " + this.tamanhoTela + " polegadas, ";
        s += "Resolução: ";
        switch (this.resolucao) {
            case FULL_HD_1920x1080:
                s += "Full HD - 1920x1080";
                break;
            case ULTRA_HD_4K_3840x2160:
                s += "4K -3840x2160";
                break;
            case UXGA_1680x1050:
                s += "UXGA++ - 1680-1050";
                break;
            case WQHD_2560x1080:
                s += "WQHD - 2560x1080";
                break;
            default:
                s += "desconhecida";
                break;
        }
        Locale.setDefault(Locale.US);
        s += ", Canal Atual: " + String.format("%.1f", this.canalAtual);
        s += ", Volume atual: " + this.volumeAtual;
        if (!this.historicoComandos.isEmpty()) {
            s += ", Ultimo comando utilizado: ";
            switch (this.historicoComandos.get(this.historicoComandos.size() - 1)) {
                case AUMENTAR_VOLUME:
                    s += "Aumentar volume";
                    break;
                case CANAL_ANTERIOR:
                    s += "Canal anterior";
                    break;
                case CANAL_PROXIMO:
                    s += "Próximo canal";
                    break;
                case DIMINUIR_VOLUME:
                    s += "Diminuir volume";
                    break;
                default:
                    s += "Comando desconhecido";
                    break;
            }
        }
        return s;
    }
}

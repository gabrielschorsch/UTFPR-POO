package aula05.exercicio05;

public class TesteTelevisao {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "LG";
        tv.resolucao = Resolucao.FULL_HD_1920x1080;
        tv.tamanhoTela = 32;
        tv.ligar();
        tv.alterarVolume(Comandos.AUMENTAR_VOLUME);
        tv.alterarVolume(Comandos.AUMENTAR_VOLUME);
        tv.alterarVolume(Comandos.AUMENTAR_VOLUME);
        tv.alterarVolume(Comandos.DIMINUIR_VOLUME);
        tv.alterarVolume(Comandos.DIMINUIR_VOLUME);
        tv.ligar();
        tv.alterarCanal(Comandos.CANAL_PROXIMO);
        tv.alterarCanal(Comandos.CANAL_PROXIMO);
        tv.alterarCanal(Comandos.CANAL_ANTERIOR);
        tv.mostrarRelatorio();
        tv.desligar();
    }

}

package aula11.exercicio03;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa e = new Empresa("ABC LTDA", "1231312", UnidadeFederativa.SANTA_CATARINA);

        System.out.println(e.uf.getCapital());
    }
}

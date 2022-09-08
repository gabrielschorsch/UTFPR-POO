package aula06.exercicio2;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data(2);
        Data data3 = new Data(12, 2022);
        Data data4 = new Data(25,12, 2022);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
    }
    
}

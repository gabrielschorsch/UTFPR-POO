package aula08.exercicio01;

public class TesteRelogio {
    public static void main(String[] args) {
        try{
            Relogio r1 = new Relogio("Marca 1", 23, 10);
            System.out.println(r1);
            r1.setHora(20);
            r1.setMinuto(30);
            System.out.println(r1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }    
}

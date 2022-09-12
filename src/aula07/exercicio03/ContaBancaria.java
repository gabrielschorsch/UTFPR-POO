package aula07.exercicio03;

public class ContaBancaria {
    final int numeroConta;
    final String agencia;
    String nomeTitular;
    double saldo;
    static int totalContasNoSistema;

    String validateAgency(String agencia) throws InvalidBankAgencyException{
        if(agencia.length() != 6){
            throw new InvalidBankAgencyException("Agência " + agencia + " possui um tamanho inválido");
        } 
        if("012345678901234567890123456789".indexOf(agencia) != -1 ||
        "987654321098765432109876543210".indexOf(agencia) != -1 ){
            throw new InvalidBankAgencyException("Agência " + agencia + " é inválido pois possui uma sequência de caracteres");
        }
        return agencia;
    }

    public ContaBancaria(int numeroConta, String agencia, String nomeTitular) throws InvalidBankAgencyException {
        this.numeroConta = numeroConta;
        this.agencia = validateAgency(agencia);
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
        totalContasNoSistema++;
    }

    @Override
    public String toString() {
        return "Detalhes da conta:\n" +
        "Agência: " + this.agencia +
        "\nNúmero da conta: " + this.numeroConta +
        "\nSaldo atual da conta: R$" + this.saldo +
        "\nDetalhes do banco:\nQuantidade total de contas no sistema: " + totalContasNoSistema;
    }
    
}

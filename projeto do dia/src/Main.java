import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listadecontasBancarias = new ArrayList<>();
        ContaBancaria contaBancaria1 = new ContaBancaria("Carlos",98445-1,25000);
        ContaBancaria contaBancaria2= new ContaBancaria("Pedro",654231-9,15000);
        ContaBancaria contaBancaria3= new ContaBancaria("Alice",54321-0,14616);
        ContaBancaria contaBancaria4 = new ContaBancaria("Marcos",03215-2,21200);
        ContaBancaria contaBancaria5= new ContaBancaria("Leticia",50951-1,80000);

        listadecontasBancarias.add(contaBancaria1);
        listadecontasBancarias.add(contaBancaria2);
        listadecontasBancarias.add(contaBancaria3);
        listadecontasBancarias.add(contaBancaria4);
        listadecontasBancarias.add(contaBancaria5);

        ContaBancaria contamaiorsaldo = listadecontasBancarias.get(0);
        ContaBancaria contamenorsaldo = listadecontasBancarias.get(0);


        for(ContaBancaria elemento:listadecontasBancarias){
            if(elemento.getSaldo()>= contamaiorsaldo.getSaldo()){
                contamaiorsaldo = elemento;
            } else if (elemento.getSaldo() <= contamenorsaldo.getSaldo()){
            contamenorsaldo = elemento;
            }
        }
        System.out.println("Nome do titular: "+contamaiorsaldo.getNomedotitular()+
                "\nA conta com maior saldo - Númerodaconta: "+contamaiorsaldo.getNúmerodaconta()+", saldo: "+contamaiorsaldo.getSaldo()+" reais");
        System.out.println("Nome do titular: "+contamenorsaldo.getNomedotitular()+
                "\nA conta com menor saldo - Númerodaconta: "+contamenorsaldo.getNúmerodaconta()+", saldo: "+contamenorsaldo.getSaldo()+" reais");
        }
}
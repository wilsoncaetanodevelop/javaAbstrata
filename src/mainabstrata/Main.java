package mainabstrata;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    
    public static void menu(){
        System.out.println("----Digite----");
        System.out.println("1_Para adicionar Veiculo");
        System.out.println("2_Para imprimir os veiculos");
        System.out.println("3_Sair");
    } 

    public static void addVeiculos(ArrayList<EmissaoCo2> dados) {

        int qtd, op;
        String tipo, motor;
        double quilo, indice;

        System.out.print("Digite a quantidade de carros a cadastra: ");
        qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {

            System.out.println("----Digite----");
            System.out.println("1_para adicionar Carro");
            System.out.println("2_para adicionar Barco");
            System.out.println("3_para adicionar Bicicleta");

            op = sc.nextInt();

            switch (op) {

                case 1:

                    System.out.println("Digite o tipo");
                    tipo = sc.next();
                    System.out.println("Digite o motor");
                    motor = sc.next();
                    System.out.println("Digite a  quilometragem");
                    quilo = sc.nextDouble();
                    System.out.println("Digite indice");
                    indice = 1.24;

                    Veiculo c = new Carro(quilo, indice, tipo, motor);
                    dados.add(c);

                    break;
                case 2:

                    System.out.println("Digite o tipo");
                    tipo = sc.next();
                    System.out.println("Digite o motor");
                    motor = sc.next();
                    System.out.println("Digite a  quilometragem");
                    quilo = sc.nextDouble();
                    System.out.println("Digite indice");
                    indice = 0.23;

                    Veiculo ba = new Barco(quilo, indice, tipo, motor);
                    dados.add(ba);

                    break;
                case 3:
                    System.out.println("Digite o tipo");
                    tipo = sc.next();
                    System.out.println("Digite o motor");
                    motor = sc.next();
                    System.out.println("Digite a  quilometragem");
                    quilo = sc.nextDouble();
                    System.out.println("Digite indice");
                    indice = 0.0;

                    Veiculo bi = new Bicicleta(quilo, indice, tipo, motor);
                    dados.add(bi);

                    break;
            }
        }
    }
    
    public static void imprimeVeiculo(ArrayList<EmissaoCo2> dados){
        
        if(!dados.isEmpty()){
            
            System.out.println("Lista vazia!");
            
            for(int i=0;i<dados.size();i++){
                dados.get(i).imprime();
               
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<EmissaoCo2> lista = new ArrayList<EmissaoCo2>();

        int op;
        
        do{
          
            menu();
            
            op = sc.nextInt();
            
            switch(op){
                
                case 1:
                    
                    addVeiculos(lista);
                    
                    break;
                case 2:
                    
                     imprimeVeiculo(lista);
                     
                    break;
            }
        }
        while(op!=3);
    }

}

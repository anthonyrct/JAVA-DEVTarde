package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);


    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch(letra){
            case "a":System.out.println(letra+" É uma vogal");
            break;
            case "e":System.out.println(letra+ "É uma vogal");
            break;
            case "i":System.out.println(letra+ "É uma vogal");
             break;
             case "o":System.out.println(letra+ "É uma vogal");
            break;
            case "u":System.out.println(letra+ "É uma vogal");
            break;
            default:
        }
        
    }
    public void Mês() {
        System.out.println("Digite um Mês");
        String Mês = sc.nextLine();
        switch(Mês){
            case "1":System.out.println(Mês+ "É Janeiro");
            break;
            case "2":System.out.println(Mês+ "É Fevereiro");
            break;
            case "3":System.out.println(Mês+ "É Março");
            break;
            case "4":System.out.println(Mês+ "É Abrill");
            break;
            case "5":System.out.println(Mês+ "É Maio");
            break;
            case "6":System.out.println(Mês+ "É Junho");
            break;
            case "7":System.out.println(Mês+ "É Julho");
            break;
            case "8":System.out.println(Mês+ "É Agosto");
            break;
            case "9":System.out.println(Mês+ "É Setembro");
            break;
            case "10":System.out.println(Mês+ "É Outubro");
            break;
            case "11":System.out.println(Mês+ "É Novembro");
            break;
            case "12":System.out.println(Mês+ "É Dezembro");
            break;
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    Nike nikeNewCamisa = new Nike();
    ACamisa newCamisa_N =  nikeNewCamisa.newCamisa();
    Adidas adidasNewCamisa = new Adidas();
    ACamisa newCamisa_A = adidasNewCamisa.newCamisa();
    Puma pumaNewCamisa = new Puma();
    ACamisa newCamisa_P = pumaNewCamisa.newCamisa();
    Umbro umbroNewCamisa = new Umbro();
    ACamisa newCamisa_U =  umbroNewCamisa.newCamisa();
    Kappa kappaNewCamisa = new Kappa();
    ACamisa newCamisa_K = kappaNewCamisa.newCamisa();
            
    Scanner scanner = new Scanner(System.in);   

    boolean executando = true;
    while(executando) {
    System.out.println("[FÁBRICA ESPORTIVA]");
    System.out.println("Escolha a camisa de acordo com seu time:");    
    System.out.println("*[1] Brasil *");
    System.out.println("*[2] Flamengo*");
    System.out.println("*[3] Botafogo*");
    System.out.println("*[4] Fluminense*");
    System.out.println("*[5] Vasco*");
    System.out.println("*[6] Sair*");

    System.out.println("Digite uma opção: ");
    String opcao = scanner.nextLine();

    switch (opcao){
        case "1": 
            System.out.print("=====INFORMAÇÕES DO PRODUTO=====");
            System.out.println("");
            newCamisa_N.exibirInfo();
            executando = false;
            break;
        case "2":
            System.out.print("=====INFORMAÇÕES DO PRODUTO=====");
            System.out.println("");
            newCamisa_A.exibirInfo();
            executando = false;
            break;
        case "3":
            System.out.print("=====INFORMAÇÕES DO PRODUTO=====");
            System.out.println("");
            newCamisa_P.exibirInfo();
            executando = false;
            break;
        case "4":
            System.out.print("=====INFORMAÇÕES DO PRODUTO=====");
            System.out.println("");
            newCamisa_U.exibirInfo();
            executando = false;
            break;
        case "5":
            System.out.print("=====INFORMAÇÕES DO PRODUTO=====");
            System.out.println("");
            newCamisa_K.exibirInfo();
            executando = false;
            break;
        case "6":
            executando = false;
            System.out.println("SISTEMA ENCERRADO.");
            break;
        default: 
        System.out.println("Número inválido, digite uma das opções conforme o menu.");
    }   
    executando = false;
    break;
}
}   
}

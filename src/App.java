import java.lang.invoke.ConstantCallSite;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
       System.out.println("Digite seu primeironome : ");
        String primeiroNome= entrada.nextLine();
        System.out.println("Digite seu segundo nome : " );
        String segundoNome= entrada.nextLine();
        String nomeCompleto= nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
       
    }
    public static String nomeCompleto (String primeiroNome, String segundonome){
        return "Resultado do metodo é " + primeiroNome.concat("").concat(segundonome);
    }
}

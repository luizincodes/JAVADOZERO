import java.util.ArrayList;
import java.util.Scanner;

public class login {

    Scanner leitor = new Scanner(System.in);

    ArrayList<String> usuarios = new ArrayList<>();
    ArrayList<String> senhas = new ArrayList<>();

    String user;
    String password;
    String confirmationPassword;

    public void cadastrarUsuario() {

        System.out.println("\n--- NOVO CADASTRO ---");
        System.out.print("Digite um usuario: ");
        user = leitor.nextLine();

        do {

            System.out.print("Digite uma senha: ");
            password = leitor.nextLine();

            System.out.print("Confirme sua senha: ");
            confirmationPassword = leitor.nextLine();

            // Mensagem de aviso se as senhas forem diferentes
            if (!confirmationPassword.equals(password)) {
                System.out.println(">> Erro: As senhas não coincidem. Tente novamente! <<");
            }

        } while (!confirmationPassword.equals(password));

        usuarios.add(user);
        senhas.add(password);
        System.out.println("Sucesso! Usuário " + user + " foi guardado na lista.");
    }

    public static void main(String[] args) {
        login meuSistema = new login();

        meuSistema.cadastrarUsuario();

   
    }
}
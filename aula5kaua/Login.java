import java.util.Scanner;
import java.util.Random;

public class Login {
    private static Login instance;
    private String usuario = "admin";
    private String senha = "1234";

    private Login() {}

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    private String gerarCaptcha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        StringBuilder captcha = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            captcha.append(caracteres.charAt(rand.nextInt(caracteres.length())));
        }
        return captcha.toString();
    }

    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

    public void fazerLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String userInput = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaInput = scanner.nextLine();

        String captcha = gerarCaptcha();
        System.out.println("Digite o código para verificar que você não é um robô: " + captcha);
        System.out.print("Código: ");
        String captchaInput = scanner.nextLine();

        if (!captcha.equals(captchaInput)) {
            System.out.println("Verificação de bot falhou!");
            return;
        }

        if (autenticar(userInput, senhaInput)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }
}

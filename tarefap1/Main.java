public class Main {
    public static void main(String[] args) {
        Notificacao simples = new NotificacaoSimples();
        Notificacao comWhatsapp = new WhatsappDecorator(simples);

        String resultado = comWhatsapp.enviar("Olá, Kauã!");
        System.out.println(resultado);
    }
}

public class NotificacaoSimples implements Notificacao {
    @Override
    public String enviar(String mensagem) {
        return "Mensagem enviada: " + mensagem;
    }
}

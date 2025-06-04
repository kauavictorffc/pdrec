public class WhatsappDecorator extends NotificacaoDecorator {

    public WhatsappDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        String resultadoAnterior = super.enviar(mensagem);
        return resultadoAnterior + "\n(Enviada também via WhatsApp)";
    }
}

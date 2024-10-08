package bridge;

public class Bridge {

    public static void main(String[] args) {
        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();
    }
}

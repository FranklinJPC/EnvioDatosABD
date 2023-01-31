import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Formulario");
        ventana.setContentPane(new Formulario().panel_Formulario);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350,500);
        ventana.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Formulario {
    PreparedStatement ps;
    private JLabel label_formulario;
    private JButton guardarButton;
    private JTextField text_nombre;
    private JTextField text_apellido;
    private JTextField text_celular;
    private JTextField text_correo;
    private JTextField text_codigo;
    public JPanel panel_Formulario;
    private JTextField text_edad;
    private JButton DELETEButton;

    public Formulario() {
    guardarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Connection con;
            try
            {
                if ((text_codigo.getText()).equals(""))
                    JOptionPane.showMessageDialog(null, "Falta el codigo", "Falta Codigo", JOptionPane.ERROR_MESSAGE);
                else if ((text_nombre.getText()).equals(""))
                    JOptionPane.showMessageDialog(null, "Nombre faltante", "Falta Nombre", JOptionPane.ERROR_MESSAGE);
                else if ((text_apellido.getText()).equals(""))
                    JOptionPane.showMessageDialog(null, "Apellido faltante", "Falta Apellido", JOptionPane.ERROR_MESSAGE);
                else
                {
                    con = getConection();
                    ps = con.prepareStatement("INSERT INTO datos_principales (Cod_DP, Nombre_DP, Apellido_DP, Celular_DP, Correo_DP, Edad_DP) VALUES (?,?,?,?,?,?)");
                    ps.setString(1, text_codigo.getText());
                    ps.setString(2, text_nombre.getText());
                    ps.setString(3, text_apellido.getText());
                    ps.setString(4, text_celular.getText());
                    ps.setString(5, text_correo.getText());
                    ps.setInt(6, Integer.parseInt(text_edad.getText()));
                    System.out.println(ps);
                    int res = ps.executeUpdate();

                    if (res > 0)
                        JOptionPane.showMessageDialog(null, "Se Guardo correctamente!!", "Bien hecho", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "ERROR!!!", "ERROR", JOptionPane.ERROR_MESSAGE);

                    con.close();
                }
            }
            catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_codigo.setText("");
                text_nombre.setText("");
                text_apellido.setText("");
                text_celular.setText("");
                text_correo.setText("");
                text_edad.setText("");

            }
        });
    }

    public static Connection getConection()
    {
        Connection con = null;
        String nombreBase = "bd_datos";
        String url = "jdbc:mysql://localhost/" + nombreBase;
        String user = "root";
        String password = "esfot123";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,password);

        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
            System.err.println(e);
        }
        return con;
    }
}

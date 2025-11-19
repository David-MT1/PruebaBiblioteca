import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    public static void main(String[] args) {
    login ventana = new login();
    ventana.setVisible(true);
}

    public login() {
        setTitle("login");
        setSize(320, 180);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5, 10, 10));

        JLabel lblCorreo = new JLabel("Correo:");
        JTextField txtCorreo = new JTextField();
        panel.add(lblCorreo);
        panel.add(txtCorreo);

        JLabel lblPass = new JLabel("Contraseña:");
        JPasswordField txtPass = new JPasswordField();
        panel.add(lblPass);
        panel.add(txtPass);

        JButton btnIngresar = new JButton("Ingresar");
        panel.add(new JLabel()); 
        panel.add(btnIngresar);

        add(panel);
    }

    
}

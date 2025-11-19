import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewStudent extends JFrame {

    public ViewStudent() {
        setTitle("Portal de Estudiantes - Universidad XYZ");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout(10, 10)); 

        JLabel lblBienvenida = new JLabel("Bienvenido, estudiante", SwingConstants.CENTER);
        lblBienvenida.setFont(new Font("Arial", Font.BOLD, 18));
        lblBienvenida.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(lblBienvenida, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel(new GridLayout(2, 1, 20, 20));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 100, 50, 100));

        JButton btnMatricula = new JButton("Matricularme");
        btnMatricula.setFont(new Font("Arial", Font.PLAIN, 16));
        panelBotones.add(btnMatricula);

        JButton btnConvalidar = new JButton("Solicitar Convalidación");
        btnConvalidar.setFont(new Font("Arial", Font.PLAIN, 16));
        panelBotones.add(btnConvalidar);

        add(panelBotones, BorderLayout.CENTER);

        btnMatricula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ViewStudent.this, "Abriendo Módulo de Matrícula...");
            }
        });
        
        btnConvalidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ViewStudent.this, "Abriendo Formulario de Convalidación...");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewStudent();
            }
        });
    }
}
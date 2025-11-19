import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SecretariaGUI extends JFrame {
    private Secretaria secretaria;
    private JTextField txtNombreEst;
    private JTextField txtCursoAnterior;
    private JTextField txtCursoEquivalente;
    private JTextArea txtResultado;

    public SecretariaGUI(Secretaria secretaria) {
        this.secretaria = secretaria;
        setTitle("Sistema de Convalidaciones - Secretaria");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        JLabel lblNombre = new JLabel("Nombre del estudiante:");
        txtNombreEst = new JTextField();
        JLabel lblCursoAnterior = new JLabel("Curso anterior:");
        txtCursoAnterior = new JTextField();
        JLabel lblCursoEquivalente = new JLabel("Curso equivalente:");
        txtCursoEquivalente = new JTextField();
        JButton btnValidar = new JButton("Validar Convalidación");
        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtResultado);

        panel.add(lblNombre);
        panel.add(txtNombreEst);
        panel.add(lblCursoAnterior);
        panel.add(txtCursoAnterior);
        panel.add(lblCursoEquivalente);
        panel.add(txtCursoEquivalente);
        panel.add(new JLabel());  
        panel.add(btnValidar);
        add(panel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarConvalidacionGUI();
            }
        });
    }
    private void validarConvalidacionGUI() {

        String nombre = txtNombreEst.getText();
        String cursoAnterior = txtCursoAnterior.getText();
        String cursoEquivalente = txtCursoEquivalente.getText();

        if (nombre.isEmpty() || cursoAnterior.isEmpty() || cursoEquivalente.isEmpty()) {
            txtResultado.setText("Todos los campos son obligatorios.");
            return;
        }
    }
    public static void main(String[] args) {
        Secretaria s = new Secretaria("Ana Pérez", "ana@xyz.edu", "SEC001", "999111222");
        new SecretariaGUI(s).setVisible(true);
    }
}



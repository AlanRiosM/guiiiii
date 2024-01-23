import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class practica1 extends JFrame{
    private JTextField text1;
    private JTextField text2;
    private JButton ver;
    private JLabel a;
    private JPanel gg;

    public practica1() {
        super("Mi Formulario");
        setContentPane(gg);

        ver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato1=text1.getText();
                JOptionPane.showMessageDialog(null, dato1);
            }
        });
    }
    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

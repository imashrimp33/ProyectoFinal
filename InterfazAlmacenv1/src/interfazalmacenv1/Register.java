
package interfazalmacenv1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Register {
    JFrame frame;
    JLabel label1,label2;
    JTextField text1;
    JPasswordField password;
    JButton btn1;
    
    public void iniciar(){
        //marco
        frame = new JFrame("VentanaRegistro");
        frame.setSize(300, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //etiquetas
        label1 = new JLabel("Escriba su Usuario:");
        label1.setBounds(95, 60, 150, 40);
        frame.add(label1);
        label2 = new JLabel("Escriba su Contraseña:");
        label2.setBounds(95, 130, 150, 40);
        frame.add(label2);
        
        //campo de texto
        text1 = new JTextField("");
        text1.setBounds(75, 90, 150, 20);
        frame.add(text1);
        
        //contraseña
        password = new JPasswordField("");
        password.setBounds(75, 160, 150, 20);
        frame.add(password);
        
        //botones
        btn1 = new JButton("Registrar");
        btn1.setBounds(100, 200, 100, 20);
        frame.add(btn1);
       
        
        
        
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(500, 200);
        
        //acciones
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                UserUI ventana = new UserUI();
                ventana.iniciar();
            }
        });
       
    }
}


package interfazalmacenv1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Invoice {
    JFrame frame;
    JLabel label1,label2;
    JTextField text1;
    JPasswordField password;
    JButton btn1;
    
    public void iniciar(){
         //marco
        frame = new JFrame("Ventanainicial");
        frame.setSize(300, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //etiquetas
        label1 = new JLabel("Bienvenido a Facturas");
        label1.setBounds(85, 90, 160, 40);
        frame.add(label1);
        
        //botones
        btn1 = new JButton("Volver");
        btn1.setBounds(95, 130, 100, 30);
        frame.add(btn1);
        
        
        
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(500, 200);
        
        //acciones
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MenuUI ventana = new MenuUI();
                ventana.iniciar();
            }
        });
       
    }
}

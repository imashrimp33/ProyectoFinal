
package interfazalmacenv1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Frame1 {
    JFrame frame;
    JLabel label1;
    JButton btn1;
    
    public void iniciar(){
        //marco
        frame = new JFrame("Ventanainicial");
        frame.setSize(300, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //etiquetas
        label1 = new JLabel("Bienvenido");
        label1.setBounds(115, 90, 70, 40);
        frame.add(label1);
        
        //botones
        btn1 = new JButton("Ingresar");
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
                UserUI ventana = new UserUI();
                ventana.iniciar();
            }
        });
    }
}

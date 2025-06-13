
package interfazalmacenv1;

import java.awt.event.*;
import javax.swing.*;
public class MenuUI {
    JFrame frame;
    JLabel label1;
    JButton btn1,btn2;
    
    public void iniciar(){
        //marco
        frame = new JFrame("MenuPrincipal");
        frame.setSize(300, 350);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         //etiquetas
        label1 = new JLabel("Bienvenido");
        label1.setBounds(115, 90, 70, 40);
        frame.add(label1);
        
        //botones
        btn1 = new JButton("Facturar");
        btn1.setBounds(30, 130, 100, 20);
        frame.add(btn1);
        btn2 = new JButton("Almacenar");
        btn2.setBounds(165, 130, 100, 20);
        frame.add(btn2);
        
        
        
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocation(500, 200);
        
        //acciones
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Invoice ventana = new Invoice();
                ventana.iniciar();
                
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Storage ventana = new Storage();
                ventana.iniciar();
            }
        });
    }
}

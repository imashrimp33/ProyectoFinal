
package interfazalmacenv1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Frame1 {
    JFrame frame;
    JLabel titleLabel;
    JLabel subtitleLabel;
    JButton btn1;
    JPanel mainPanel;
    JPanel headerPanel;
    JPanel contentPanel;
    JPanel buttonPanel;
    
    public void iniciar(){
        // Configurar Look and Feel moderno
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Marco principal
        frame = new JFrame("Bienvenido - Mi Aplicación");
        frame.setSize(450, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centrar en pantalla
        
        // Panel principal con gradiente
        mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                // Gradiente de fondo
                GradientPaint gradient = new GradientPaint(
                    0, 0, new Color(74, 144, 226),
                    0, getHeight(), new Color(143, 148, 251)
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(new BorderLayout());
        
        // Panel de encabezado
        headerPanel = new JPanel();
        headerPanel.setOpaque(false);
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        headerPanel.setBorder(new EmptyBorder(40, 30, 20, 30));
        
        // Título principal
        titleLabel = new JLabel("¡Bienvenido!");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Subtítulo
        subtitleLabel = new JLabel("Accede a tu cuenta para continuar");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitleLabel.setForeground(new Color(255, 255, 255, 200));
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        headerPanel.add(titleLabel);
        headerPanel.add(Box.createVerticalStrut(10));
        headerPanel.add(subtitleLabel);
        
        // Panel de contenido
        contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(new EmptyBorder(20, 50, 20, 50));
        
        // Icono decorativo (usando texto Unicode como icono)
        JLabel iconLabel = new JLabel("👤");
        iconLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 60));
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(iconLabel);
        contentPanel.add(Box.createVerticalStrut(60));
        
        // Panel para el botón
        buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(new EmptyBorder(20, 30, 40, 30));
        
        // Botón moderno
        btn1 = new JButton("Ingresar") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Fondo del botón
                if (getModel().isPressed()) {
                    g2d.setColor(new Color(45, 55, 72));
                } else if (getModel().isRollover()) {
                    g2d.setColor(new Color(74, 85, 104));
                } else {
                    g2d.setColor(new Color(45, 55, 72));
                }
                
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 12, 12);
                
                // Texto del botón
                g2d.setColor(Color.WHITE);
                g2d.setFont(getFont());
                FontMetrics fm = g2d.getFontMetrics();
                int textWidth = fm.stringWidth(getText());
                int textHeight = fm.getAscent();
                int x = (getWidth() - textWidth) / 2;
                int y = (getHeight() + textHeight) / 2 - 2;
                g2d.drawString(getText(), x, y);
                
                g2d.dispose();
            }
        };
        
        btn1.setPreferredSize(new Dimension(160, 45));
        btn1.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btn1.setForeground(Color.WHITE);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        btn1.setFocusPainted(false);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Efectos hover para el botón
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn1.repaint();
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btn1.repaint();
            }
        });
        
        buttonPanel.add(btn1);
        
        // Ensamblar la interfaz
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.add(mainPanel);
        frame.setVisible(true);
        
        // Acción del botón (mantiene la funcionalidad original)
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
    

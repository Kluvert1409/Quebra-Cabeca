/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author UVC
 */
public class QuebraCabeca extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next, back;
    JLabel titulo;

    public QuebraCabeca() {

        setTitle("Quebra Cabeça");
        setSize(340, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        titulo = new JLabel("Fase 1");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setBounds(130, 20, 200, 50);
        add(titulo);

        b1 = new JButton("1");
        b1.setBounds(60, 90, 60, 50);
        add(b1);

        b2 = new JButton(" ");
        b2.setBounds(130, 90, 60, 50);
        add(b2);

        b3 = new JButton("3");
        b3.setBounds(200, 90, 60, 50);
        add(b3);

        b4 = new JButton("4");
        b4.setBounds(60, 150, 60, 50);
        add(b4);

        b5 = new JButton("5");
        b5.setBounds(130, 150, 60, 50);
        add(b5);

        b6 = new JButton("6");
        b6.setBounds(200, 150, 60, 50);
        add(b6);

        b7 = new JButton("7");
        b7.setBounds(60, 210, 60, 50);
        add(b7);

        b8 = new JButton("8");
        b8.setBounds(130, 210, 60, 50);
        add(b8);

        b9 = new JButton("2");
        b9.setBounds(200, 210, 60, 50);
        add(b9);

        next = new JButton("Next");
        next.setBounds(110, 310, 120, 40);
        add(next);

        back = new JButton("Back");
        back.setBounds(110, 310, 120, 40);
        back.setVisible(false);
        add(back);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getText().equals(" ")) {
                    b2.setText(b1.getText());
                    b1.setText(" ");
                } else if (b4.getText().equals(" ")) {
                    b4.setText(b1.getText());
                    b1.setText(" ");
                }
                verificarVitoria();
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b3.getText().equals(" ")) {
                    b3.setText(b2.getText());
                    b2.setText(" ");
                } else if (b5.getText().equals(" ")) {
                    b5.setText(b2.getText());
                    b2.setText(" ");
                } else if (b1.getText().equals(" ")) {
                    b1.setText(b2.getText());
                    b2.setText(" ");
                }
                verificarVitoria();
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getText().equals(" ")) {
                    b2.setText(b3.getText());
                    b3.setText(" ");
                } else if (b6.getText().equals(" ")) {
                    b6.setText(b3.getText());
                    b3.setText(" ");
                }
                verificarVitoria();
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b1.getText().equals(" ")) {
                    b1.setText(b4.getText());
                    b4.setText(" ");
                } else if (b5.getText().equals(" ")) {
                    b5.setText(b4.getText());
                    b4.setText(" ");
                } else if (b7.getText().equals(" ")) {
                    b7.setText(b4.getText());
                    b4.setText(" ");
                }
                verificarVitoria();
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b2.getText().equals(" ")) {
                    b2.setText(b5.getText());
                    b5.setText(" ");
                } else if (b4.getText().equals(" ")) {
                    b4.setText(b5.getText());
                    b5.setText(" ");
                } else if (b6.getText().equals(" ")) {
                    b6.setText(b5.getText());
                    b5.setText(" ");
                } else if (b8.getText().equals(" ")) {
                    b8.setText(b5.getText());
                    b5.setText(" ");
                }
                verificarVitoria();
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b3.getText().equals(" ")) {
                    b3.setText(b6.getText());
                    b6.setText(" ");
                } else if (b9.getText().equals(" ")) {
                    b9.setText(b6.getText());
                    b6.setText(" ");
                } else if (b5.getText().equals(" ")) {
                    b5.setText(b6.getText());
                    b6.setText(" ");
                }
                verificarVitoria();
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b4.getText().equals(" ")) {
                    b4.setText(b7.getText());
                    b7.setText(" ");
                } else if (b8.getText().equals(" ")) {
                    b8.setText(b7.getText());
                    b7.setText(" ");
                }
                verificarVitoria();
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b7.getText().equals(" ")) {
                    b7.setText(b8.getText());
                    b8.setText(" ");
                } else if (b5.getText().equals(" ")) {
                    b5.setText(b8.getText());
                    b8.setText(" ");
                } else if (b9.getText().equals(" ")) {
                    b9.setText(b8.getText());
                    b8.setText(" ");
                }
                verificarVitoria();
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b6.getText().equals(" ")) {
                    b6.setText(b9.getText());
                    b9.setText(" ");
                } else if (b8.getText().equals(" ")) {
                    b8.setText(b9.getText());
                    b9.setText(" ");
                }
                verificarVitoria();
            }
        });

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setText("5");
                b2.setText("7");
                b3.setText("3");
                b4.setText("2");
                b5.setText("1");
                b6.setText("6");
                b7.setText(" ");
                b8.setText("8");
                b9.setText("4");

                back.setVisible(true);
                next.setVisible(false);
                titulo.setText("Fase 2");
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setText("1");
                b2.setText(" ");
                b3.setText("3");
                b4.setText("4");
                b5.setText("5");
                b6.setText("6");
                b7.setText("7");
                b8.setText("8");
                b9.setText("2");

                next.setVisible(true);
                back.setVisible(false);
                titulo.setText("Fase 1");
            }
        });
    }

    public void verificarVitoria() {
        if (b1.getText().equals("1") && b2.getText().equals("2") && b3.getText().equals("3")
                && b4.getText().equals("4") && b5.getText().equals("5") && b6.getText().equals("6")
                && b7.getText().equals("7") && b8.getText().equals("8") && b9.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Você venceu!", "Parabéns!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

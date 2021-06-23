import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;



public class Proyecto extends JFrame implements ActionListener{

private JLabel label1, label2,label3,label4;
private JTextField field1;
private JButton boton1;
public static String nombre = "";
Font fuente = new Font("Calibri",3,20);


public Proyecto () {

Container fondo = this.getContentPane(); 

fondo.setBackground(new Color(244,0,0));

setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Bienvenido");


label1 = new JLabel ("Sistema de Control Vacacional");
label1.setFont(fuente);
label1.setForeground(Color.WHITE);
label1.setBounds(56,220,430,30);
add(label1);

label2 = new JLabel ("©2020 The Coca Cola Company");
label2.setForeground(new Color(224,224,224));
label2.setBounds(125,590,200,30);
add(label2);

label3 = new JLabel ("Ingrese su nombre:");
label3.setForeground(Color.WHITE);
label3.setBounds(56,323,200,30);
add(label3);

ImageIcon imagen = new ImageIcon ("./images/logo-coca.PNG");
label4 = new JLabel (imagen);
label4.setBounds(35,30,380,190);
add(label4);


field1 = new JTextField ();
field1.setBounds(55,360,340,38);
field1.setBackground(new Color(224,224,224));
field1.setForeground(new Color(255,0,0));
add(field1);

boton1 = new JButton("Ingresar");
boton1.setBounds(150,430,130,40);
boton1.setForeground(new Color(244,0,0));
boton1.setFont(new Font("Menlo",1,16));
boton1.addActionListener(this);
add(boton1);


}


public void actionPerformed(ActionEvent e){

if(e.getSource() == boton1){

  if (field1.getText().trim().length() == 0){

JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");

   } else{

nombre = field1.getText();

Licencia form = new Licencia();
form.setBounds(0,0,650,450);
form.setVisible(true);
form.setLocationRelativeTo(null);
this.setVisible(false);


}


}


}

public static void main(String args []){

Proyecto form = new Proyecto();
form.setBounds(0,0,450,650);
form.setVisible(true);
form.setLocationRelativeTo(null);


}






}
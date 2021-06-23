import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Licencia extends JFrame implements ActionListener, ChangeListener {

private JLabel label1,label2;
private JButton boton1,boton2;
private JCheckBox box;
private JTextArea area;
private JScrollPane scroll;
String nombre1 = "";


public Licencia (){
setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle ("Licencia de uso");
Proyecto ventanaBienvenida = new Proyecto ();
nombre1 = ventanaBienvenida.nombre;

area = new JTextArea("\n\n           AAA"+
                     "\n\n           OOOO");
scroll = new JScrollPane(area);
scroll.setBounds(10,60,630,265);
area.setEditable (false);
add(scroll);

label1 = new JLabel ("TÉRMINOS Y CONDICIONES");
label1.setFont(new Font("Arial",1,18));
label1.setBounds(190,10,270,30);
add(label1);

ImageIcon imagen = new ImageIcon ("./images/coca-cola.PNG");
label2 = new JLabel(imagen);
label2.setBounds(330,290,355,190);
add(label2);

box = new JCheckBox ("Yo " + nombre1 + " Acepto");
box.setFont(new Font("Arial",1,15));
box.setBounds(10,330,150,30);
box.addChangeListener(this);
add(box);

boton1 = new JButton ("Continuar");
boton1.setFont(new Font("Arial",1,15));
boton1.setBounds(10,370,130,40);
boton1.addActionListener(this);
boton1.setEnabled(false);
add(boton1);

boton2 = new JButton ("No Acepto");
boton2.setFont(new Font("Arial",1,15));
boton2.setBounds(143,370,130,40);
boton2.addActionListener(this);
boton2.setEnabled(true);
add(boton2);


}

public void stateChanged(ChangeEvent e ){

if (box.isSelected() == true){

boton1.setEnabled(true);
boton2.setEnabled(false);

}

else {
boton1.setEnabled(false);
boton2.setEnabled(true);

}
}

public void actionPerformed(ActionEvent e){

if (e.getSource() == boton1){

Principal form = new Principal();
form.setBounds(0,0,700,720);
form.setVisible(true);
form.setLocationRelativeTo(null);
this.setVisible(false);


}

if(e.getSource() == boton2){

Proyecto form = new Proyecto();
form.setBounds(0,0,450,650);
form.setVisible(true);
form.setLocationRelativeTo(null);
this.setVisible(false);

}
}

public static void main(String args[]){

Licencia form = new Licencia();
form.setBounds(0,0,650,450);
form.setVisible(true);
form.setLocationRelativeTo(null);




}





}
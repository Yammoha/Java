import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class Principal extends JFrame implements ActionListener {

private JMenuBar bar;
private JMenu opciones,calcular,acerca,cfondo;
private JMenuItem nuevo,salir,rojo,negro,morado,vacaciones,creadoras;
private JTextField textnombre,apellidop,apellidom;
private JTextArea area;
private JComboBox dpto,anti;
private JLabel coca,bienvenido,datos,leyenda,nc,ap,am,sd,sa,rc;
String nombre2 = "";

public Principal(){

setLayout(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setTitle("Pantalla Principal");
getContentPane().setBackground (new Color (244,0,0));
Proyecto ventanaBienvenida = new Proyecto ();
nombre2 = ventanaBienvenida.nombre;

bar = new JMenuBar();
setJMenuBar(bar);

opciones = new JMenu ("Opciones");
bar.add(opciones);

calcular = new JMenu("Calcular");
bar.add(calcular);

acerca = new JMenu("Acerca De");
bar.add(acerca);

cfondo = new JMenu("Color de fondo");
opciones.add(cfondo);

nuevo = new JMenuItem ("Nuevo");
nuevo.addActionListener(this);
opciones.add(nuevo);

salir = new JMenuItem ("Salir");
salir.addActionListener(this);
opciones.add(salir);

rojo = new JMenuItem("Rojo");
rojo.addActionListener(this);
cfondo.add(rojo);

negro = new JMenuItem("Negro");
negro.addActionListener(this);
cfondo.add(negro);

morado = new JMenuItem("Morado");
morado.addActionListener(this);
cfondo.add(morado);

vacaciones = new JMenuItem("Vacaciones");
vacaciones.addActionListener(this);
calcular.add(vacaciones);

creadoras = new JMenuItem("Creadoras");
creadoras.addActionListener(this);
acerca.add(creadoras);

textnombre = new JTextField ();
textnombre.setBounds(20,340,100,30);
add(textnombre);

apellidop = new JTextField();
apellidop.setBounds(20,400,100,30);
add(apellidop);

apellidom = new JTextField();
apellidom.setBounds(20,450,100,30);
add(apellidom);

area = new JTextArea ("Aqui aparece el resultado del cálculo de las vacaciones");
area.setBounds(320,470,320,150);
area.setEditable(false);
add(area);

dpto = new JComboBox();
dpto.setBounds(320,340,130,30);
add(dpto);

dpto.addItem ("");
dpto.addItem("Trabajadores de atención al cliente");
dpto.addItem("Trabajadores de logística");
dpto.addItem("Gerentes");


anti = new JComboBox();
anti.setBounds(320,400,130,30);
add(anti);

anti.addItem ("");
anti.addItem("1 año de servicio");
anti.addItem("De 2 a 6 años de servicio");
anti.addItem("7 años o más de servicio");


ImageIcon imagen = new ImageIcon("./images/logo-coca.PNG");
coca = new JLabel(imagen);
coca.setBounds(10,30,250,170);
add(coca);

bienvenido = new JLabel("Bienvenidx "+nombre2);
bienvenido.setBounds(320,40,150,40);
add(bienvenido);

datos = new JLabel("Datos del trabajador para el cálculo de vacaciones");
datos.setBounds(50,220,370,40);
add(datos);

leyenda = new JLabel("©2020 The Coca-Cola Company.");
leyenda.setBounds(200,630,300,30);
add(leyenda);

nc = new JLabel("Nombre Completo");
nc.setBounds(20,315,150,30);
add(nc);

ap = new JLabel("Apellido Paterno");
ap.setBounds(20,350,150,30);
add(ap); 

am = new JLabel("Apellido Materno");
am.setBounds(20,400,150,30);
add(am);

sd = new JLabel("Seleccione el departamento");
sd.setBounds(320,315,190,30);
add(sd);

sa = new JLabel("Seleccione la antigüedad");
sa.setBounds(320,350,190,30);
add(sa);

rc = new JLabel("Resultado del cálculo");
rc.setBounds(320,400,190,30);
add(rc);


}

public void actionPerformed (ActionEvent e){

if (e.getSource () == creadoras){

JOptionPane.showMessageDialog(null, "Las creadoras son Nati y Yami");

}

if (e.getSource () == salir){

Proyecto form = new Proyecto();
form.setBounds(0,0,450,650);
form.setVisible(true);
form.setLocationRelativeTo(null);
this.setVisible (false);

}
 if (e.getSource () == nuevo){

textnombre.setText ("");
apellidop.setText ("");
apellidom.setText ("");
anti.setSelectedIndex (0);
dpto.setSelectedIndex (0);
area.setText ("Aqui aparece el resultado del cálculo de las vacaciones");


} 

if (e.getSource () == rojo){

getContentPane().setBackground (new Color (244,0,0));

}

if (e.getSource () == negro){

getContentPane().setBackground (new Color (0,0,0));

}

if (e.getSource () == morado){

getContentPane().setBackground (new Color (125,0,125));

}

if (e.getSource () == vacaciones){

String textnombre1 = textnombre.getText ();
String apellidom1 = apellidom.getText ();
String apellidop1 = apellidop.getText ();
String seleccion1 = anti.getSelectedItem().toString();
String seleccion2 = dpto.getSelectedItem().toString();




if(apellidom.equals ("")|| apellidop.equals ("")|| textnombre.equals ("")|| seleccion1.equals ("")|| seleccion2.equals ("")){

JOptionPane.showMessageDialog(null, "Debes completar todos los campos");

} else {

if (seleccion2.equals ("Trabajadores de atención al cliente")) {

if (seleccion1.equals ("1 año de servicio")){

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 +  " \n recibe 6 días de vacaciones");

} else if (seleccion1.equals ("De 2 a 6 años de servicio")) {

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 14 días de vacaciones");

}else if (seleccion1.equals ("7 años o más de servicio")) {

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 20 días de vacaciones");

}


}
if (seleccion2.equals ("Trabajadores de logística")) {

if (seleccion1.equals ("1 año de servicio")){

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 7 días de vacaciones");

} else if (seleccion1.equals ("De 2 a 6 años de servicio")) {

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 15 días de vacaciones");

}else if (seleccion1.equals ("7 años o más de servicio")) {

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 22 días de vacaciones");

}

}
if (seleccion2.equals ("Gerentes")) {

if (seleccion1.equals ("1 año de servicio")){

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 10 días de vacaciones");

} else if (seleccion1.equals ("De 2 a 6 años de servicio")) {

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 20 días de vacaciones");

}else if (seleccion1.equals ("7 años o más de servicio")) {

area.setText ("El empleado" + textnombre1 + " " + apellidom1 + " " + apellidop1 + "\n recibe 30 días de vacaciones");

}

}


}


}

}

public static void main (String args []){
Principal form = new Principal();
form.setBounds(0,0,700,720);
form.setVisible(true);
form.setLocationRelativeTo(null);

}



}
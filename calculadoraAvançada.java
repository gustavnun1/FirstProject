package projGit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class calculadoraAvançada extends JPanel{

private JTextField text1;
private JButton mais, menos, vezes, divisão, iguala, zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove;
private JButton virgula;
String operacao;
double num2, num1, result;

    calculadoraAvançada() {
inicializarComponentes();
definirEventos();
}

private void inicializarComponentes() {
setLayout(null);

text1 = new JTextField ();
mais = new JButton ("+");
menos = new JButton ("-");
vezes = new JButton ("x");
divisão = new JButton ("/");
iguala = new JButton ("=");
um = new JButton ("1");
dois = new JButton ("2");
tres = new JButton ("3");
quatro = new JButton ("4");
cinco = new JButton ("5");
seis = new JButton ("6");
sete = new JButton ("7");
oito = new JButton ("8");
nove = new JButton ("9");
zero = new JButton ("0");
virgula = new JButton (".");

text1.setBounds (150, 70, 150, 50);
mais.setBounds(400, 150, 43, 43);
menos.setBounds(400, 200, 43, 43);
vezes.setBounds(400, 250, 43, 43);
divisão.setBounds(400, 300, 43, 43);
iguala.setBounds(380, 400, 70, 50);
virgula.setBounds(400, 350, 43, 43);

um.setBounds(100, 150, 50, 50);
dois.setBounds(180, 150, 50, 50);
tres.setBounds(260, 150, 50, 50);
quatro.setBounds(100, 230, 50, 50);
cinco.setBounds(180, 230, 50, 50);
seis.setBounds(260, 230, 50, 50);
sete.setBounds(100, 310, 50, 50);
oito.setBounds(180, 310, 50, 50);
nove.setBounds(260, 310, 50, 50);
zero.setBounds(180, 400, 50, 50);



um.setBackground(Color.BLACK);
dois.setBackground(Color.BLACK);
tres.setBackground(Color.BLACK);
quatro.setBackground(Color.BLACK);
cinco.setBackground(Color.BLACK);
seis.setBackground(Color.BLACK);
sete.setBackground(Color.BLACK);
oito.setBackground(Color.BLACK);
nove.setBackground(Color.BLACK);
zero.setBackground(Color.BLACK);
virgula.setBackground(Color.BLACK);
iguala.setBackground(Color.BLACK);
mais.setBackground(Color.BLACK);
vezes.setBackground(Color.BLACK);
divisão.setBackground(Color.BLACK);
menos.setBackground(Color.BLACK);




virgula.setForeground(Color.WHITE);
um.setForeground(Color.WHITE);
dois.setForeground(Color.WHITE);
tres.setForeground(Color.WHITE);
quatro.setForeground(Color.WHITE);
cinco.setForeground(Color.WHITE);
seis.setForeground(Color.WHITE);
sete.setForeground(Color.WHITE);
oito.setForeground(Color.WHITE);
nove.setForeground(Color.WHITE);
mais.setForeground(Color.WHITE);
menos.setForeground(Color.WHITE);
vezes.setForeground(Color.WHITE);
divisão.setForeground(Color.WHITE);
iguala.setForeground(Color.WHITE);
zero.setForeground(Color.WHITE);


add (virgula);
add (vezes);
add (mais);
add (menos);
add(iguala);
add (divisão);
add (text1);
add (um);
add (dois);
add (tres);
add (quatro);
add (cinco);
add (seis);
add (sete);
add (oito);
add (nove);
add (zero);
}








private void definirEventos () {

um.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"1");







}
});

dois.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"2");





}
});

tres.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"3");





}
});

quatro.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"4");





}
});

cinco.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"5");





}
});

seis.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"6");





}
});

sete.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"7");





}
});

oito.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"8");





}
});

nove.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"9");





}
});

   zero.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
text1.setText(text1.getText()+"0");





}
});
   
   virgula.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
 
 
 
  text1.setText(text1.getText()+",");
  mais.setEnabled(true);
  menos.setEnabled(true);
  vezes.setEnabled(true);
  divisão.setEnabled(true);
  virgula.setEnabled(false);
  iguala.setEnabled(true);

  num1 = Double.valueOf(text1.getText());
 





  }
  });


mais.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

num1 = Integer.valueOf(text1.getText());
text1.setText("");
String operacao = "soma";
mais.setEnabled(false);
menos.setEnabled(false);
vezes.setEnabled(false);
divisão.setEnabled(false);
iguala.setEnabled(true);
virgula.setEnabled(false);



}
});

menos.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {


 num1 = Integer.valueOf(text1.getText());
text1.setText("");
String operacao = "menos";
mais.setEnabled(false);
menos.setEnabled(false);
vezes.setEnabled(false);
divisão.setEnabled(false);
virgula.setEnabled(false);
iguala.setEnabled(true);





}
});


vezes.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

num1 = Integer.valueOf(text1.getText());
String operacao = "vezes";
mais.setEnabled(false);
menos.setEnabled(false);
vezes.setEnabled(false);
divisão.setEnabled(false);
iguala.setEnabled(true);
virgula.setEnabled(false);






}
});


divisão.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

num1 = Integer.valueOf(text1.getText());
String operacao = "divisao";
mais.setEnabled(false);
menos.setEnabled(false);
vezes.setEnabled(false);
divisão.setEnabled(false);
iguala.setEnabled(true);
virgula.setEnabled(false);


}
});



iguala.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {


    num2 = Integer.valueOf(text1.getText());
if (operacao == "soma"){
result = num1 + num2;

}
else if (operacao == "menos") {
result = num1 - num2;



}
else if (operacao =="vezes") {
result = num1 * num2;


}

else if (operacao == "divisao"){
result = num1 / num2;
}

text1.setText(String.valueOf(result));

mais.setEnabled(true);
menos.setEnabled(true);
vezes.setEnabled(true);
divisão.setEnabled(true);
iguala.setEnabled(false);

}
});}






public static void main(String args[]){
  JFrame frame = new JFrame("Calculadora");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new calculadoraAvançada());
frame.setBounds(200,200,500,500);
frame.setVisible(true);


}}
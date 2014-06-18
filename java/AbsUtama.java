import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Kalkulator extends Applet{
Label lab;
boolean digitPertama = true;
float nilaiTersimpan = 0.0f;
String operator = "=";

public void init(){
setLayout(new BorderLayout());
add("North", lab = new Label ("0", Label.RIGHT));
Panel p = new Panel();
p.setLayout(new GridLayout(4,4));
buatBeberapaTombol(p,"789/");
buatBeberapaTombol(p,"456*");
buatBeberapaTombol(p,"123-");
buatBeberapaTombol(p,".0=+");
add("Center",p);
}
public void hitung(String s){
String st;
float nilai = new Float(s).floatValue();
char c = operator.charAt(0);
switch(c){
case'=' : nilaiTersimpan = nilai;
break;
case'+' : nilaiTersimpan += nilai;
break;
case'-' : nilaiTersimpan -= nilai;
break;
case'*' : nilaiTersimpan *= nilai;
break;
case'/' : nilaiTersimpan /= nilai;
break;
}
lab.setText(String.valueOf(nilaiTersimpan));
}
public void buatBeberapaTombol(Panel p, String strTombol){
int jumlah = strTombol.length();
for(int i=1; i<jumlah; i++){
Button b = new Button(strTombol.substring(i,i+1));
b.addActionListener(
                new Kalkulator.PenanganTombol());
p.add(b);
}
}
class PenanganTombol implements ActionListener{
public void actionPerformed(ActionEvent e){
String s = e.getActionCommand();
if("0123456789.".indexOf(s)!=-1){
if(digitPertama){
digitPertama = false;
lab.setText(s);
}
else {
lab.setText(lab.getText()+s);
}
}
else{//Berarti operator
if(!digitPertama){
hitung(lab.getText());
digitPertama = true;
}
operator = s;
}
}
}
}

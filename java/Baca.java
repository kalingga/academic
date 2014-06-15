import javax.swing.JOptionPane;
public class Baca {

	public static void main(String[] args){
		String angka, huruf;
		int ang;
		
		angka=JOptionPane.showInputDialog("angka");
		ang=Integer.parseInt(angka);
				
		
		if (ang==1)
		{
			huruf="Satu";
		} 
		else if (ang==2)
		{
			huruf="Dua";
		}
		else if (ang==3)
		{
			huruf="Tiga";
		}
		else if (ang==4)
		{
			huruf="Empat";
		}
		else if (ang==5)
		{
			huruf="Lima";
		}
		else{
			huruf="Error";
			}
		
		String msg="Angka  |  Huruf\n" + angka + " | " + huruf;
		
		
		JOptionPane.showMessageDialog(null, msg);
	}
}

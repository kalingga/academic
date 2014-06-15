import javax.swing.JOptionPane;
public class Latihan1 {

	public static void main(String[] args){
		String A,B,C,smile;
		int A1,B1,C1,rata;
		A=JOptionPane.showInputDialog("A");
		B=JOptionPane.showInputDialog("B");
		C=JOptionPane.showInputDialog("C");
		
		A1=Integer.parseInt(A);
		B1=Integer.parseInt(B);
		C1=Integer.parseInt(C);
		
		rata=(A1+B1+C1)/3;
		
		if (rata>=60)
		{
			smile="Senang | :)";
		} else {
			smile="Sedih sekali | :'(";
		}
		
		String msg="A : " + A + "\n" + "B : " + B + "\n" + "C : " + C + "\n" + "Rata-rata : " + rata + "\n" + "Mood : " + smile;
		
		
		JOptionPane.showMessageDialog(null, msg);
	}
}

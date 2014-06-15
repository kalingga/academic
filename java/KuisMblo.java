import javax.swing.JOptionPane;
public class KuisMblo {
	
	public static void main(String[] args){
	
	String awal, akhir;
	int a,b,x;
	
	awal=JOptionPane.showInputDialog("Masukkan Nilai Awal");
	akhir=JOptionPane.showInputDialog("Masukkan Nilai Akhir");
	
	a=Integer.parseInt(awal);
	b=Integer.parseInt(akhir);
	
	while (a > b){
		
    
    if ((a % 4) == 0){
		
		System.out.println("Nilainya " + a);
		//x
		a--;
		}
		//else { System.out.println("error"); }
		
    
    }
	
	
		
	
	}
		
}

import javax.swing.JOptionPane;
public class Input {

	public static void main(String[] args){
		String name="";
		name=JOptionPane.showInputDialog("Nama");
		String msg="Hallo " + name + "!";
		JOptionPane.showMessageDialog(null, msg);
	}
}

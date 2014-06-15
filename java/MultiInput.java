import javax.swing.*;


public class MultiInput {
public static void main(String[] args) {
try {
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
}finally{

JTextField Nama = new JTextField(10);
JTextField Jurusan = new JTextField(10);

JPanel myPanel = new JPanel();
myPanel.add(new JLabel(“Nama”));
myPanel.add(Nama);
myPanel.add(Box.createHorizontalStrut(15));
myPanel.add(new JLabel(“Jurusan”));
myPanel.add(Jurusan);

int result = JOptionPane.showConfirmDialog(null, myPanel, “Masukkan nama dan jurusan”, JOptionPane.OK_CANCEL_OPTION);
if (result == JOptionPane.OK_OPTION) {
JOptionPane.showMessageDialog(null, “Nama : “+Nama.getText()+”\nJurusan : “+Jurusan.getText());
}

}

}

}

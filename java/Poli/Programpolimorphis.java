//program utama
public class Programpolimorphis extends java.applet.Applet
{
    /**Main method*/
    public void paint(java.awt.Graphics g)
    {
        g.drawString("Program Polimorphis", 50, 10);
        g.drawString("======================", 50, 20);
        //membuat objek-objek raut(ekspresi) dari wajah
        Bentukwajah objbentuk=new Bentukwajah();
        Senyum objsenyum=new Senyum();
        Tertawa objtertawa=new Tertawa();
        Marah objmarah=new Marah();
        Sedih objsedih=new Sedih();
        //polimorphis dari bentuk wajah ada 5 dimulai dari 0-4
        Bentukwajah []Bentuk=new Bentukwajah[5];
        Bentuk[0]=objbentuk;
        Bentuk[1]=objsenyum;
        Bentuk[2]=objtertawa;
        Bentuk[3]=objmarah;
        Bentuk[4]=objsedih;
        g.drawString("Bentuk[0]:"+Bentuk[0].respons(), 50, 30);
        g.drawString("Bentuk[1]:"+Bentuk[1].respons(), 50, 40);
        g.drawString("Bentuk[2]:"+Bentuk[2].respons(), 50, 50);
        g.drawString("Bentuk[3]:"+Bentuk[3].respons(), 50, 60);
        g.drawString("Bentuk[4]:"+Bentuk[4].respons(), 50, 70);
    }
}

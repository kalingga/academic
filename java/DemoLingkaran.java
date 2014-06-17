class Geometri{
	protected double r;
	 
	public Geometri(double r){
	   this.r = r;
	}
}

class Lingkaran extends Geometri{
	final double phi = 3.14;

	public Lingkaran(double r){
	   super(r);
	   this.r = r;
	}
	public double LuasLingkaran(){
	   return (phi * r * r);
	}

	public double KelilingLingkaran(){
	   return (2 * phi * r);
	}
}

public class DemoLingkaran extends java.applet.Applet{
    public void paint(java.awt.Graphics g){
    	Lingkaran ling = new Lingkaran(4);

		g.drawString("Luas = " + ling.LuasLingkaran(), 50,25);
		g.drawString("Keliling = " + ling.KelilingLingkaran(), 50,50);
 	}

}

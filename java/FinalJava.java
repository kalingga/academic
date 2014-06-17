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

   public class DemoLingkaran{
      public static void main(String[] args){
 Lingkaran ling = new Lingkaran(4);

 System.out.println("Luas = " + ling.LuasLingkaran());
 System.out.println("Keliling = " +           
                             ling.KelilingLingkaran());
      }

   }

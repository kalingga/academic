public class DemoPoli {
 
   public static void main(String[ ] args) {
 
      cetakObjek(new Balok());
      cetakObjek(new PersegiPanjang());
      cetakObjek(new BangunDatar());
      cetakObjek(new Object());
   }
    
   public static void cetakObjek(Object objek) {
      System.out.println(objek);
   }
 
} // Akhir kelas Polimorphism
 
class Balok extends PersegiPanjang {
   public String toString() {
	System.out.print("Balok ");
      return "Mempunyai sisi panjang, lebar dan tinggi";
   }
}
 
class PersegiPanjang extends BangunDatar {
   public String toString() {
	System.out.print("Persegi Panjang ");
      return "Mempunyai sisi panjang dan lebar";
   }
}
 
class BangunDatar extends Object {
   public String toString() {
	System.out.print("Bangun Datar ");
      return "Mempunyai berbagai bentuk";
   }
}

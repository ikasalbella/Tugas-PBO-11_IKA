
/**
 * Nama: Ika
 * NIM: 20210040096
 * Kelas: TI21F
 * @author Asus
 *  PBO Sesi 11
 */
public class ThrowExample {
     static void demo()
 {
 NullPointerException t;
 t=new NullPointerException("Coba Throw");
 throw t;
 // Baris ini tidak lagi dikerjakan;
 System.out.println("Ini tidak lagi dicetak");
 }
 public static void main(String[] args) {
 try
 {
 demo();
 System.out.println("Selesai");
 }
 catch(NullPointerException e)
 {
 System.out.println("Ada pesan error: "+e);
 }
 }
}
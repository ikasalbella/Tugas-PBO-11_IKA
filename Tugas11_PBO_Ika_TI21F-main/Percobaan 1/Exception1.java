
/**
 * Nama: Ika
 * NIM: 20210040096
 * Kelas: TI21F
 * @author Asus
 *  PBO Sesi 11
 */
public class Exception1 {
    public static void main(String[] args) {
 int a[]=new int[5];
 try
 {
 a[5]=100;
 }
 catch(Exception e)
 {
 System.out.println("Terjadi pelanggaran memory");
 }
 }
}
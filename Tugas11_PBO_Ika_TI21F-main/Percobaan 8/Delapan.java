
import java.io.IOException;

/**
 * Nama: Ika
 * NIM: 20210040096
 * Kelas: TI21F
 * @author Asus
 *  PBO Sesi 11
 */
public class Delapan {
    public void methodA(){
 System.out.println("Method A");
 }
 public void methodB() throws IOException
 {
 System.out.println(20/0);
 System.out.println("Method B");
 }
}
10
class Utama
{
 public static void main(String[] args) throws IOException
 {
 Test3 c=new Test3();
 c.methodA();
 c.methodB();
 }
}

/**
 * Nama: Ika
 * NIM: 20210040096
 * Kelas: TI21F
 * @author Asus
 *  PBO Sesi 11
 */

 class RangeErrorException extends Throwable {
    public RangeErrorException(String s)
 {
 super(s);
 }
12
 
 public static void main(String[] args)
 {
 int position=1;
 try
 {
 if(position>0)
 {
 throw new RangeErrorException("Position " +position);
 }
 }
 catch(RangeErrorException e)
 {
 System.out.println("Range error: " +e.getMessage());
 }
 System.out.println("This is the last program.");
 }
}
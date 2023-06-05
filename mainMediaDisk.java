
/**This is the main class that will be used to run the Media Disk class and its sub-classes.*/

public class mainMediaDisk
{
    public static void main(String[]args) 
    {
        try {
        
            /**Creating DVD and Audio objects and also putting them into an array.*/ 
            MediaDisk arrMediaDisk[] = new MediaDisk[10];
            
            arrMediaDisk[0] = new DVD(3, 76.50, "John Wick: C1", 94, 199.00);
            arrMediaDisk[1] = new DVD(3, 76.50, "John Wick: C2", 105, 199.90);
            arrMediaDisk[2] = new DVD(12, 76.50, "Daredevil", 75, 150.09);
            arrMediaDisk[3] = new Audio(25, 55.50, "Off Season: J Cole", 49, 99.00);
            arrMediaDisk[4] = new Audio(14, 55.50, "Scorpion: Drake", 62, 75.01);
            arrMediaDisk[5] = new Audio(33, 55.50, "Isina Muva: Sjava ", 66, 102.59);
            
            for(int i = 0 ; i < arrMediaDisk.length;i++){ 
                System.out.println("CD " + i + " is a " + arrMediaDisk[i] + "with a rent amount of " 
                + arrMediaDisk[i].calRentAmount()); //Output from the sub-classes and this class all together.
               }
        }
        catch(Exception e){
      }
        
    }
}

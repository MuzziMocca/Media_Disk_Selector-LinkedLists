
/** This is the Super class which the sub-classes, Audio and DVD will 
 * inherit the attributes from.*/

public abstract class MediaDisk implements Comparable<MediaDisk>
{
    private int rentTime; //How long the CD may last in days.
    private double rentCharge; //Both DVDs and Audio CDs have a different rent charge.
    private String mediaDiskName;
    private int mediaDiskPlayback; //CD duration in minutes.
    
    /**Constructors*/
    //Default constructor
    protected MediaDisk(){}
    
    /**Full constructor*/
    protected MediaDisk(int rentTime, double rentCharge, String mediaDiskName, int mediaDiskPlayback) { 
        this.rentTime = rentTime;
        this.rentCharge = rentCharge;
        this.mediaDiskName = mediaDiskName;
        this.mediaDiskPlayback = mediaDiskPlayback;
    }
     
    /**Getter methods*/ 
    public int getRentTime(){
        return rentTime; 
     }
     
     
     public double getRentCharge(){
        return rentCharge; 
     }
     
     public String getMediaDiskName(){
        return mediaDiskName; 
     }
     
     public int getMediaDiskPlayback(){
        return mediaDiskPlayback; 
    }
     
    /**Settermethods*/ 
    public void setRentCharge(double rentCharge){
        this.rentCharge = rentCharge;
     } 
     
    public void setRentTime(int rentTime){
        this.rentTime = rentTime;
     } 
     
    public void setCDname(String mediaDiskName){
        this.mediaDiskName = mediaDiskName;
     } 
     
    public void setMediaDiskPlayback(int mediaDiskPlayback){
        this.mediaDiskPlayback = mediaDiskPlayback; 
     } 
     
   
     
    /**Abstract method calRentAmount*/ 
    public abstract double calRentAmount();
}

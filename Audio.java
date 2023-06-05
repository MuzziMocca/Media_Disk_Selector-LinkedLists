
/**This is the Audio media sub-class that inherits attributes from the 
superclass MediaDisk*/

public class Audio extends MediaDisk
{
    private double AUDIOprice;

    /**Constructors*/
    //Default constructor
    public Audio(){}

    /**Full constructor*/
    public Audio(int rentTime, double rentCharge, String mediaDiskName, int mediaDiskPlayback, double AUDIOprice){ 
        super(rentTime, rentCharge, mediaDiskName, mediaDiskPlayback);
        this.AUDIOprice = AUDIOprice;
        
    }
    

    /**Getter method*/ 
    public double getAUDIOprice(){
        return AUDIOprice; 
     }

     /**Setter method*/ 
    public void setAUDIOprice(int AUDIOprice){
        this.AUDIOprice = AUDIOprice; 
    }
    
    
    /**Abstract method from the super class.*/ 
    //Calculates the rental value for renting an Audio.
    public double calRentAmount(){
        double totRentAmount;
        if(getRentTime() <= 14)
            totRentAmount  = ((getRentCharge() + AUDIOprice)) + (getRentTime() * 0.10); //Percentages charges based on days.
        else if(getRentTime() > 14 && getRentTime() <= 28)
            totRentAmount = ((getRentCharge() + AUDIOprice)) + (getRentTime() * 0.20); 
        else
            totRentAmount = ((getRentCharge() + AUDIOprice)) + (getRentTime() * 0.30); 
            
        return totRentAmount;
    }
    
    /**compareTo method to be used to sort and filter the media disk in MyArrayList class*/
    public int compareTo(MediaDisk g) {
      
    if(this.getClass().equals(g.getClass()))
    {
     Audio a = (Audio)g;   
    if (this.calRentAmount() == a.calRentAmount())
        return 0;
    else
        if (this.calRentAmount() < a.calRentAmount())
            return -1;
        else
            return 1;
    }else
     return this.getClass().getName().compareTo(g.getClass().getName());
    }
    
    /**toString method to be used in the test class*/ 
    public String toString(){
        return ("Audio titled " + getMediaDiskName() + ", playing for " + getMediaDiskPlayback() + " minutes and rented for " + getRentTime() + " days ");
    }
    
}

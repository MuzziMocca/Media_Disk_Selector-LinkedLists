
/**This is the DVD media sub-class that inherits attributes from the 
superclass MediaDisk*/

public class DVD extends MediaDisk 
{
    private double DVDprice;

    /**Constructors*/
    //Default constructor
    public DVD(){}
    
    /**Full constructor*/
    public DVD(int rentTime, double rentCharge, String mediaDiskName, int mediaDiskPlayback, double DVDprice){ 
        super(rentTime, rentCharge, mediaDiskName, mediaDiskPlayback);
        this.DVDprice = DVDprice;
        
    }
    

    /**Getter method*/ 
    public double getDVDprice(){
        return DVDprice; 
     }

    public void setDVDprice(int DVDprice){
        this.DVDprice = DVDprice; 
    }
    
    
    /**Abstract method from the super class.*/
    //Calculates the rental value for renting a DVD. 
    public double calRentAmount(){
        double totRentAmount;
        if(getRentTime() <= 14)                                            
            totRentAmount  = ((getRentCharge() + DVDprice)) + (getRentTime() * 0.10);   //Percentages charges based on days.
        else if(getRentTime() > 14 && getRentTime() <= 28)
            totRentAmount = ((getRentCharge() + DVDprice)) + (getRentTime() * 0.20); 
        else
            totRentAmount = ((getRentCharge() + DVDprice)) + (getRentTime() * 0.30); 
            
        return totRentAmount;
    }
    
    /**compareTo method to be used to sort and filter the media disk in MyArrayList class*/
    public int compareTo(MediaDisk g) {
      
    if(this.getClass().equals(g.getClass()))
    {
     DVD d = (DVD)g;   
    if (this.calRentAmount() == d.calRentAmount())
        return 0;
    else
        if (this.calRentAmount() < d.calRentAmount())
            return -1;
        else
            return 1;
    }else
     return this.getClass().getName().compareTo(g.getClass().getName());
    }
     
    /**toString method to be used in the main class*/ 
    public String toString(){
        return ("DVD titled " + getMediaDiskName() + ", playing for " + getMediaDiskPlayback() + " minutes and rented for " + getRentTime() + " days ");
    }
    
}

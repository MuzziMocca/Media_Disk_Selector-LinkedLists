
/** Main class for testting myLinkedList class*/
public class mainLinkeList
{
    public static void main(String[]args) 
    {
        try {
            myLinkedList<MediaDisk> myList = new myLinkedList<MediaDisk>();
            myLinkedList<MediaDisk> myList1 = new myLinkedList<MediaDisk>();
            
            System.out.println("Test using Reverse() method:");
            System.out.println("Testing an empty list...");
            System.out.println("My list is: " + myList);
            myList1 = myList.Reverse();
            System.out.println("My reversed list is: " + myList1 + "\n");
            
            
            System.out.println("Testing one item(3, 76.50, John Wick: C1, 94, 199.00) in a linked list...");
            /**DVD(3, 76.50, John Wick: C1, 94, 199.00) is an object and therefore not a 
             * list but one item*/
            myList.prepend(new DVD(3, 76.50, "John Wick: C1", 94, 199.00));
            System.out.println("My list is: " + myList);
            myList1 = myList.Reverse();
            System.out.println("My reversed list is: " + myList1 + "\n");
            myList1.clear();
            
            System.out.println("Testing myList...");
            myList.append(new DVD(3, 76.50, "John Wick: C2", 105, 199.90));  
            myList.append(new Audio(14, 55.50, "Scorpion: Drake", 62, 75.01)); 
            myList.append(new Audio(33, 55.50, "Isina Muva: Sjava ", 66, 102.59));
            System.out.println("My list is: " + myList);
            myList.Reverse();
            System.out.println("My reversed list is: " + myList + "\n");
        }
        catch(Exception e){
      }
            myLinkedList<Integer> mySearchList = new myLinkedList<Integer>();
            
            System.out.println("Test using Search() method:");
            System.out.println("Testing empty list...");
            System.out.println("My list is: " + mySearchList);
            mySearchList.Search(2);
            System.out.println("Searched " + mySearchList + "\n");
            
            System.out.println("Testing one item(2)...");
            mySearchList.prepend(new Integer(2));
            System.out.println("My list: " + mySearchList);
            mySearchList.Search(2);
            System.out.println("Searched " + mySearchList + "\n");
            
            System.out.println("Testing an unavailable item(6)...");
            mySearchList.Search(6);
            System.out.println("Searched " + mySearchList + "\n");
            
            mySearchList.append(new Integer(34));  
            mySearchList.append(new Integer(50));
            mySearchList.append(new Integer(53)); 
            mySearchList.append(new Integer(19));
            System.out.println("Testing myList...");
            System.out.println("My list: " + mySearchList);
            mySearchList.Search(53);
            System.out.println("Searched " + mySearchList + "\n");
            
            /**With enough time I can test or rather debug myLinkedList class 
             * using Scanner for input.*/
    }
}


    /** @author: Brian Klein
 *  Date: 3-21-17
 *  Program: MembershipCard.java
 *  Purpose: This is a User-defined class         
 */
 
 
public class MembershipCard 
{  

      //data members - instance variables
      
   private int memberID;
   private String name;
   private int numberOfPoint;
   
   public static final int FREE_POINTS = 5;
   
   /**
    * default constructor
    */
   public MembershipCard() {
      this(0, "Unknown", 0);   //invoke another constructor
   }
   
   /**
    * Constructs a new MembershipCard object
    *
    * @param memberID         The member ID
    * @param name             The member name
    * @ param numberOfPoint   The total points
    */
   public MembershipCard(int memberID, String name, int numberOfPoint) {
      if(memberID > 0) {
         this.memberID = memberID;
      }
      else {
         this.memberID = 00000;
      }
      
      this.name = name;
      
      if(numberOfPoint > 0) {
         this.numberOfPoint = numberOfPoint + FREE_POINTS;
      }
      else {
         this.numberOfPoint = FREE_POINTS;
      }
   }
  
      //setters and getters
   public void setMemberID( int id ) {
      this.memberID = memberID;
   }
   
   /**
    * @return the member ID
    */
   public int getMemberID() {
      return this.memberID;
   }
   
   public void setName( String n ) {
      this.name = name;
   }
   
   public String getName() {
      return this.name;
   }
   
      //do not provide setNumberOfPoint method
      
   public int getNumberOfPoint() {
      return this.numberOfPoint;
   } 
     
      //a method to purchase more points
   public void purchasePoints( int points ) {
      if(points > 0) {
         numberOfPoint += points;
      }
      else {
         System.out.println("Points to purchase must be greater than 0.");
      }
   }
   
      //a method to enter the club, deduct one point
   public void enterClub() {
      if(numberOfPoint > 0) {
         numberOfPoint --;
      }
      else {
         System.out.println("There are no points on this card.");
      }
   }
   
      //override toString method
   public String toString() {
      return "\nMember ID: " + memberID +
             "\nName: " + name +
             "\nTotal Points: " + numberOfPoint;
   }
   
   
      
}//end class
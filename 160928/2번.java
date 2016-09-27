
package absolute;


public class silhang {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    CreditCard myCard = new CreditCard();
    
    
    myCard.setNumber(3456_7654_8765_5647L) ;
    myCard.setOwner("ŔĚźö°­");
    myCard.setDate(2015,6,15);
    myCard.setPoint(110);   
    myCard.usePoint(30);
    myCard.display();
    
    
  }

}

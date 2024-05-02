import java.util.Scanner;
class ATMInterface {
public static void  main(String[] args) 
{
 int balance=100000;
 int depoist,withdraw;
 Scanner sc=new Scanner(System.in);
 while(true)
 {
  System.out.println("ATM Machine\n");
  System.out.println("Choose 1 for Withdraw");
  System.out.println("Choose 2 for Depoist");
  System.out.println("Choose 3 for Totalbalance");
  System.out.println("Choose 4 for exit");
  System.out.print("Select operation you want to  perform");
  
  int choice=sc.nextInt();
  switch(choice) {
  case 1: System.out.print("Enter amount to be withdrawn:");
  withdraw=sc.nextInt();
  if(balance>=withdraw)
  {
   balance-=withdraw;
   
   System.out.println("Please collect your widthraw money");
    }
	else {
	System.out.println("Insufficient balance");
	}
	break;
	
	case 2:System.out.println("Enter amount to  be Depoist");
    depoist=sc.nextInt();
	balance+=depoist;
	System.out.println("Successfully Depoisted");
	break;
	
	case 3:System.out.println("Total Balance "+ balance);
	break;
	
	case 4:System.exit(0);
	break;
	default:
	System.out.println("Invalid Chioce");
	}
   }
  }
}
import java.util.Scanner;

class AtmInter
{
     int balance=10000;

    public int checkBalance() {
    
        return balance;
    }

    public void depositAmmount(int amount) 
    {
        if(amount>0){
        balance = balance + amount;
        System.out.println("Deposit amount:"+amount +" Your Current Balance is:"+balance);
        }
        else{

            System.out.println("Enter correct amount");
        }
    }
    public void withdrawAmmount(int amount){
        if(amount>0 && amount<=balance){
        balance= balance-amount;
        System.out.println("withdrawed amount is: "+amount+ "your Current Balance is :"+balance);
        }
        else{
            System.out.println("invalid amount or Insufficient balance");
        }
        
    }
}
    class Atm {
        private AtmInter account = new AtmInter();
        Scanner sc= new Scanner(System.in);

        public void displayOption(){
        System.out.println("choose 1 for check Balance :");
        System.out.println("choose 2 for deposit :");
        System.out.println("choose 3 withdraw for  :");
        System.out.println("choose 4 for Exit :");
        }
        
        public void transactionProcess(){
            System.out.println("Enter correct option");
            int option= sc.nextInt();
            switch (option) {
                case 1:
                System.out.println("Current Balance is :"+account.checkBalance());
                    break;
                case 2:
                System.out.println("Enter Ammount to Deposit");
                int deposit= sc.nextInt();
                account.depositAmmount(deposit);
                
                    break;
                case 3:
                System.out.println("Enter Ammount for withdraw");
                int withdraw = sc.nextInt();
                account.withdrawAmmount(withdraw);
                
                    break;
            
                default:
                System.exit(0);
                    break;
            }


        }
    }
    class AtmInterface{

    public static void main(String args[])
        {
           Atm atm = new Atm();
           atm.displayOption();
           atm.transactionProcess();





       
    }
}
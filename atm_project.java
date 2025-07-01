import java.util.Scanner;
public class atm_project {
    int pin=2004;
    float balance;
    public void checkPin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin :");
        int ent_pin=sc.nextInt();
        if(ent_pin==pin){
            menu();
        }
        else{
            System.out.println("Enter the correct pin!");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("Enter your Choice :-");
        System.out.println("1.Check A/C balance");
        System.out.println("2.Withdrawl Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice == 1){
            checkBal();
        }
        else if(choice==2){
            withdrawl_money();
        }
        else if(choice==3){
            deposit_money();
        }
        else if(choice==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice :-");
        }

    }
    public void checkBal(){
        System.out.println("Your A/C balance is :- "+balance);
        menu();
    }
    public void withdrawl_money(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdrawl amount :-");
        int Withdrawl=sc.nextInt();
        if(Withdrawl>balance){
            System.out.println("Insufficient balance!!");
            withdrawl_money();
        }
        else{
            balance=balance-Withdrawl;
            System.out.println("Availble balance is :- "+balance);
        }
        menu();
    }
    public void deposit_money(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit :-");
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Money Deposited Successfully!!");
        System.out.println("Availble balance is :- "+balance);
        menu();
    }
    public static void main(String[] args) {
        atm_project obj=new atm_project();
        obj.checkPin();
    }
}

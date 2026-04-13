
public class InsufficentBalanceException extends Exception{
 InsufficentBalanceException(String msg){
 super(msg);
 }
 }
 } 
ṣpublic class BankSystem {
int balance = 1000;
public void withdraw(int amount) {
try{
if (amount > balance) {
throw new InsufficientbalanceException("Insufficient balance");
}
balance = balance - amount;
System.out.println("amount withdrawn succesfully: "+ balance);
} catch (InsufficientbalanceException){
System.out.println(Exception handled inside method: +e.gettingmessage());
}
}
public static void main(string[] args) {
 BankSystem bs = new BankSystem();
 

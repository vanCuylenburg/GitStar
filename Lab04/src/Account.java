// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
// *******************************************************
/**auther and version.
 * @version 1.0
 * @author navan_000
 *
 */
public class Account {

/**stating variable.
 * 
 */
private double balance;
/**stating variable.
 * 
 */
private String name;
/**stating variable.
 * 
 */
private long acctNum;
/**stating class.
 * @param initBal
 * just because i had to
 * @param owner
 * just because i had to
 * @param number
 * just because i had to
 */
public Account(double initBal, String owner, long number) {

balance = initBal;
name = owner;
acctNum = number;
}
/**because i needed a param.
 *@param blarg
 * @param amount
 * cuz i need to
 */
public void withdraw(double amount) {

if (balance >= amount) {
balance -= amount;
} else { 
System.out.println("Insufficient funds");
}
}
/**because i needed a param.
 * @param blarg
 * @param amount
 * because i need it
 */
public void deposit(double amount) {

balance += amount;
}
/**stating variable.
 * @return blarg
*/
public double getBalance() {

return balance;
}
/**because i needed a param.
 * @return blarg
 * 
 */
public String toString() {

return name + balance + acctNum;



}
/**because i need to.
 * @return blarg
 * 
 */
public double chargeFee() {

final int ten = 10;
balance = balance - ten;
return balance;


}
/**because i needed a param.
 * 
 * @param newName
 * dumb stuff
 */
public void changeName(String newName) {


name = newName;


}
}

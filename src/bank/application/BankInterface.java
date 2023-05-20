package bank.application;

public interface BankInterface {

     int checkBalance(String password);

     String addMoney(int money);  //add money


     String withdrawMoney(int money,String password);
     String changePassword(String oldPassword,String newPassword);

     double calculateTotalInterest(int years);

    /*
    // TODO WE WILL TRY TO TRANSFER MONEY WITHIIN THE SAME BANK


     */

}

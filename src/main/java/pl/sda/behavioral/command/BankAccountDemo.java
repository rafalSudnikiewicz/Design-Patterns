package pl.sda.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Random random = new Random();
        List<BankCommand> bankCommandList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bankCommandList.add(new DepositMoneyCommand(account,random.nextInt(100)));
        }
        for (BankCommand command: bankCommandList){
            command.execute();
            System.out.println("Balance: "+ account.getBalance());
        }

        for (int i = bankCommandList.size()-1; i >=0 ; i--) {

            bankCommandList.get(i).undo();
            System.out.println("Balance: "+ account.getBalance());
        }
    }
}

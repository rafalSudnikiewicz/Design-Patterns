package pl.sda.behavioral.command;

public class WithdrawMoneyCommand implements BankCommand {
    private final BankAccount bankAccount;
    private final int amount;
    private int operationCounter=0;



    public WithdrawMoneyCommand(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(amount);
        operationCounter++;
    }

    @Override
    public void undo() {
        if(operationCounter>0) {
            bankAccount.deposit(amount);
            operationCounter--;
        }
    }
}

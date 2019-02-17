package pl.sda.behavioral.command;

public class DepositMoneyCommand implements BankCommand {
    private final BankAccount bankAccount;
    private final int amount;
    private int operationCounter = 0;

    public DepositMoneyCommand(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        bankAccount.deposit(amount);
        operationCounter++;
    }

    @Override
    public void undo() {
        if (operationCounter > 0) {
            bankAccount.withdraw(amount);
//            operationCounter--;
        }
    }

}

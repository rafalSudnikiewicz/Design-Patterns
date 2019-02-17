package pl.sda.behavioral.command;

public interface BankCommand {
    public void execute();

    public void undo();
}

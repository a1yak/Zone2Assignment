package anton.aliaksansandrau.command;

public class DeleteCustomerOrder implements Command{
    OrderForCommand orderForCommand;

    public DeleteCustomerOrder(OrderForCommand orderForCommand) {
        this.orderForCommand = orderForCommand;
    }

    @Override
    public void execute() {
        orderForCommand.deleteOrder();
    }
}

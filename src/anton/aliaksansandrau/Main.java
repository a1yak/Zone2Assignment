package anton.aliaksansandrau;


import anton.aliaksansandrau.bridge.CustomerOrder;
import anton.aliaksansandrau.bridge.ReceivedOrder;
import anton.aliaksansandrau.state.PictureForState;
import anton.aliaksansandrau.command.CreateCustomerOrder;
import anton.aliaksansandrau.command.CustomerOrderForCommand;
import anton.aliaksansandrau.command.DeleteCustomerOrder;
import anton.aliaksansandrau.command.OrderForCommand;
import anton.aliaksansandrau.command.OrderRemoteControl;
import anton.aliaksansandrau.decorator.PaperDecorator;
import anton.aliaksansandrau.decorator.SimplePicture;


public class Main {

    public static void main(String[] args) {
        //Bridge - Decouples an abstraction from its implementation so that the two can vary independently.
        System.out.println("BRIDGE PATTERN");
        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.showOrderDetails();
        ReceivedOrder receivedOrder = new ReceivedOrder();
        receivedOrder.showOrderDetails();

	   //Build a new picture using Builder pattern
        System.out.println("\nBUILDER PATTERN");
        final Picture builtPicture = PictureBuilder.aPainting()
                .withPaperType("400 g/m^2, A3")
                .withColorType("Acrylic colors")
                .withArtist("Trevor, Abbert")
                .build();
        printPaintingInfo(builtPicture);

        //Decorator in use. Decorator helps to add additional behavior in an existing method of an object.
        System.out.println("\nDECORATOR PATTERN");
        anton.aliaksansandrau.decorator.Picture picture = new SimplePicture();
        System.out.println(picture.use());
        picture = new PaperDecorator(picture);
        System.out.println(picture.use());

        //State - Allows an object to alter its behavior when its internal state changes.
        System.out.println("\nSTATE PATTERN");
        final PictureForState pictureForState = new PictureForState();
        System.out.println(pictureForState.getStateDescription());
        System.out.println("Let's push the button 3 times");
            for (int i = 0; i < 3; ++i) {
                pictureForState.pushTheButton();
            }

        //Command - Creates objects which encapsulate actions and parameters.
        // Allows the client to issue a request without knowing anything
        // about the operation or the receiver of the request.
        System.out.println("\nCOMMAND PATTERN");
        OrderForCommand customerOrderCommand = new CustomerOrderForCommand();
        OrderRemoteControl createOrder = new OrderRemoteControl(new CreateCustomerOrder(customerOrderCommand));
        createOrder.pressButton();

        OrderRemoteControl deleteOrder = new OrderRemoteControl(new DeleteCustomerOrder(customerOrderCommand));
        deleteOrder.pressButton();
        System.out.println();
    }

    private static void printPaintingInfo(final Picture picture){

    System.out.println("Printing picture information: "
            + "\n"  + "Paper Type and size: " + picture.getPaperType()
            + "\n" + "Color type: " + picture.getColor_type()
            + "\n" + "Artist: " + picture.getArtist());
    }

}

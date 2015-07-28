/**
 * Created by Jitendra Kadu on 7/28/2015.
 */
public class MainClass {

    public static void main(String args){

        String message = "Jitendra kadu";
        double numberOne=10,numberTw0=20;
        double sum = 0;


//        get the class Object to communicate with that class, and using that Class refrence(Object) call the method of Class
        DisplayMessage sendMessageClass = new DisplayMessage();
        sendMessageClass.displayMessage(message);

        CalculationClass mCalculationClass = new CalculationClass();
        sum = mCalculationClass.getAdditionOfNumbers(numberOne,numberTw0);

        //Send the result to display class, to display it to the Consol
        new DisplayMessage().displayMessage(sum);


    }
}

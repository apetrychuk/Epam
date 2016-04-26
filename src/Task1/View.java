package Task1;


public class View {
    // Text's constants
    public final String INPUT_INT_DATA = "Input INT value in the range ";
    public final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public final String HISTORY = "History:";
    public final String WIN = "Congratulations. You guessed";
    public final String VALUE_HIGHER = "Your number is greater than the hidden. Try again.";
    public final String VALUE_LESS = "Your number is less than the hidden. Try again.";
    public final String VALUE_NOT_IN_RANGE = "Your number is not included in a range";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int valuemin,int valuemax){
        System.out.println(message + "(" + valuemin + "," + valuemax + ")");
    }

    public void printArray(String message, int[] mas, int i){
        System.out.println(HISTORY);
        for (int s =0; s<=i;s++)
            System.out.println(mas[s] + " ");
    }

}

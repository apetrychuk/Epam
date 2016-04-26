package Task1;

import java.util.Scanner;

public class Controller {
    // The Constants
    public static final int MINIMUM=-20;
    public static final int MAXIMUM=-10;
    public static final int RAND_MAX=1000;

    int min = MINIMUM, max = MAXIMUM;

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        int[] history = new int[max - (min) + 3];
        Scanner sc = new Scanner(System.in);
        int k,i=0;
        int zag = model.random(min,max);
        System.out.println(zag);

        if (!model.flag)
            max = RAND_MAX;
        k = inputIntValueWithScanner(sc);
        while( k != zag ) {
            if (k > min && k < max) {
                history[i] = k;
                i++;
                if (k > zag) {
                    view.printMessage(view.VALUE_HIGHER);
                    max = k;
                } else {
                    view.printMessage(view.VALUE_LESS);
                    min = k;
                }
            }else{
                    view.printMessage(view.VALUE_NOT_IN_RANGE);
            }
            k = inputIntValueWithScanner(sc);
        }
        view.printMessage(view.WIN);
        view.printArray(view.WRONG_INPUT_INT_DATA, history, i);
    }

    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessageAndInt(view.INPUT_INT_DATA,min,max);
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}

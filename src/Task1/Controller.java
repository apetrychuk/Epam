package Task1;

import java.util.Scanner;

public class Controller {
    // The Constants
    public static final int MINIMUM=0;
    public static final int MAXIMUM=100;
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
        int[] history = new int[max];
        Scanner sc = new Scanner(System.in);
        int k,i=0;
        int zag = model.random(min,max);

        if (!model.flag)
            max = RAND_MAX;

        while( true ){
            k = inputIntValueWithScanner(sc);
            history[i] = k;
            if ((k>zag) && (k<=max)) {
                view.printMessage(view.VALUE_HIGHER);
                max = k;
            }
            else
                if ((k<zag) && (k>=min)){
                    view.printMessage(view.VALUE_LESS);
                    min = k;
                }
                else
                    if (k == zag) {
                        view.printMessage(view.WIN);
                        break;}
                    else
                        view.printMessage(view.VALUE_NOT_IN_RANGE);
            i++;
        }
        view.printArray(view.WRONG_INPUT_INT_DATA,history,i);

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

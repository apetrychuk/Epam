package Task1;


public class Model {
    // The Program logic
    boolean flag = false;

    int random(int min,int max){
        flag = true;
        return min+1+(int)(Math.random()*((max-min)-1));
    }

    int random(int max){
        return 1+(int)(Math.random()*(max-1));
    }

    int add(int a,int b){
        return a+b;
    }


}

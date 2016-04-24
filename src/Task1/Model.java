package Task1;


public class Model {
    // The Program logic
    boolean flag = false;
    int random(int min,int max){
        flag = true;
        return min+(int)(Math.random()*((max-min)+1));
    }

    int random(int max){
        return (int)(Math.random()*max);
    }
}

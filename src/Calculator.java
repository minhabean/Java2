public class Calculator {
    String name;
    Calculator (String name) {
        this.name = name;
    }
    String getOwner(){
        String result = name;
        return result;
    }
    int add(int x, int y){
        int result = x + y;
        return result;
    }
    int minus(int x, int y){
        int result = x - y;
        return result;
    }
    int multiply(int x, int y){
        int result = x*y;
        return result;
    }
    double divide(double x, double y){
        double result = x/y;
        return result;
    }
    double divide(String x, String y){
        double a = Integer.parseInt(x);
        double b = Integer.parseInt(y);
        double result = a/b;
        return result;
    }
}

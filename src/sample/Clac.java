package sample;

public class Clac {

public Double udregnBasis(Double num1, Double num2, String operand){

    switch (operand){
        case "x^x":
            return Math.pow(num1,num2);
        case "-":
            return num1 - num2;
        case "+":
            return num1 + num2;
        case "*":
            return num1 * num2;
        case "/":
            if(num2 != 0 ){
                return num1 / num2;
            }
            return 0.0;
    }
        return 0.0;
    }

    public Double udregnKvRod(Double num1){
    double num = num1;
    double num3 = Math.sqrt(num);
    return (Double) num3;
    }


    public Double udregnx2(Double num1){
        double num = num1;
        double num3 = Math.pow(num,2);
        return num3;
    }


}

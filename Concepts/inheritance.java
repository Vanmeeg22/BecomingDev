class calc{
    int add(int n1, int n2){
        return(n1 + n2);
    }

    int sub(int n1, int n2){
        return(n1 - n2);
    }
}

class advcalc extends calc{
    int mul(int n1, int n2){
        return(n1 * n2);
    }

    int div(int n1, int n2){
        return(n1 / n2);
    }
}

class veryAdvCalc extends advcalc{
    double pow(int n1, int n2){
        return(Math.pow(n1, n2));
    }
}

public class inheritance {
    public static void main(String[] args){
        veryAdvCalc calculator = new veryAdvCalc();
        System.out.println("Addition: "+ calculator.add(3, 7));
        System.out.println("Subtraction: "+ calculator.sub(12, 7));
        System.out.println("Multiplication: "+ calculator.mul(3, 7));
        System.out.println("Division: "+ calculator.div(27, 3));
        System.out.println("Exponential: "+ calculator.pow(4, 2));
    }
}

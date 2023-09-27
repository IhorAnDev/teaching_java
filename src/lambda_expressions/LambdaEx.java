package lambda_expressions;

interface MathOperation {
    int execute(int a, int b);
}

class Runner {
    public void run(MathOperation mathOperation, int a, int b) {
        System.out.println(mathOperation.execute(a, b));
    }
}

class Divider implements MathOperation {

    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}

public class LambdaEx {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Divider divider = new Divider();
        runner.run(divider, 50, 10);

        runner.run(new MathOperation() {
            @Override
            public int execute(int a, int b) {
                return a - b;
            }
        }, 100, 50);

        runner.run((a, b) -> a * b, 5, 5);
    }
}

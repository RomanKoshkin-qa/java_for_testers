import java.io.File;

public class Hello {
    public static void main(String[] args) {
        try{                                        // пытаться выполнить какой-то код
            var z = calculate();
            System.out.println(z);
            System.out.println("Hello, world!");
        } catch (ArithmeticException exception){ // исключение имеет тип арифметики exception (мы знаем об этом из лога падения проги)
            exception.printStackTrace();           // код который выполнится , когда возникнет исключение выведем инфу о стеке вызовов
        }
    }

    private static int calculate() {
        var x=1;
        var y=1;
        var z = devide(x, y);
        return z;
    }

    private static int devide(int x, int y) {
        var z= x / y;
        return z;
    }
}

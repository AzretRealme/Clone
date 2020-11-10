import java.util.ArrayList;
public class Main {
    public static void main(String[] args)throws CloneNotSupportedException{

        Person original = new Person(25,"Mike");

        Person clone = new Person(original);
        System.out.println(original);
        System.out.println(clone);

      //Механизм копирования обеспечивает метод clone() класса Object.
        //clone() действует как конструктор копирования. Обычно он вызывает метод clone() суперкласса и т.д.

    }

}

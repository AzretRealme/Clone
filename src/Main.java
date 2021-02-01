public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Object.clone() выбрасывает исключение CloneNotSupportedException
        // при попытке клонировать объект не реализующий интерфейс Cloneable.

      Person person = new Person("Michael");
      Person person1 = (Person) person.clone();  //Клонируем person1
        //Механизм копирования обеспечивает метод clone() класса Object.

        System.out.println(person.getName());
        System.out.println(person1.getName());
        System.out.println(person.getClass().equals(person1.getClass()));
        System.out.println(person.equals(person1));
}
}

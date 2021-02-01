
public class Person implements Cloneable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//Метод clone() в родительском классе Object является protected,
// поэтому требуется переопределение его с объявлением как public.
// Он возвращает экземпляр объекта с копированными полями-примитивами и ссылками.
// И получается что у оригинала и его клона поля-ссылки указывают на одни и те же объекты.
}

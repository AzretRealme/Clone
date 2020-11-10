public class Person implements Cloneable{

       private String name;
       private int age;

        public Person(int age,String name) {

            this.age = age;
            this.name = name;
        }
       //конструткор копии
    public Person(Person other) {
     this(other.getAge(), other.getName());

    }
    //В классе описывается конструктор, который принимает объект этого же класса
    // и инициализирует значениями его полей поля нового объекта.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
        public String toString() {
            return this.name+" {" +
                    "age=" + age +
                    ", car=" +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();

            //Метод clone() в родительском классе Object является protected,
            // поэтому требуется переопределение его с объявлением как public.
            // Он возвращает экземпляр объекта с копированными полями-примитивами и ссылками.
            // И получается что у оригинала и его клона поля-ссылки указывают на одни и те же объекты.
        }
    }


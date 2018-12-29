public class TestDemo {

    public static void main(String[] args) {

//        int a=5;
//
//
//        int b=(a++);
//        +(--a)+(++a);
//
//        System.out.println(a);
//        System.out.println(b);

//
//        String path = new TestDemo().getClass().getResource("/").getPath();
//
//        System.out.println(path);
//
//        System.out.println(File.separator);

        Dog dog = new Dog();
        Dog[] a = addDogArr();
        for (Dog aaa : a) {
            Integer id = aaa.getId();
            System.out.println("id====" + id);
        }

    }

    public static Dog[] addDogArr() {

        Dog[] dogs = new Dog[5];
        int length = dogs.length;
        System.out.println(length);
        return dogs;
    }

//    public Class Dog{
//
//    }
}




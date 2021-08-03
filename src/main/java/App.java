import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean compareHelloWorld = bean == bean2;
        System.out.println(compareHelloWorld);
        System.out.println(bean);
        System.out.println(bean2);

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        boolean compareCat = cat1 == cat2;
        System.out.println(compareCat);
        System.out.println(cat1);
        System.out.println(cat2);

    }
}
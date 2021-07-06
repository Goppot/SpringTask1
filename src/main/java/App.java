import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat one = applicationContext.getBean("cat", Cat.class);
        System.out.println(one.getMassage());

        Cat two = applicationContext.getBean("cat", Cat.class);
        System.out.println(two.getMassage());

        System.out.println(bean.equals(bean1));
        System.out.println(bean.equals(one));

    }
}
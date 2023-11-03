import com.example.service.DepartementService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
/*
        ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
*/
        ApplicationContext appContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        DepartementService departementService=appContext.getBean("departementService",DepartementService.class);
        /*System.out.println(departementService);
        DepartementService departementService1=appContext.getBean("departementService",DepartementService.class);
        System.out.println(departementService1);*/
        System.out.println(departementService.returnDepartementName());

    }
}

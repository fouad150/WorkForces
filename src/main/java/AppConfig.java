import com.example.repository.DepartementRepository;
import com.example.repository.DepartementRepositoryImpl;
import com.example.service.DepartementService;
import com.example.service.DepartementServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {
/*    @Bean(name="departementService")

    //@Scope// in the default is singlton

    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public DepartementService getDepartementService(){
        DepartementService departementService= new DepartementServiceImpl();

        //departementService.setDepartementRepository(getDepartementRepository());

        return departementService;
    }

    @Bean(name="departementRepository")
    public DepartementRepository getDepartementRepository(){
        return new DepartementRepositoryImpl();
    }*/

}

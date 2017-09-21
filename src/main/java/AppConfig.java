import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties") //Use plural if multiple files
public class AppConfig {

    @Bean // Takes the properties from the file and makes them available in the context
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name = "customerService") // follows bean naming convention
//    public CustomerService getCustomerService(){
////        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
////        service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }

//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }

}

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerService") // follows bean naming convention
    public CustomerService getCustomerSerivce(){
        return new CustomerServiceImpl();
    }

}

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args){

//        CustomerService service = new CustomerServiceImpl(); // again, hardcoded
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.print(service.findAll().get(0).getFirstName());
    }
}

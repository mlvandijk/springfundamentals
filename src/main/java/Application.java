import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

import java.util.List;

public class Application {
    public static void main(String[] args){

        CustomerService service = new CustomerServiceImpl(); // again, hardcoded

        List<Customer> customers = service.findAll();
        System.out.print(customers.get(0).getFirstName());
    }
}

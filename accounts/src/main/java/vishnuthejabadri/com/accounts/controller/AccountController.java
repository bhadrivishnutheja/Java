package vishnuthejabadri.com.accounts.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AccountController {

    @GetMapping("sayHello")
    public String sayHello() {
        return "Hello from Account Service";
    }

}

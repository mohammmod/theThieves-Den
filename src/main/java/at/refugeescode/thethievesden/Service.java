package at.refugeescode.thethievesden;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Service {
    @GetMapping
    String message() {
        return "your treasure is here ";
    }
}

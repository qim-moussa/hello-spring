/**
 * Created by moussa on 22/11/15.
 */
package movie.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello the World from Spring";
    }
}

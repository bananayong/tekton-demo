package cicd.tekton.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    Mono<String> hello() {
        return Mono.just("Hello World");
    }

}

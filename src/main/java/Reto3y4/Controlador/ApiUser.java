package Reto3y4.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.Fetch;
import java.util.Collections;
import java.util.Map;

@RestController
public class ApiUser<AuthenticationPrincipal> {
    @GetMapping("/user")
    public Map<String, Object> user(AuthenticationPrincipal OAuth2User) {
        //return principal.getAttributes(); <=NO SE RECOMIENDA! EXPONE DATOS PRIVADOS
        Fetch<Object, Object> principal = null;
        return Collections.singletonMap("name", principal.getAttribute());
    }


}

package hello.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.Date;
import java.util.Map;

@RestController
public class LoginController {

    private static final long EXPIRE_TIME = 60*60*1000;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Map<String, String> User) throws ServletException {

        if(!User.get("id").equals("user")){
            return "Invalid ID";
        }

        if (!User.get("password").equals("password")) {
            return "Wrong Password";
        }

        Date date = new Date(System.currentTimeMillis()+EXPIRE_TIME);

        return Jwts.builder().setSubject(User.get("id")).claim("roles", "member").setExpiration(date).setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "zydiii").compact();
    }
}

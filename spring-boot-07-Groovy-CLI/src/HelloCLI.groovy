import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Grab("org.springframework.boot:spring-boot-starter-thymeleaf:2.2.0.RELEASE")
@Grab("org.webjars:jquery:3.4.1")
@Controller
class HelloCLI {
    @RequestMapping("/")
    String home(Model model) {
        model.addAttribute("name","Hello World!")
        return "welcome"
    }
}

//打包命令 jar hello-cli.jar HelloCLI.groovy
//打包后运行 java -jar hello-cli.jar

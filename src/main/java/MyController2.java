
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController2 {
    @GetMapping("/entername")
    public String entername() {
        return "entername";
    }

    @GetMapping("/enterandsay")
    public String enterandsay(@RequestParam(name = "name", required = false) String n, Model model) {
        model.addAttribute("name", n);
        return "enter_and_say";
    }

    @GetMapping("/perimetr")//

    public String perimetr(@RequestParam(name = "a", defaultValue = "0") String a,
                      @RequestParam(name = "b", defaultValue = "0") String b,
                      Model model) {
        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            model.addAttribute("result", (x + y)*2);
        }
        catch (NumberFormatException e){
            model.addAttribute("errorMsg", "это было не число");
        }
        return "perimetr";
    }
}
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @RequestMapping("/miniForm")
    public String showForm(Model model){
        Miniature mini = new Miniature();

        model.addAttribute("bindingMini", mini);

        return "list";
    }

    @RequestMapping("/desiredMini")
    public String desiredMini(@ModelAttribute("bindingMini") Miniature mini){
        System.out.println(mini.getMiniName());
        System.out.println(mini.getMiniDescription());
        return "minis/mini-result";
    }

}

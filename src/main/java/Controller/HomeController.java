package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/errors")
    public String handleErrors(HttpServletRequest request,
                               Model theModel){
        int httpErrorCode = (Integer)request.getAttribute("javax.servlet.error.status_code");

        String userFriendlyMessage = "Something went wrong!";

        switch(httpErrorCode){
            case 404:
                userFriendlyMessage = "404 Page not found please try something else";
                break;
            case 500:
                userFriendlyMessage = "500 something went wrong on our end";
                break;
        }

        theModel.addAttribute("errorMessage",userFriendlyMessage);

        return "error";
    }
}

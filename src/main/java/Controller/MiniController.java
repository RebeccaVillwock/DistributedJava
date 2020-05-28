package Controller;

import entity.Category;
import entity.Mini;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import service.CategoryService;
import service.MiniDescriptionService;
import service.MiniService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/mini")
public class MiniController {

    @Autowired
    private MiniService miniService;

    @Autowired
    private CategoryService categoryService;

    //@Autowired
    //private MiniDescriptionService miniDescriptionService;

    @RequestMapping("/list")
     public String listMinis(Model theModel){
         List<Mini> miniList = miniService.getMinis();

         theModel.addAttribute("minis", miniList);

         return "list";
     }

     public String search(@RequestParam("searchTerm") String searchTerm,
                          Model theModel){
        List<Mini> matchingMinis = miniService.getMinisByName(searchTerm);

        theModel.addAttribute("minis", matchingMinis);

        return "list";
     }

     @RequestMapping("/showUpdateMiniForm")
     public String showUpdateMiniForm(@RequestParam("miniId") int theId,
                                       Model theModel){
        Mini theMini = miniService.getMini(theId);

        theModel.addAttribute("aMini", theMini);

        theModel.addAttribute("categories", categoryService.getCategories());

        return "mini-form";
     }

     @GetMapping("/showAddMiniForm")
     public String showAddMiniForm(Model theModel){
        Mini theMini = new Mini();

        theModel.addAttribute("aMini", theMini);

        theModel.addAttribute("categories", categoryService.getCategories());

        return "mini-form";
     }

     @PostMapping("/save")
     public String saveMini(@Valid @ModelAttribute("aMini") Mini theMini,
                            BindingResult bindingResult,
                            Model theModel){
        if(bindingResult.hasErrors()){
            List<Category> categories = categoryService.getCategories();
            theModel.addAttribute("categories", categories);

            return "mini-form";
        }

        miniService.saveMini(theMini);

        return "redirect:/mini/list";
     }

     public String deleteMini(@RequestParam("miniId") int theId){
        miniService.deleteMini(theId);

        return "redirect:/mini/list";
     }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor ste = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, ste);
    }





    @RequestMapping("/detail")
    public String showDetailPage(){
        return "detail";
    }


    @RequestMapping("/login")
    public String showLoginPage(){
        return "login";
    }
}

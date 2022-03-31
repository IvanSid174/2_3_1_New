package Controller;

import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String allUsers (Model model) {
        model.addAttribute("users",userService.allUsers());
        return "users/allUsers";
    }
    @GetMapping(value = "/{id}")
        public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.getById(id));
        return "users/show";
    }
    @GetMapping("/new")
    public String newUser( Model model){
        model.addAttribute("user",new User());
        return "users/new";
    }
    @PostMapping()
    public String create( @ModelAttribute("user") User user){
        userService.add(user);
        return "redirect:/users";
    }
    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.getById(id));
        return "users/edit";
    }
    @PatchMapping (value = "/{id}")
    public String update( @ModelAttribute("user") User user, @PathVariable("id") int id, Model model){
        userService.edit(user);
        return "redirect:/users";
    }


}

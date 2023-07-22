package myplace.core.controller;

import lombok.AllArgsConstructor;
import myplace.core.user.domain.User;
import myplace.core.user.dto.UserDto;
import myplace.core.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping("/list")
    public String list(Model model) {
        List<User> users = userService.findUsers();
        model.addAttribute("users", users);
        return "user/userList";
    }
    @GetMapping("/signup")
    public String getSignUp(UserDto userDto) {
        return "user/userCreateForm.html";
    }

    @PostMapping("/signup")
    public String postSignUp(@Valid UserDto userDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user/userCreateForm";
        }

        userService.saveUser(userDto);
        return "redirect:/";
    }
}

package xin.cymall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.cymall.entity.DwUser;
import xin.cymall.service.DwUserService;

@RestController
@RequestMapping("dwUser")
public class DwUserController {

    @Autowired
    DwUserService dwUserService;

    @GetMapping("/getUserByUserName")
    public String selectByUserName(String username) {
        DwUser dwUser = new DwUser();
        dwUser = dwUserService.selectByUserName(username);
        String s = dwUser.toString();
        return s;
    }

}

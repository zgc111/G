package xin.cymall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xin.cymall.entity.DwUser;
import xin.cymall.service.DwUserService;

@RestController
@RequestMapping("hj")
public class HjController {

    @Autowired
    DwUserService dwUserService;

    @GetMapping("/sh")
    public String list() {
      String s=  "546";
      return s;
    }

}

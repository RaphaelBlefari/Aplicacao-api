package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class usuariosController {


    @RequestMapping(value = "/busca", method = RequestMethod.GET)
    public String BuscaUsuarios(){
        return "sistema ok";
    }
}

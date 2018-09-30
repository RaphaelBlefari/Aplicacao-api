package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class usuariosController {


    private class MensagemAPI{

        public  String Mensagem;

        public String getMensagem() {
            return Mensagem;
        }

        public void setMensagem(String mensagem) {
            Mensagem = mensagem;
        }
    }

    @RequestMapping(value = "/busca", method = RequestMethod.GET)
    public MensagemAPI BuscaUsuarios(){
        MensagemAPI msapi = new   MensagemAPI();
        msapi.setMensagem("Este é um retorno ok da API");
        return msapi;
    }
}

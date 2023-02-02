package com.marcelo.cursomc.resouces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResouces {

    //metodo para fazer a requisição de dados no REST
    @RequestMapping(method = RequestMethod.GET)
    public String listar(){
        return "Rest está funcionando!";
    }
}

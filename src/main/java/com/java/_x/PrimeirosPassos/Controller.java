package com.java._x.PrimeirosPassos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa a nossa primeira mensagem";
    }
}

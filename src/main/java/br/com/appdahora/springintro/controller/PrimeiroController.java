package br.com.appdahora.springintro.controller;

import br.com.appdahora.springintro.models.Carro;
import br.com.appdahora.springintro.models.MotorEsportivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {
    private Carro carro;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        MotorEsportivo motor = new MotorEsportivo();
        carro = new Carro();
        carro.setMotor(motor);

        carro.getMotor().setPotencia(2);
        carro.setModelo("Fusca");
        return carro.toString();
    }

}

package br.com.appdahora.springintro.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Carro {
    private Motor motor;
    private String modelo;

}

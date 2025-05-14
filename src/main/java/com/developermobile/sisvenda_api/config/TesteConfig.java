package com.developermobile.sisvenda_api.config;

import com.developermobile.sisvenda_api.entities.Cliente;
import com.developermobile.sisvenda_api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public void run(String... args) throws Exception {
        Cliente c1 = new Cliente(null,
                "Tiago Vieira Silva",
                "Setor 1, Rua C, Quadra C, Caminho 9, Nº 8A",
                "Cajazeiras 10",
                "Salvador",
                "BA",
                "41304585",
                "7183024029",
                "tiago.pereira.vieira@gmail.com");

        Cliente c2 = new Cliente(null,
                "Rosana Vieira Silva",
                "Setor 1, Rua C, Quadra C, Caminho 9, Nº 8A",
                "Cajazeiras 10",
                "Salvador",
                "BA",
                "41304585",
                "71991413843",
                "rosanavieirasilva2014@gmail.com");

        clienteRepository.saveAll(Arrays.asList(c1, c2));
    }
}

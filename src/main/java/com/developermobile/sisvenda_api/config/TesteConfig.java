package com.developermobile.sisvenda_api.config;

import com.developermobile.sisvenda_api.entities.Cliente;
import com.developermobile.sisvenda_api.entities.Fornecedor;
import com.developermobile.sisvenda_api.repository.ClienteRepository;
import com.developermobile.sisvenda_api.repository.FornecedorRepository;
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

    @Autowired
    private FornecedorRepository fornecedorRepository;


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

        Fornecedor f1 = new Fornecedor(null,
                "Emporio",
                "Setor 1, Rua C, Quadra C, Caminho 24, S/N",
                "Cajazeiras 10",
                "Salvador",
                "BA",
                "41304585",
                "7124681357",
                "emporio@gmail.com");

        Fornecedor f2 = new Fornecedor(null,
                "Atacadao",
                null,
                "Fazenda Grande 2",
                "Salvador",
                "BA",
                null,
                "7123456789",
                "atacadao@gmail.com");

        clienteRepository.saveAll(Arrays.asList(c1, c2));
        fornecedorRepository.saveAll(Arrays.asList(f1, f2));
    }
}

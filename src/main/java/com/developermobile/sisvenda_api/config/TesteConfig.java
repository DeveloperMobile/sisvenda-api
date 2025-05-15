package com.developermobile.sisvenda_api.config;

import com.developermobile.sisvenda_api.entities.Client;
import com.developermobile.sisvenda_api.entities.Product;
import com.developermobile.sisvenda_api.entities.Supplier;
import com.developermobile.sisvenda_api.repository.ClientRepository;
import com.developermobile.sisvenda_api.repository.ProductRepository;
import com.developermobile.sisvenda_api.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Client c1 = new Client(null,
                "Tiago Vieira Silva",
                "Setor 1, Rua C, Quadra C, Caminho 9, Nº 8A",
                "Cajazeiras 10",
                "Salvador",
                "BA",
                "41304585",
                "7183024029",
                "tiago.pereira.vieira@gmail.com");

        Client c2 = new Client(null,
                "Rosana Vieira Silva",
                "Setor 1, Rua C, Quadra C, Caminho 9, Nº 8A",
                "Cajazeiras 10",
                "Salvador",
                "BA",
                "41304585",
                "71991413843",
                "rosanavieirasilva2014@gmail.com");

        Supplier f1 = new Supplier(null,
                "Emporio",
                "Setor 1, Rua C, Quadra C, Caminho 24, S/N",
                "Cajazeiras 10",
                "Salvador",
                "BA",
                "41304585",
                "7124681357",
                "emporio@gmail.com");

        Supplier f2 = new Supplier(null,
                "Atacadao",
                null,
                "Fazenda Grande 2",
                "Salvador",
                "BA",
                null,
                "7123456789",
                "atacadao@gmail.com");

        Product p1 = new Product(null, "Biscoito Cream Cracker Vitarela", 10, 3.99);
        Product p2 = new Product(null, "Caneta Bic", 10, 1.50);
        Product p3 = new Product(null, "Desodoramte Suave", 10, 12.00);
        Product p4 = new Product(null, "Cafe Santa Clara", 10, 12.00);

        clientRepository.saveAll(Arrays.asList(c1, c2));
        supplierRepository.saveAll(Arrays.asList(f1, f2));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
    }
}

package com.developermobile.sisvenda_api.config;

import com.developermobile.sisvenda_api.entities.*;
import com.developermobile.sisvenda_api.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
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

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

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

        Client c3 = new Client(null,
                "Jessica Vieira Silva Barbosa",
                null,
                null,
                null,
                "BA",
                "41304585",
                "7188010960",
                "jessica_vieirasilva@yahoo.com.br");

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

        Supplier f3 = new Supplier(null,
                "Fornecedor Teste Alteração",
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        Product p1 = new Product(null, "Biscoito Cream Cracker Vitarela", 10, 3.99, f1);
        Product p2 = new Product(null, "Caneta Bic", 10, 1.50, f1);
        Product p3 = new Product(null, "Desodorante Suave", 10, 12.00, f2);
        Product p4 = new Product(null, "Cafe Santa Clara", 10, 12.00, f2);

        Order o1 = new Order(null, Instant.parse("2020-04-17T00:00:00Z"), c1);
        Order o2 = new Order(null, Instant.parse("2024-11-26T00:00:00Z"), c1);
        Order o3 = new Order(null, Instant.parse("2025-01-25T00:00:00Z"), c2);
        Order o4 = new Order(null, Instant.parse("2025-02-05T00:00:00Z"), c2);
        Order o5 = new Order(null, Instant.parse("2025-02-22T00:00:00Z"), c3);

        clientRepository.saveAll(Arrays.asList(c1, c2, c3));
        supplierRepository.saveAll(Arrays.asList(f1, f2, f3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5));

        OrderItem oi1 = new OrderItem(o1, p1, 4, p1.getPrice());
        OrderItem oi2 = new OrderItem(o2, p1, 2, p1.getPrice());
        OrderItem oi3 = new OrderItem(o2, p2, 3, p2.getPrice());
        OrderItem oi4 = new OrderItem(o3, p1, 5, p1.getPrice());
        OrderItem oi5 = new OrderItem(o4, p2, 2, p2.getPrice());
        OrderItem oi6 = new OrderItem(o4, p1, 2, p1.getPrice());
        OrderItem oi7 = new OrderItem(o5, p4, 2, p4.getPrice());
        OrderItem oi8 = new OrderItem(o5, p3, 1, p3.getPrice());
        OrderItem oi9 = new OrderItem(o5, p1, 1, p1.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4, oi5, oi6, oi7, oi8, oi9));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5));
    }
}

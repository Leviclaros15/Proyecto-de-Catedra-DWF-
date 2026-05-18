package udb.edu.sv;

import udb.edu.sv.entity.Producto;
import udb.edu.sv.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner cargarDatos(ProductoRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new Producto(null, "Laptop Pavilion", "HP", 2023, "Laptop 15 pulgadas 8GB RAM", 750.00, 10, "Electronica"));
                repo.save(new Producto(null, "Mouse MX Master", "Logitech", 2022, "Mouse inalambrico ergonomico", 25.00, 50, "Perifericos"));
                repo.save(new Producto(null, "Teclado K70", "Corsair", 2021, "Teclado RGB switches azules", 60.00, 30, "Perifericos"));
                repo.save(new Producto(null, "Monitor IPS 24", "LG", 2023, "Monitor Full HD 75Hz", 180.00, 15, "Electronica"));
                repo.save(new Producto(null, "Silla Gamer T300", "DXRacer", 2022, "Silla ergonomica reclinable", 200.00, 8, "Mobiliario"));
                System.out.println("Base de datos cargada con productos de ejemplo.");
            }
        };
    }
}

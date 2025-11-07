package com.example.astrologic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.astrologic.model.Information;
import com.example.astrologic.repository.InformationRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final InformationRepository infoRepo;

    public DataLoader(InformationRepository infoRepo) {
        this.infoRepo = infoRepo;
    }

    @Override
    public void run(String... args) {
        Information info = new Information();
        info.setIden(1028848);
        info.setNombre("juan andre");
        info.setCorreo("julialdobravo@gmail.com");
        info.setEdad(5);

        infoRepo.save(info);
        System.out.println("✅ Registro guardado correctamente en la base astrologic");
    }
}

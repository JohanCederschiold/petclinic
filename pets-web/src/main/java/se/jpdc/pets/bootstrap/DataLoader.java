package se.jpdc.pets.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.jpdc.pets.model.Owner;
import se.jpdc.pets.model.Vet;
import se.jpdc.pets.service.OwnerService;
import se.jpdc.pets.service.VetService;
import se.jpdc.pets.service.map.OwnerServiceMap;
import se.jpdc.pets.service.map.VetServiceMap;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    private String [] ownerFirstName = {"Michael", "Fiona"};
    private String [] ownerLastName = {"Weston", "Glenanne"};
    private String [] vetFirstName = {"Sam", "Jessie"};
    private String [] vetLastName = {"Axe", "Porter"};


    /*
        Ha to change the interfaces on OwnerServiceMap and VetServiceMap.
     */

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        for (long id = 0L ; id < ownerFirstName.length ; id++) {
            Owner owner = new Owner();
            owner.setFirstName(ownerFirstName[(int)id]);
            owner.setLastName(ownerLastName[(int)id]);
            ownerService.save(owner);
        }
        System.out.println("Loaded owners");

        for (long id = 0L ; id < vetFirstName.length ; id++) {
            Vet vet = new Vet();
            vet.setFirstName(vetFirstName[(int)id]);
            vet.setLastName(vetLastName[(int)id]);
            vetService.save(vet);
        }

        System.out.println("Loaded vets");

    }
}

package controllers;

import br.com.diego.animalservice.entities.Animal;
import br.com.diego.animalservice.repositories.AnimalRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll() {
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return repository.findAdopted();
    }


    @GetMapping("/receipt")
    private ResponseEntity<List<Object[]>> countAnimalsByRecebedor(
            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        if (ChronoUnit.DAYS.between(startDate, endDate) > 365) {
            return ResponseEntity.badRequest().body(null);
        }
        Date start = Date.valueOf(startDate);
        Date end = Date.valueOf(endDate);
        List<Object[]> result = repository.countAnimalsByRecebedor(start, end);

        return ResponseEntity.ok(result);
    }
}
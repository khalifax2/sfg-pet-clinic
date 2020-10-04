package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService extends AbstractJpaService<Speciality, SpecialtyRepository> implements SpecialtyService {

    public SpecialtySDJpaService(SpecialtyRepository repository) {
        super(repository);
    }

}

package se.jpdc.pets.service.map;

import se.jpdc.pets.model.Owner;
import se.jpdc.pets.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}

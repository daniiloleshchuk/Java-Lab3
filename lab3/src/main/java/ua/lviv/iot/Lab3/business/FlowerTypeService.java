package ua.lviv.iot.Lab3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Lab3.dataaccess.FlowerTypeRepository;
import ua.lviv.iot.Lab3.model.FlowerType;

import java.util.List;

@Service
public class FlowerTypeService {

    @Autowired
    private FlowerTypeRepository flowerTypeRepository;

    public List<FlowerType> findAll(){
        return flowerTypeRepository.findAll();
    }

    public FlowerType findById(Integer flowerTypeId){
        return flowerTypeRepository.findById(flowerTypeId).get();
    }

    public FlowerType createFlowerType(FlowerType flowerType){
        return flowerTypeRepository.save(flowerType);
    }

    public void deleteFlowerTypeById(Integer id){
        flowerTypeRepository.deleteById(id);
    }

}

package ua.lviv.iot.Lab3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Lab3.dataaccess.FlowerLocalityRepository;
import ua.lviv.iot.Lab3.model.FlowerLocality;

import java.util.List;

@Service
public class FlowerLocalityService {

    @Autowired
    private FlowerLocalityRepository flowerLocalityRepository;

    public List<FlowerLocality> findAll(){
        return flowerLocalityRepository.findAll();
    }

    public FlowerLocality findById(Integer id){
        return flowerLocalityRepository.findById(id).get();
    }

    public FlowerLocality createFlowerLocality(FlowerLocality flowerLocality){
        return flowerLocalityRepository.save(flowerLocality);
    }

    public void deleteById(Integer id){
        flowerLocalityRepository.deleteById(id);
    }

}

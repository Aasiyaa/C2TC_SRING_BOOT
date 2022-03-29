
package com.example.demo;



import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class PlacementService {
 
    @Autowired
    private PlacementRepository pla;
     
    public List<Placement> listAll() {
        return pla.findAll();
    }
     
    public void save(Placement  placement) {
        pla.save( placement);
    }
     
    public  Placement get(Integer id) {
        return pla.findById(id).get();
    }
     
    public void delete(Integer id) {
        pla.deleteById(id);
    }
    
}

package com.portfolio.dlr.Controller;


import com.portfolio.dlr.Entity.Persona;
import com.portfolio.dlr.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaservice;
    private Long id;
    
    @GetMapping("/personas/traer/")
    public List<Persona>getPersona(){
        return (List<Persona>) ipersonaservice.getPersona();
    }
    
    @PostMapping("/personas/crear/perfil")
    public String createPersona (@RequestBody Persona persona){
        ipersonaservice.savePersona(persona);
        
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaservice.deletePersona(id);
        return "La persona fue eliminada correctamente";
        
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPerona(){
       
        return ipersonaservice.findPersona((long)1);
    }
   
            
            
            
            
            
            
            
          
    
    
    
    
    
}

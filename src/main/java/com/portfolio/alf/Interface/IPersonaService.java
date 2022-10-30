package com.portfolio.alf.Interface;

import com.portfolio.alf.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Integer id);
    
    //Buscar una persona por ID
    public Persona findPersona(Integer id);
}

package edu.pk.library.domain.entity;

import org.hibernate.validator.constraints.NotBlank;


public class Author {    
    @NotBlank
    private String firstname;
    
    @NotBlank
    private String surname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
}

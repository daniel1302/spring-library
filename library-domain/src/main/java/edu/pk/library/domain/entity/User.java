package edu.pk.library.domain.entity;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;


public class User {
    
    @NotBlank
    @Size(min=3, max=20) 
    private String firstname;
    
    @NotBlank
    private String surname;
    
    @NotBlank
    @Email
    private String email;
    
    @NotBlank
    @Pattern(regexp="^[0-9\\- ]{3,14}$")
    private String phone;
    
    @NotBlank
    @Pattern(regexp="^([0-3]?[0-9]{1})\\-([0-1]?[0-9]{1})\\-([1-2]{1}[0-9]{3})$")
    private String bornDate;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }
    
    
}

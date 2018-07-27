package com.marvin.spring.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {
    @NotNull(message = "{notnull}")
    @Size(min = 4, max = 10, message = "{firstName.size}")//message 指定要提示的错误信息
    @NotEmpty(message = "{notnull}")
    private String firstName;
    @NotNull
    //@Size(min = 4, max = 10)
    private String lastName;
    @NotNull
    private String username;
    @NotNull
    private String password;

    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

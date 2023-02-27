package com.example.drivelinks.models;

import com.example.drivelinks.enumm.Role;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Driver {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Введите номер мобильного телефона")
    @Column(name = "phone")
    @Pattern(regexp = "^(\\d{10})$", message = "Номер мобильного телефона должен состоять из 10 цифр")
    private int phone;

    @NotEmpty(message = "Введите пароль")
    @Column(name = "password")
    @Pattern(regexp = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$", message = "Строчные и прописные латинские буквы, цифры, спецсимволы. Минимум 8 символов")
    private String password;

    @Column(name = "role")
    private Role role;

    @NotEmpty(message = "Укажите фамилию")
    private String lastName;

    @NotEmpty(message = "Укажите Имя")
    private String firstName;

    private String patronymic;

    public Driver(){}

    public Driver(int phone, String password, Role role, String lastName, String firstName, String patronymic) {
        this.phone = phone;
        this.password = password;
        this.role = role;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}

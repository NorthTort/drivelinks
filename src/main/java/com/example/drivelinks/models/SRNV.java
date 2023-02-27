package com.example.drivelinks.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class SRNV {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Введите государственный регистрационный номер")
    @Column(name = "srnv")
    @Pattern(regexp = "(?=^.{8,9}$)((?=.*\\d))(?![.\\n])(?=.*[АВЕКМНОРСТУXD]).*$", message = "Неверный государственный регистрационный номер")
    private String srnv;

    public SRNV() {
    }

    public SRNV(int id, String srnv) {
        this.id = id;
        this.srnv = srnv;
    }

    public String getSrnv() {
        return srnv;
    }
}

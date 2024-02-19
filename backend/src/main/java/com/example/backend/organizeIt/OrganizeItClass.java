package com.example.backend.organizeIt;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;

import java.util.Objects;


public class OrganizeItClass {

    @Id
    private String id;
    @NotBlank(message = "Name is required")
    @Size(min = 1, max = 5000)
    private String name;

    // Da nur id und Name existieren ist das als "allArgsConstruktor" zu sehen
    public OrganizeItClass(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // hier nur id ähnlich dem requiredArgsConstructor allerdings nur für id nicht für name daher nicht exakt wie der requiredArgsConstructor
    public OrganizeItClass(String id) {
        this.id = id;
    }

    // hier leer darum wie ein noArgsConstructor
    public OrganizeItClass() {
    }

    // hier die getter und setter je für id ein get und set und für den Namen ein get udn set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Hier die equals und Hashcodes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizeItClass that = (OrganizeItClass) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // und hier zuletzt die toString's
    @Override
    public String toString() {
        return "OrganizeItClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

// Alternativ kann man auch mit Lombok Arbeiten
//@Data >> Wenn man die Lombok-Annotation @Data verwendet, werden toString(), equals() und hashCode() automatisch generiert.
//@NoArgsConstructor
//@AllArgsConstructor
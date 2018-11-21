package com.mybatis.springbootmybatis.dto;

import java.io.Serializable;
import java.util.Objects;

public class Card implements Serializable {


    private int id;

    private String brand;

    private String version;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Card() {
    }

    public Card(String brand, String version, String name) {
        this.brand = brand;
        this.version = version;
        this.name = name;
    }

    public Card(int id, String brand, String version, String name) {

        this.id = id;
        this.brand = brand;
        this.version = version;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id == card.id &&
                Objects.equals(brand, card.brand) &&
                Objects.equals(version, card.version) &&
                Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brand, version, name);
    }
}

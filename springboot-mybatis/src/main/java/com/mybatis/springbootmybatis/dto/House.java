package com.mybatis.springbootmybatis.dto;

import java.io.Serializable;
import java.util.Objects;

public class House implements Serializable {

    private int id;

    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public House(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public House() {
    }

    public House(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id &&
                Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, address);
    }
}

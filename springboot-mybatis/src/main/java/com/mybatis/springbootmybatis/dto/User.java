package com.mybatis.springbootmybatis.dto;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {


    private int id;

    private String name;

    private String username;

    private String phoneNumber;

    private String address;

    private House house;

    private List<Card> cardList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public User(String name, String username, String phoneNumber, String address) {
        this.name = name;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", house=" + house +
                ", cardList=" + cardList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(username, user.username) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(address, user.address) &&
                Objects.equals(house, user.house) &&
                Objects.equals(cardList, user.cardList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, username, phoneNumber, address, house, cardList);
    }
}

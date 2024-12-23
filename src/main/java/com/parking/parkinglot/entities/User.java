package com.parking.parkinglot.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "user")
public class User {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
  private String username;

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  private String email;
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  private String password;
  public String getPassword() {
    return password;
  }
  private void setPassword(String password) {
    this.password = password;
  }
  private Collection<Car> cars;

  @OneToMany(mappedBy = "owner")
  public Collection<Car> getCars() {
    return cars;
  }

  public void setCars(Collection<Car> cars) {
    this.cars = cars;
  }
}
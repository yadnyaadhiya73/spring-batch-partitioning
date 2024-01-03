package com.springbatch.springbatchpartition.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CUSTOMER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name="CUSTOMER_ID")
    private int id;
    @Column(name="FIRSTNAME")
    private String firstname;
    @Column(name="LASTNAME")
    private String lastname;
    @Column(name="EMAIL")
    private String email;
    @Column(name="GENDER")
    private String gender;
    @Column(name="CONTACT")
    private String contact;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="DOB")
    private String dob;

}

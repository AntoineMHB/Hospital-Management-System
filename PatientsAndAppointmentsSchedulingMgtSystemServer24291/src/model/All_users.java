/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author antoi
 */
@Entity
public class All_users implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "user_type")
    private String user_type;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "physical_address")
    private String physical_address;
    @Column(name = "password")
    private String password;
    
    @OneToMany(mappedBy = "all_users")
    List<Appointments> appointments = new ArrayList<>();
    
    @OneToMany(mappedBy = "all_users")
    List<Medical_records> medicalrecords = new ArrayList<>();

    public All_users() {
    }

    public All_users(Integer user_id) {
        this.user_id = user_id;
    }

    public All_users(Integer user_id, String full_name, String user_name, String user_type, String phone_number, String physical_address, String password) {
        this.user_id = user_id;
        this.full_name = full_name;
        this.user_name = user_name;
        this.user_type = user_type;
        this.phone_number = phone_number;
        this.physical_address = physical_address;
        this.password = password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhysical_address() {
        return physical_address;
    }

    public void setPhysical_address(String physical_address) {
        this.physical_address = physical_address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Appointments> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointments> appointments) {
        this.appointments = appointments;
    }

    public List<Medical_records> getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(List<Medical_records> medicalrecords) {
        this.medicalrecords = medicalrecords;
    }

   
    
}

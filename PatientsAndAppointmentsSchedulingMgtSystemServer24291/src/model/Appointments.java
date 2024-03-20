/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author antoi
 */
@Entity
public class Appointments implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Integer appointment_id;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "date_of_birth")
    private Date date_of_birth;
    @Column(name = "gender")
    private String gender;
    @Column(name = "email_or_phone")
    private String email_or_phone;
    @Column(name = "medical_id")
    private String medical_id;
    @Column(name = "doctor_speciality")
    private String doctor_speciality;
    @Column(name = "appointment_date")
    private Date appointment_date;
    @Column(name = "appointment_time")
    private String apppointment_time;
    
    @OneToOne
    @JoinColumn(name = "medical_record_id")
    private Medical_records medicalrecords;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private All_users all_users;

    public Appointments() {
    }

    public Appointments(Integer appointment_id) {
        this.appointment_id = appointment_id;
    }

    public Appointments(Integer appointment_id, String fullname, Date date_of_birth, String gender, String email_or_phone, String medical_id, String doctor_speciality, Date appointment_date, String apppointment_time, Medical_records medicalrecords, All_users all_users) {
        this.appointment_id = appointment_id;
        this.fullname = fullname;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.email_or_phone = email_or_phone;
        this.medical_id = medical_id;
        this.doctor_speciality = doctor_speciality;
        this.appointment_date = appointment_date;
        this.apppointment_time = apppointment_time;
        this.medicalrecords = medicalrecords;
        this.all_users = all_users;
    }

    public Integer getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(Integer appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail_or_phone() {
        return email_or_phone;
    }

    public void setEmail_or_phone(String email_or_phone) {
        this.email_or_phone = email_or_phone;
    }

    public String getMedical_id() {
        return medical_id;
    }

    public void setMedical_id(String medical_id) {
        this.medical_id = medical_id;
    }

    public String getDoctor_speciality() {
        return doctor_speciality;
    }

    public void setDoctor_speciality(String doctor_speciality) {
        this.doctor_speciality = doctor_speciality;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getApppointment_time() {
        return apppointment_time;
    }

    public void setApppointment_time(String apppointment_time) {
        this.apppointment_time = apppointment_time;
    }

    public Medical_records getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(Medical_records medicalrecords) {
        this.medicalrecords = medicalrecords;
    }

    public All_users getAll_users() {
        return all_users;
    }

    public void setAll_users(All_users all_users) {
        this.all_users = all_users;
    }
    
}

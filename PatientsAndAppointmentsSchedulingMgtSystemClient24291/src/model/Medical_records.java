/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author antoi
 */

public class Medical_records implements Serializable{
    private Integer medical_record_id;
    private String full_name;
    private String medical_id;
    private String allergies;
    private String past_medical_conditions;
    private String family_medical_history;
    private String immunization_history;
    private String prescriptions;
    private String blood_pressure;
    private String heart_rate;
    private String temperature;
    private String weight_and_height;
    private String bmi;
    private String labo_results;
    private Date appointment_date;
    
    private Appointments appointment;
    
    private All_users all_users;

    public Medical_records() {
    }

    public Medical_records(Integer medical_record_id) {
        this.medical_record_id = medical_record_id;
    }

    public Medical_records(Integer medical_record_id, String full_name, String medical_id, String allergies, String past_medical_conditions, String family_medical_history, String immunization_history, String prescriptions, String blood_pressure, String heart_rate, String temperature, String weight_and_height, String bmi, String labo_results, Date appointment_date, Appointments appointment, All_users all_users) {
        this.medical_record_id = medical_record_id;
        this.full_name = full_name;
        this.medical_id = medical_id;
        this.allergies = allergies;
        this.past_medical_conditions = past_medical_conditions;
        this.family_medical_history = family_medical_history;
        this.immunization_history = immunization_history;
        this.prescriptions = prescriptions;
        this.blood_pressure = blood_pressure;
        this.heart_rate = heart_rate;
        this.temperature = temperature;
        this.weight_and_height = weight_and_height;
        this.bmi = bmi;
        this.labo_results = labo_results;
        this.appointment_date = appointment_date;
        this.appointment = appointment;
        this.all_users = all_users;
    }

    public Integer getMedical_record_id() {
        return medical_record_id;
    }

    public void setMedical_record_id(Integer medical_record_id) {
        this.medical_record_id = medical_record_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getMedical_id() {
        return medical_id;
    }

    public void setMedical_id(String medical_id) {
        this.medical_id = medical_id;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPast_medical_conditions() {
        return past_medical_conditions;
    }

    public void setPast_medical_conditions(String past_medical_conditions) {
        this.past_medical_conditions = past_medical_conditions;
    }

    public String getFamily_medical_history() {
        return family_medical_history;
    }

    public void setFamily_medical_history(String family_medical_history) {
        this.family_medical_history = family_medical_history;
    }

    public String getImmunization_history() {
        return immunization_history;
    }

    public void setImmunization_history(String immunization_history) {
        this.immunization_history = immunization_history;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public String getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(String heart_rate) {
        this.heart_rate = heart_rate;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeight_and_height() {
        return weight_and_height;
    }

    public void setWeight_and_height(String weight_and_height) {
        this.weight_and_height = weight_and_height;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getLabo_results() {
        return labo_results;
    }

    public void setLabo_results(String labo_results) {
        this.labo_results = labo_results;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public Appointments getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointments appointment) {
        this.appointment = appointment;
    }

    public All_users getAll_users() {
        return all_users;
    }

    public void setAll_users(All_users all_users) {
        this.all_users = all_users;
    }

    
}

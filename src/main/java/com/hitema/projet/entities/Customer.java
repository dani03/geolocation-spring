package com.hitema.projet.entities;
import jakarta.persistence.*;

    @Entity
    public class Customer {

        @Id
        @Column(name="customer_id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String first_name;
        private String last_name;

        public String address;

        private Boolean active;

        private String email;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

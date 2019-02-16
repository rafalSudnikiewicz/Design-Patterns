package pl.sda.creational.builder;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer() {

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public String getProfession() {
        return profession;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public static class Builder {

        private Customer customer = new Customer();

        public Builder withName(String name) {
            customer.name = name;
            return this;
        }

        public Builder withLastName(String lastName) {
            customer.lastName = lastName;
            return this;
        }

        public Builder bornAt(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public Builder withPesel(String pesel) {
            customer.pesel = pesel;
            return this;
        }

        public Builder withProfession(String profession) {
            customer.profession = profession;
            return this;
        }

        public Builder livingIn(String city) {
            customer.city = city;
            return this;
        }

        public Builder fromCountry(String from) {
            customer.country = from;
            return this;
        }

        public Customer build() {
            return customer;
        }
    }
}

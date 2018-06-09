package com.bitsane.autotests.models;

public class Customer {

    private String firstname;
    private String lastname;
    private String middlename;
    private String dateofbirth;
    private String idnumber;
    private String documenttype;
    private String dateofexpiry;
    private String address;
    private String city;
    private String state_province;
    private String country;
    private String postcode;
    private String phone;
    private String email;
    private String password;
    private String password_of_email;
    private String sender;
    private String ApiKey;
    private String PrivateKey;
    private String[][] currencies;
    private String[] pairs;
    private int EUR;
    private int USD;
    private int BTC;


    public static Builder newEntity() { return new Customer().new Builder(); }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public String getDocumenttype() {
        return documenttype;
    }

    public String getDateofexpiry() {
        return dateofexpiry;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState_province() {
        return state_province;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPassword_of_email() {
        return password_of_email;
    }

    public String getSender() {
        return sender;
    }

    public String getApiKey() {
        return ApiKey;
    }

    public String getPrivateKey() {
        return PrivateKey;
    }

    public String[][] getCurrencies() {
        return currencies;
    }

    public String[] getPairs() {
        return pairs;
    }

    public int getEUR() {
        return EUR;
    }

    public int getUSD() {
        return USD;
    }

    public int getBTC() {
        return BTC;
    }

    public class Builder {
        private Builder() {}
        public Builder withFirstname(String firstname) { Customer.this.firstname = firstname; return this; }
        public Builder withLastname(String lastname) { Customer.this.lastname = lastname; return this; }
        public Builder withMiddlename(String middlename) { Customer.this.middlename = middlename; return this; }
        public Builder withDateofbirth(String dateofbirth) { Customer.this.dateofbirth = dateofbirth; return this; }
        public Builder withIdnumber(String idnumber) { Customer.this.idnumber = idnumber; return this; }
        public Builder withDocumenttyp(String documenttype) { Customer.this.documenttype = documenttype; return this; }
        public Builder withDateofexpiry(String dateofexpiry) { Customer.this.dateofexpiry = dateofexpiry; return this; }
        public Builder withAddress(String address) { Customer.this.address = address; return this; }
        public Builder withCity(String city) { Customer.this.city = city; return this; }
        public Builder withState_province(String state_province) { Customer.this.state_province = state_province; return this; }
        public Builder withCountry(String country) { Customer.this.country = country; return this; }
        public Builder withPostcode(String postcode) { Customer.this.postcode = postcode; return this; }
        public Builder withPhone(String phone) { Customer.this.phone = phone; return this; }
        public Builder withEmail(String email) { Customer.this.email = email; return this; }
        public Builder withPassword(String password) { Customer.this.password = password; return this; }
        public Builder withPassword_of_email(String password_of_email) { Customer.this.password_of_email = password_of_email; return this; }
        public Builder withSender(String sender) { Customer.this.sender = sender; return this; }
        public Builder withApiKey(String ApiKey) { Customer.this.ApiKey = ApiKey; return this; }
        public Builder withPrivateKey(String PrivateKey) { Customer.this.PrivateKey = PrivateKey; return this; }
        public Builder withCurrencies(String[][] currencies) { Customer.this.currencies = currencies; return this; }
        public Builder withPairs(String[] pairs) { Customer.this.pairs = pairs; return this; }
        public Builder withEUR(int eur) { Customer.this.EUR = eur; return this; }
        public Builder withUSD(int usd) { Customer.this.USD = usd; return this; }
        public Builder withBTC(int btc) { Customer.this.BTC = btc; return this; }
        public Customer build() {return Customer.this; }
    }
}


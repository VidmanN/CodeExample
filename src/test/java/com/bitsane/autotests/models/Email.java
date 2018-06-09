package com.bitsane.autotests.models;

public class Email {
    private String phone;
    private String email;
    private String password;
    private String sender;
    private String subject;

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public static Email.Builder newLetter() { return new Email().new Builder(); }

    public class Builder {
        private Builder() {}
        public Builder withPhone(String phone) { Email.this.phone = phone; return this; }
        public Builder withEmail(String email) { Email.this.email = email; return this; }
        public Builder withPassword(String password) { Email.this.password = password; return this; }
        public Builder withSender(String sender) { Email.this.sender = sender; return this; }
        public Builder withSubject(String subject) { Email.this.subject = subject; return this; }
        public Email build() {return Email.this; }
    }
}

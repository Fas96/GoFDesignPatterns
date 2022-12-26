package org.code.creational.builder.chain;

public class Account {
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;



    public String toString() {
        return "Account [name=" + name + ", password=" + password + ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
    }

    public static Builder builder() {
        return new Account().new Builder();
    }

    class Builder{

        private Builder() {
        }

        public Builder setName(String name) {
            Account.this.name=name;
            return this;
        }

        public Builder setPassword(String password) {
            Account.this.password=password;
            return this;
        }

        public Builder setEmail(String email) {
            Account.this.email=email;
            return this;
        }

        public Builder setPhone(String phone) {
            Account.this.phone=phone;
            return this;
        }

        public Builder setAddress(String address) {
            Account.this.address=address;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }

}

public class PhoneBook {
    String numberPhone;
    String name;
    String gerder;
    String email;
    String address;
    String group;

    public PhoneBook(String numberPhone, String name, String gerder, String email, String address, String group) {
        this.numberPhone = numberPhone;
        this.name = name;
        this.gerder = gerder;
        this.email = email;
        this.address = address;
        this.group = group;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGerder() {
        return gerder;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public void showPhoneBook(){
        System.out.printf("%-10s%-30s%-10s%-40s%-30s%-20s\n"
                ,this.numberPhone,this.name,this.gerder,this.address,this.email,this.group);
    }
}

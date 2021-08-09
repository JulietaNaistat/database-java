package clase33plus;

public class Usuario {
    private int id;
    private String Name;
    private String Phone;
    private String City;
    private String Email;
    private String PersonalNumber;

    //Constructor
    public Usuario(int id, String name, String phone, String city, String email, String personalNumber) {
        this.id = id;
        Name = name;
        Phone = phone;
        City = city;
        Email = email;
        PersonalNumber = personalNumber;
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getCity() {
        return City;
    }

    public String getEmail() {
        return Email;
    }

    public String getPersonalNumber() {
        return PersonalNumber;
    }


    //Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPersonalNumber(String personalNumber) {
        PersonalNumber = personalNumber;
    }
}

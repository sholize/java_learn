package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String nickName;
    private final String address;
    private final String mobile;
    private final String email;



    public ContactData(String firstName, String lastName, String nickName, String address, String mobile, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.address = address;
        this.mobile = mobile;
        this.email = email;

    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getNickName(){return nickName;}

    public String getAddress(){return address;}
    public String getMobile(){return mobile;};
    public String getEmail(){return email;};








}

package thongtin;

import java.util.Scanner;

public class Person {
    private String name;
    private String sex;
    private int date;
    private String address;

    public Person(String name, String sex, int date, String address) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void InputInfo(){
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap ten : ");
        name=nhap.nextLine();
        System.out.println("Nhap gioi tinh : ");
        sex=nhap.nextLine();
        System.out.println("Nhap nam sinh : ");
        date=nhap.nextInt();
        System.out.println("Nhap dia chi : ");
        address=nhap.nextLine();

    }
    public void ShowInfo(){
        System.out.println("Ten la : "+name);
        System.out.println("Gioi tinh : "+sex);
        System.out.println("Nam sinh : "+date);
        System.out.println("Dia chi : "+address);
    }

}

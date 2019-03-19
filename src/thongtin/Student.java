package thongtin;

public class Student extends Person {
    public void kiemtratuoi(){
        int x=2019,y;
        y=x-getDate();
        if (y>=18){
           System.out.println("Da du 18 tuoi .");
        }
        else {
          System.out.println("Chua du 18 tuoi .");
        }
    }

}

package Jobsheet2;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setStatusMesin(false);
        int kecepatanBaru = 50;
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        kecepatanBaru = 40;
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setStatusMesin(true);
        kecepatanBaru = 60;
        motor3.setKecepatan(kecepatanBaru);
        motor3.displayInfo();
    }
}

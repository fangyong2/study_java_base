package cn.com.jbit;


public class UsbFan implements UsbInterface{
    public void service(){
        System.out.println("连接USB口，获得电流，风扇开始转动。");
    }
}

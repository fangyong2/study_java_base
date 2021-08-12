package cn.com.jbit;

public class Test{	
	public static void main(String[] args){		
		
		UsbInterface uDisk=new UDisk();
		uDisk.service();		
		
		UsbInterface usbFan= new UsbFan();
		usbFan.service();
	}
}


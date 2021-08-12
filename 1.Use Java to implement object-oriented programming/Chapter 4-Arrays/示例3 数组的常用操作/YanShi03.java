package com.cmcc.base;
/**
 * 数组的常用操作
 */
public class YanShi03 {
	//第三个演示示例参考答案
	public static void main(String[] args){
		//数组添加
		System.out.println("----数组添加：----");
		int index=-1;
		String[] phones = {"iPhone4","iPhone4S","iPhone5",null};
		for(int i=0;i<phones.length;i++){
			if(phones[i]==null){
				index=i;
				break;
			}
		}
		if(index!=-1){
			phones[index]="iPhone5S";
			for(int i=0;i<phones.length;i++){
				System.out.println(phones[i]);
			}
		}else{
			System.out.print("数组已满");
		}
//--------------------------------------------------------------------------------------------------------------------------------
		//数组修改
		System.out.println("----数组修改：----");
		int indexNew=-1;
		String[] phoness = {"iPhone3GS经典","iPhone4革新","iPhone4S变化不大","iPhone5"};
		for(int i=0;i<phoness.length;i++){
			if(phoness[i].equals("iPhone5")){
				indexNew=i;
				break;
			}
		}
		if(indexNew!=-1){
			phoness[indexNew]="iPhone5掉漆";
			for(int i=0;i<phoness.length;i++){
				System.out.println(phoness[i]);
			}
		}else{
			System.out.print("不存在iPhone5");
		}
//--------------------------------------------------------------------------------------------------------------------------------
		//数组删除
		System.out.println("----数组删除：----");
		String[] phonesss = {"iPhone3GS经典","iPhone4革新","iPhone4S变化不大","iPhone5掉漆"};
		int indexNewNew=-1;
		for(int i=0;i<phonesss.length;i++){
			if(phonesss[i].equals("iPhone3GS经典")){
				indexNewNew=i;
				break;
			}
		}
		if(indexNewNew!=-1){
			for(int i=indexNewNew;i<phonesss.length-1;i++){
				phonesss[i]=phonesss[i+1];
			}
			phonesss[phonesss.length-1]=null;
		}else{
			System.out.println("没有您要删除的内容！");
		}
		for(int k = 0;k<phonesss.length;k++){
			System.out.println(phonesss[k]);
		}
	}
}
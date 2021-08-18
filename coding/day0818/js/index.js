function dome(){
	// 变量
	var a = 10;
	var b = 20;
	console.log(a+b) 
	
	//if 
	result = 59;
	if(result>=60){
		console.log("ok");
	}else{
		console.log("not ok");
	}
	
	//for 1+2+3...10=55
	var sum = 0;
	for(i =1;i<11;i++){
		sum +=i;
	}
	console.log(sum);
	
	//数组 Array
	var array = new Array();
	array[0]=10;
	array[1]=20;
	array[0]=30;
	console.log(array);
	
	for(i=0;i<array.length;i++){
		console.log(array[i])
	}
	
	for(i in array){
		console.log(array[i])
	}

	
	//ajax,无刷新页面	
}

//事件--> onload页面加载事件
function finish(){
	alert("hello world!!!!");
}

//ajax
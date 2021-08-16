import java.util.*;

public class MyTest {
    public static void main(String[] args) {
//        int[] a = {1,2,3};
//        //第一种遍历数组
//        for(int i=0;i<a.length;i++){
//            System.out.println(i);
//        }
//
//        //第二种遍历数组
//        for(int i:a){
//            System.out.println(i);
//        }

        //数组的弊端？？

        /**集合List，curd增删改查**/
        List list = new ArrayList();
        //1.增加
        list.add(1);
        list.add(0,10);
        list.add(2);
        list.add(3);
        list.add("fy");
        //2.修改
        list.set(0,100);
        //3.删除
        list.remove(0);
        //4.查询
        for(Object object:list){
            System.out.println(object);
        }

        for(int i=0;i<list.size();i++){
            System.out.println("index="+i+",value="+list.get(i));
        }

        //迭代器
        Iterator iterator = list.iterator();
        //判断下一个元素是否有值(==数据库的游标)
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }

        //橘黄色下划线,泛型
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(600);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);
        //list1.add("fy");

        for(Integer value:list1){
            System.out.println(value);
        }

        for(int i=0;i<list1.size();i++){
            System.out.println("index="+i+",value="+list1.get(i));
        }

        //迭代器
        Iterator<Integer> iterator1 = list1.iterator();
        //判断下一个元素是否有值(==数据库的游标)
        while (iterator1.hasNext()){
            Integer value = iterator1.next();
            System.out.println(value);
        }

        System.out.println("#########################################################################");
        /**集合Set(默认去重,无序)，curd增删改查**/
        Set<Integer> set = new TreeSet<Integer>();
        //1.增加
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        //2.修改

        //3.删除
        set.remove(20);
        //4.查询
        for(Integer value:set){
            System.out.println(value);
        }

        //迭代器
        Iterator<Integer> iterator2 = set.iterator();
        //判断下一个元素是否有值(==数据库的游标)
        while (iterator2.hasNext()){
            Integer value = iterator2.next();
            System.out.println(value);
        }

        //集合是否包含10这个数据
        boolean flag = set.contains(1);
        System.out.println(flag);

        System.out.println("#########################################################################");

        /**Comparable*/
        //变量比较大小（面向过程编程）
        int a = 3;
        int b = 2;
        int result;
        if(a==b){
            result = 0;
        }else if(a>b){
            result = 1;
        }else{
            result = -1;
        }
        System.out.println(result);


        for(Integer value:list1){
            System.out.println(value);
        }
        Collections.sort(list1);

        for(Integer value:list1){
            System.out.println(value);
        }
        //对象比较大小（面向对象编程）
        Olympic usa = new Olympic(39,41,33);
        usa.setCountry("usa");
        Olympic china = new Olympic(38,32,18);
        china.setCountry("china");
        Olympic jap = new Olympic(27,14,17);
        jap.setCountry("jap");

        List<Olympic> objList = new ArrayList<Olympic>();
        objList.add(jap);
        objList.add(usa);
        objList.add(china);

        //排序,默认升序
        Collections.sort(objList);

        System.out.println(objList);

        System.out.println(china.hashCode());
        System.out.println(usa.hashCode());
        System.out.println(jap.hashCode());

        System.out.println(china.equals(usa));
        Olympic usa1 = usa;
        System.out.println(usa1.hashCode());
        //hashCode是否相等
        System.out.println(usa1.equals(usa));

        System.out.println("#########################################################################");
        /*
        *{"姓名":"方勇","年龄":40,"性别":"男"},无序的数据结构
         */
        Map<String,String> map = new HashMap<String,String>();
        //1.增加
        map.put("name","fy");
        map.put("sex","male");
        map.put("age","40");
        //2.修改
        map.replace("name","fy_replace");

        //3.删除
        map.remove("name");

        //4.查询

        for(String value:map.values()){
            System.out.println(value);
        }

        for(String key:map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.get("age"));
    }
}

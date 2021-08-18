public class Person {
    //姓名
    private String name;
    //年龄
    private Integer age;
    //学历
    private Integer education;

    public Person() {

    }

    public Person(String name, Integer age, Integer education) {
        this.name = name;
        this.age = age;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }


    @Override
    public int hashCode() {
        return super.hashCode()/10000;
    }

    @Override
    public boolean equals(Object obj) {
        //默认比较是地址，改为比较值，先age，education
        Person person = (Person)obj;
        if(this.age==person.age && this.education==person.education){
            return true;
        }else{
            return false;
        }
        //return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

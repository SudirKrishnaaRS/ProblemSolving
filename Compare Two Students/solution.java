class Student
{
    String name;
    int age;
    String country;
    Student(String name,int age,String country)
    {
        this.name=name;
        this.age=age;
        this.country=country;
    }
    
    public boolean equals(Student obj)
    {
        if(this.name.equalsIgnoreCase(obj.name) && 
        this.age==obj.age && 
        this.country.equalsIgnoreCase(obj.country) )
        {
            return true; 
        }
        else
        {
            return false;
        }
    
    }
    
}

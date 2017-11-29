class Person {
    //Instance variables
    private String name;
    private String email;
    private int age;

    //constructor
    public Person(String name, String email, int age){
        this.name = name;
        this.email = email;
        assert age > 0;
        this.age = age;
    }

    //methods
    public String getName(){
        return name;
    }

    private String getEmail() {
        return email;
    }

    private int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int setAge(int age) {

          if(age < 0){
            System.out.println("Sorry, person's age cannot be negative. Person record will not change.");
            return 0;

          } else if(age >= 120){
              System.out.println("Sorry, person's age number is too large, please double check. Person record will not change.");
              return -1;


          } else{

              this.age = age;
              return 1;
          }

        }

    public String toString() {
        return  "\nName: " + getName() +  "\nEmail: " + getEmail() + "\nAge: " + getAge();
    }

}

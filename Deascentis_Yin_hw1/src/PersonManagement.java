import java.io.*;
import java.util.*;

class PersonManagement {

    private static Scanner scan = new Scanner(System.in);
    //get file name
    private static File file = new File("./src/person_info.txt");
    //save personFromInfo
    private static List<Person> personFromInfo = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        readPersonInfoFromTXT();
        displayUserMenu();
    }
    //Read person_info.txt readPersonInfoFromTXT()
    private static void readPersonInfoFromTXT() throws IOException {

                try {
                /*read filename **/
                //create scanner
                Scanner fileScan = new Scanner(file);

                if (fileScan.hasNextLine()){
                String firstLine = fileScan.nextLine();
                int lineCount = Integer.parseInt(firstLine);
                //System.out.println(lineCount);

                for(int i = 0; i <lineCount; i++){
                String line = fileScan.nextLine();
                String[] personData = line.split(", ");
                String name = personData[0];
                String email = personData[1];
                int age = Integer.parseInt(personData[2]);
                Person people = new Person(name, email, age);
                personFromInfo.add(people);

        }
        }

//        for(Person people: personFromInfo){
//        System.out.println(people.toString());
//        }

        } catch (IOException e) {
        System.out.println("Uh oh, got an IOException error!");
        e.printStackTrace();
        }

    }

    //Display user menu for user to choose
    private static void displayUserMenu() throws IOException {
        System.out.println("Please choose follow Menu by Entering Number on your keyboard.");
        System.out.println("1. Person information");
        System.out.println("2. Update email");
        System.out.println("3. Update age");
        System.out.println("4. Exit program");

        String choice;
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    findPerson();
                    break;
                case "2":
                    updateEmail();
                    break;
                case "3":
                    updateAge();
                    break;
                case "4":
                    System.out.println("Bye!");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Please, Enter number from 1 to 4");
            }
        }
        while(!choice.equals("4"));
    }
    //find the person after user enter name
    private static void findPerson() throws IOException{
        System.out.println("Please enter user first name and last name, separate by space: ");
        String userInputName = scan.nextLine();
        int count = 0;
        System.out.println("You had enter: "+userInputName);
        for(Person person: personFromInfo){
            if(person.getName().equals(userInputName)) {
                person.setName(userInputName);
                System.out.println(person +"\n");
                count++;
            }
        }
        if(count <= 0){
            System.out.println("There is no such name in the record."+"\n");
        }
        displayUserMenu();

    }
    //update person's email when user enter 2
    private static void updateEmail() throws IOException{

        System.out.println("Please enter user first name and last name, separate by space: ");
        String userInputName = scan.nextLine();
        int count = 0;
        System.out.println("You had enter: "+userInputName);
        for(Person person: personFromInfo){
            if(person.getName().equals(userInputName)) {
                System.out.println(person +"\n");
                count++;
                System.out.print("Please enter New Email for "+userInputName+": " +"\n");
                String userInputEmail = scan.next();
                person.setEmail(userInputEmail);
                System.out.println(userInputName + " New Record is: " + person +"\n");
            }
        }
        if(count <= 0){
            System.out.println("There is no such name in the record."+"\n");
        }
        displayUserMenu();
    }

    //Update person's age when user enter 3
    private static void updateAge() throws IOException{

        System.out.println("Please enter user first name and last name, separate by space: ");
        String userInputName = scan.nextLine();
        System.out.println("You had enter: "+userInputName);
        int count = 0;
        for(Person person: personFromInfo){
            if(person.getName().equals(userInputName)) {
                System.out.println(person +"\n");
                count++;
                System.out.println("Please enter New Age for this person: ");
                int userInputAge = Integer.parseInt(scan.next());

                if( person.setAge(userInputAge) <= 0){
                    displayUserMenu();
                } else{
                    System.out.println(userInputName+ " New Record is: " + person +"\n");
                }

                }

        }
        if(count <= 0){
            System.out.println("There is no such name in the record."+"\n");
        }

        displayUserMenu();
    }


}

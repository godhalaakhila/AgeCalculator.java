public class AgeCalculator {
    public static void main(String[] args){
        int birthYear=2005;
        int currentYear=2024;
        int age=calculateAge(birthYear,currentYear);
        System.out.println("Your age is:"+age);
    }
    public static int calculateAge(int birthYear,int currentYear){
        return currentYear-birthYear;
    }


    }
    


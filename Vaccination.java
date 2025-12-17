abstract class Vaccine {
    int age;
    String nationality;
    boolean isFirstDoseTaken = false;
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }
    void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            isFirstDoseTaken = true;
            System.out.println("Your First dose Successfully Done.Now you have to pay 250 Rs");
        } else {
            System.out.println("You are not eligible for first dose");
        }
    }
    void secondDose() {
        if (isFirstDoseTaken) {
            System.out.println("Your Second dose Successfully Done");
        } else {
            System.out.println("Please take first dose first");
        }
    }
    abstract void boosterDose();
}
class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        if (isFirstDoseTaken) {
            System.out.println("Your Booster dose Successfully Done");
        } else {
            System.out.println("You are not eligible for booster dose");
        }
    }
}
public class Vaccination {
    public static void main(String[] args) {

        VaccinationSuccessful v = new VaccinationSuccessful(18, "Indian");

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}

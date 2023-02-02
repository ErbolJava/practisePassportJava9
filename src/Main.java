import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.lastName = "Zholborsov";
        passport.name = "Erbol";
        passport.gender = "M";
        passport.yearOfBirth= LocalDate.of(2004,11,22);
        passport.countryOfBirth = "Kyrgyz Republic";
        passport.id = 1995175;
        System.out.println(passport.lastName+"\n"
                +passport.name+"\n"+passport.gender
                +"\n"+passport.countryOfBirth+"\n"
                +passport.yearOfBirth+"    "+passport.id);
    }
    }

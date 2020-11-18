package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Profile extends Account{
    private String name;
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        int age = LocalDate.EPOCH.getYear() - dateOfBirth.getYear();
        return age;
    }

    public boolean allowedToWatch(Content content){
        boolean result = false;
        int age = getAge();
        if (age > content.getMaturityRating().getMinimumAge()){
            result = true;
        }
        return result;
    }
}

package collections;

public class PersonFactory {

    public static ArraysPerson[] getPersonArray(int numOfPeople){
        ArraysPerson[] arr = new ArraysPerson[numOfPeople];
        for (int i = 0; i < arr.length; i++){
            arr[i] = getPerson();
        }
        return arr;
    }

    public static ArraysPerson getPerson(){
        ArraysPerson p = new ArraysPerson();
        p.setName("Casey");
        p.setJob(getJob());
        return p;
    }

    public static Job getJob(){
        Job j = new Job();
        j.setJobTitle("Instructor");
        return j;
    }
}

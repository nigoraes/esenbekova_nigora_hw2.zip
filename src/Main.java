public class Main {
    public static void main(String[] args) {
        Printable [] printables ={
                createObject("Daughter"),
                createObject("DaughterB"),
                createObject("DaughterC")};
        
        for (Printable printable : printables) {
            printable.print();

        }
    }


public static Printable createObject(String className){
        switch (className){
            case "DaughterA":
                DaughterA daughterA = new DaughterA("Good","ainazik");
                return daughterA;
            case  "DaughterB":
                DaughterB daughterB = new DaughterB("Bad",23);
                return daughterB;
            case "DaughterC":
                DaughterC daughterC = new DaughterC("Great","games");
                return daughterC;
                
        }
        return  null;
}
}

public class Main {
    public static void main(String[] args) {



        System.out.println("THE START");

        Fish fish = new Fish();
        fish.setName("beast fish");
        fish.setKingdom("Animals");
        fish.setType("Chordates");
        fish.setClassF("hard fish");
        fish.setColor("blak pipe fish");
        System.out.println(fish.getName());
        System.out.println(fish.getKingdom());
        System.out.println(fish.getType());
        System.out.println(fish.getClassF());
        System.out.println(fish.getColor());
        System.out.println("______________________________");

        Popugay popugay = new Popugay();
        popugay.setName("kesha2");
        popugay.setBreed("kakadu");
        popugay.setColor("blue");
        popugay.setSkill("sings");
        System.out.println(popugay.getName());
        System.out.println(popugay.getBreed());
        System.out.println(popugay.getColor());
        System.out.println(popugay.getSkill());
        System.out.println("------------------------------");

        Cat cat = new Cat();
        cat.setName("persic");
        cat.setBreed("mein kuun");
        cat.setColor("green");
        cat.setPost("security mouse");
        System.out.println(cat.getName());
        System.out.println(cat.getBreed());
        System.out.println(cat.getColor());
        System.out.println(cat.getPost());
        System.out.println("-------------------------------");


        Doc doc = new Doc();
        doc.setName("gresha");
        doc.setBreed("taygan");
        doc.setColor("black");
        doc.setPost("security hom");
        System.out.println(doc.getName());
        System.out.println(doc.getBreed());
        System.out.println(doc.getColor());
        System.out.println(doc.getPost());
        System.out.println("THE END");

    }
}
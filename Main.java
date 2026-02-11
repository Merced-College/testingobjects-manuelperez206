public class Main {
   public static void main(String[] args) {

      Dog d1 = new Dog();
      Dog d2 = new Dog("Rex", 4, "Collie");

      System.out.println(d1);
      System.out.println(d2);

      d2.setAge(6);
      d2.setName("Max");
      d2.setBreed("Border Collie");
      System.out.println("d2 age via getter = " + d2.getAge());
      System.out.println(d2);

      Quokka q1 = new Quokka();
      Quokka q2 = new Quokka("Miso", 14, "Mainland WA", 8, false);

      System.out.println(q1);
      System.out.println(q2);

      q2.setHappiness(10);
      q2.setHungry(true);
      System.out.println("q2 happiness via getter = " + q2.getHappiness());
      System.out.println(q2);
   }
}

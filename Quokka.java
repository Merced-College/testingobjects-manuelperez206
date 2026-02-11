public class Quokka {
   private String name;
   private int ageMonths;
   private String location;
   private int happiness;
   private boolean hungry;

   public Quokka() {
      name = "Pebble";
      ageMonths = 6;
      location = "Rottnest Island";
      happiness = 9;
      hungry = true;
   }

   public Quokka(String name, int ageMonths, String location, int happiness, boolean hungry) {
      this.name = name;
      this.ageMonths = Math.max(0, ageMonths);
      this.location = location;
      this.happiness = clamp(happiness, 1, 10);
      this.hungry = hungry;
   }

   private int clamp(int value, int min, int max) {
      if (value < min) return min;
      if (value > max) return max;
      return value;
   }

   @Override
   public String toString() {
      return "Quokka{name='" + name + "', ageMonths=" + ageMonths + ", location='" + location
            + "', happiness=" + happiness + ", hungry=" + hungry + "}";
   }

   public String getName() { return name; }
   public void setName(String name) { this.name = name; }

   public int getAgeMonths() { return ageMonths; }
   public void setAgeMonths(int ageMonths) {
      if (ageMonths >= 0) this.ageMonths = ageMonths;
   }

   public String getLocation() { return location; }
   public void setLocation(String location) { this.location = location; }

   public int getHappiness() { return happiness; }
   public void setHappiness(int happiness) { this.happiness = clamp(happiness, 1, 10); }

   public boolean isHungry() { return hungry; }
   public void setHungry(boolean hungry) { this.hungry = hungry; }
}

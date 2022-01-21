package contents.items;

import mindustry.ctype.*;
import mindustry.type.*;
public class GItem extends Item {
  public double newEnergy = 20;
  public GItem(String name,double newEnergy) {
    super(name);
    this.newEnergy = newEnergy;
    String str = "newEnergy: " + newEnergy;
    description += str;  
  }
}

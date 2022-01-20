package contents.items;

import mindustry.ctype.*;
import mindustry.type.*;
public class GItem extends Item {
  public double newEnergy = 20;
  String str = "newEnergy: " + newEnergy;
  public GItem(String name, Color color,int newEnergy) {
    this.newEnergy = newEnergy;
    description += str;  
  }
}

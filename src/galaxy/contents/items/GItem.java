package contents.items;

import mindustry.ctype.*;
import mindustry.type.*;
public class GItem extends Item {
  public double newEnergy = 20;
  public GItem() {
    description += \n"newEnergy: " + newEnergy;  
  }
}

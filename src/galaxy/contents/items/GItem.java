package contents.items;

import mindustry.ctype.*;
import mindustry.type.*;
public class GItem extends Item {
  public double newEnergy = 20;
  public String GIname;
  public Color color;
  public GItem(GIname,color) {
    String str = "newEnergy: " + newEnergy;
    description += str;  
  }
}

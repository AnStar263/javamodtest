package galaxy.contents.items;

import mindustry.ctype.*;
import mindustry.type.*;
public class GItem extends Item {
  public double radiation = 20;
  public GItem(String name,double radiation) {
    super(name);
    this.radiation = radiation;
  }
}

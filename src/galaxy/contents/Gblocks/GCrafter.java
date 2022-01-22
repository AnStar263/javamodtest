package galaxy.contents.Gblocks;

import mindustry.entities.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.content.*;
import mindustry.world.blocks.production.*;
public class GCrafter implements ContentList {
  public static GenericSmelter blastFurnace;
  public void load() {
       blastFurnace = new GenericSmelter("blastFurnace") {
       
       };
  }
}

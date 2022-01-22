package galaxy.contents.GStatusEffect;

import mindustry.entities.*;
import mindustry.type.*;
import mindustry.entities.*;
import mindustry.ctype.*;

import galaxy.contents.GFx.*;

public class GStatusEffect implements ContentList {
  public static StatusEffect Radiating,unRadiating;
  public void load() {
    Radiating = new StatusEffect("Radiating") {{
      damage = 0.10f;
      effectChance =1f;
      effect = Radiate;
      /*init(() -> {
                trans(shocked, ((unit, time, newTime, result) -> {
                    unit.damagePierce(20f);
                    if(unit.team() == state.rules.waveTeam){
                        Events.fire(Trigger.shock);
                    }
                    result.set(this, time);
                }));
                opposite(unRadiating);
            });*/
    }};
    unRadiating = new StatusEffect("unRadiating") {{
      damage = 0.10f;
      effectChance =1f;
      effect = Radiate;
      /*init(() -> {
                trans(shocked, ((unit, time, newTime, result) -> {
                    unit.damagePierce(20f);
                    if(unit.team() == state.rules.waveTeam){
                        Events.fire(Trigger.shock);
                    }
                    result.set(this, time);
                }));
                opposite(Radiating);
            });*/
    }};
  }
}

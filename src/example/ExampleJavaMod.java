package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        loadContent();  
    }

    @Override
    public void loadContent(){
        
    }
}
public class CustomItems implements ContentList {
    public static Item sodium;
    @override
    public void load() {
        sodium = new Item("sodium",Color.valueOf("f5fffa")){{
            cost = 0.3f;
            alwaysUnlocked = true;
        }};
    }
}

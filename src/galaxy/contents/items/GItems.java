package galaxy.contents.items;
import galaxy.contents.*;
import mindustry.content.*;
import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class GItems implements ContentList{
    public static GItem Iron;
    public void load(){
        Iron = new GItem("Iron"/*,Color.valueOf("fffaf0")*/,20){{

        }};

    }

}

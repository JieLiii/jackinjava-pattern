package prototype;

import java.util.HashMap;

/**
 * @author LiJie on 2019/8/13
 */
public class ProtoTypeManager {
    private HashMap<String, Shape> ht = new HashMap<>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String key, Shape obj){
        ht.put(key, obj);
    }

    public Shape getShape(String key){
        return ht.get(key);
    }
}

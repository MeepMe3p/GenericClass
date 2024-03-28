package Map;

import java.util.ArrayList;
import java.util.Objects;

public class MyMap <Key, Value>{
    ArrayList<Key> keys = new ArrayList<>();
    ArrayList<Value> values = new ArrayList<>();

    public void put(Key key, Value value){
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else{
            values.remove(keys.indexOf(key));
            values.add(keys.indexOf(key), value);
        }

    }
    public void print(){
        System.out.println("Value: ");
        for(Value v: values){
            System.out.print(v+", ");
        }
        System.out.println();
        System.out.println("Key: ");
        for(Key k: keys){
            System.out.print(k+", ");
        }
    }
    public Value get(Key key){
        if(keys.contains(key)){
            return values.get(keys.indexOf(key));

        }
        return null;
    }
    public Value remove(Key key){
        if(keys.contains(key)){
            Value value = values.get(keys.indexOf(key));
            values.remove(keys.indexOf(key));
            keys.remove(key);
            return value;


        }
        return null;
    }

}

package Main;

/**
 *
 * @author Angie Cooper
 */
public class Register {
    String name = null;
    int value = 0;
    
    public Register(String pName, int pValue){
        name = pName;
        value = pValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}

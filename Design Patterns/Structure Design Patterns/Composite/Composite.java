import java.util.ArrayList;

public class Composite implements Component{
    String name;
    ArrayList<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void displayPrice() {
       System.out.println("Name: " + name );
       for (Component component : components) {
           component.displayPrice();
       }
    }
    
}

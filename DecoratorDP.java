// Component interface
interface Pizza {
    String getDescription();
    double cost();
}

// Concrete component
class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza with dough and tomato sauce";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}

// Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}

// Concrete decorator
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}

// Concrete decorator
class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepperoni";
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Create a basic pizza
        Pizza basicPizza = new BasicPizza();
        System.out.println("Basic Pizza:");
        System.out.println(basicPizza.getDescription());
        System.out.println("Cost: $" + basicPizza.cost());

        // Add cheese to the pizza
        Pizza cheesePizza = new CheeseDecorator(basicPizza);
        System.out.println("\nPizza with Cheese:");
        System.out.println(cheesePizza.getDescription());
        System.out.println("Cost: $" + cheesePizza.cost());

        // Add pepperoni to the pizza
        Pizza pepperoniPizza = new PepperoniDecorator(cheesePizza);
        System.out.println("\nPizza with Cheese and Pepperoni:");
        System.out.println(pepperoniPizza.getDescription());
        System.out.println("Cost: $" + pepperoniPizza.cost());
    }
}

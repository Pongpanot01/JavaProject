public class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    @Override
    public void move() {
       System.out.println(name + " Fly");
        
    }

    @Override
    public void sound() {
       System.out.println(name + " can sing");
        
    }
    
}

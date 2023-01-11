package behavioral.templateMethod;

public abstract class C {

    public void templateMethod(){
        System.out.print(1);
        differ();
        System.out.print(3);
        differ2();

    }

    public abstract void differ2();

    public abstract void differ();
}

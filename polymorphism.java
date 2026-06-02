class Distance
{
    void payment()
    {
        System.out.println("Travel for 2 km distance");
    }
}
class Auto extends Distance
{
    @Override
    void payment()
    {
        int payment=180;
        System.out.println("Auto payment: "+payment);
        System.out.println("not satisfied");
    }
}
class Cab extends Distance
{
    @Override
    void payment()
    {
        int payment=250;
        System.out.println("Cab payment: "+payment);
        System.out.println("not satisfied");
    }
}
class Bike extends Distance
{
    @Override
    void payment()
    {
        int payment=80;
        System.out.println("Bike payment: "+payment);
        System.out.println("satisfied");
    }
}
class Main
{
    public static void main(String args[])
    {
	Distance d=new Distance();
        Auto a = new Auto();
        Cab c = new Cab();
        Bike b = new Bike();
	d.payment();
        a.payment();
        c.payment();
        b.payment();
    }
}
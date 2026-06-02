
interface Notifications
{
    void sendmsg(String msg);
}
class Watsapp implements Notifications
{
    public void sendmsg(String msg)
    {
        System.out.println("Message sent through Watsapp: "+msg);
    }
}
class Instagram implements Notifications
{
    public void sendmsg(String msg)
    {
        System.out.println("Message sent through Instagram: "+msg);
    }
}
class Jobnotification implements Notifications
{
    public void sendmsg(String msg)
    {
        System.out.println("Message sent through Jobnotification: "+msg);
    }
}
class Main
{
    public static void main(String args[])
    {
        Watsapp w= new Watsapp();
        Instagram insta= new Instagram();
        Jobnotification job= new Jobnotification();
        w.sendmsg("Hello");
        insta.sendmsg("sent a reel");
        job.sendmsg("you have a message");
    }
}
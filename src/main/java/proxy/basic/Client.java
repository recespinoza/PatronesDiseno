package proxy.basic;

public class Client {

    public static void main (String [] args){
        // create proxy
        ISubject proxy = new Proxy("filter asdasd");

        proxy.request();
    }
}


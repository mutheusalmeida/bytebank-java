public class App {
    public static void main(String[] args) throws Exception {
        Account client = new Account();

        client.accounHolder = "Matheus Almeida";
        client.accountBalance = 200;

        System.out.println(client.accountBalance);
        
        client.accountBalance += 300;
        
        System.out.println(client.accountBalance);
    }
}

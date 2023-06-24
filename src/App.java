public class App {
    public static void main(String[] args) throws Exception {
        Account client = new Account();
        Account newClient = client;

        client.accounHolder = "Matheus Almeida";
        client.accountBalance = 200;

        System.out.println(client.accountBalance);
        
        client.accountBalance += 300;

        System.out.println(client.accountBalance);

        newClient.accountBalance = 0;

        System.out.println("client account balance is " + client.accountBalance);
        System.out.println("newClient account balance is " + newClient.accountBalance);
    }
}

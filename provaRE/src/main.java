public class main {
    public static void main(String args[]) {
        int n, m;
        System.out.println("você deseja criar quantos times?");
        m = Integer.parseInt(System.console().readLine());
        time[] times = new time[m];
        for (int i = 0; i < m; i++) {
            times[i] = new time();
        }

        System.out.println("você deseja ler as informações de quantos times?");
        n = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < n; i++)
            times[i].toString();
        
        System.out.println("removendo times instanciados.........................................");
        for (int i = 0; i < m; i++)
            times[i] = null;
        
    }
    
}


import javax.swing.*;
import java.io.*;


// imprimir arquivo no console:
public class CheckedException {
    public static void main(String[] args) {

        String nomeDoArquivo = "livros.txt";
        
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);

        } catch(FileNotFoundException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "revise o nome do arquivo que você deseja imprimir:" + e.getCause());

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ocorreu um erro inesperado! entre em contato com o suporte." + e.getCause());
            
        } finally{
            System.out.println("chegou no finally");
        }

        System.out.println("apesar da exception ou não, o programa continua...");
        
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{

        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();

        } while(line != null);
        bw.flush();
        br.close();
        
    }
}
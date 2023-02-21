import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main_test {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
    	bw.write("강한친구 대한육군");
    	bw.newLine();
    	bw.write("강한친구 대한육군");
    	bw.flush();
    }
}

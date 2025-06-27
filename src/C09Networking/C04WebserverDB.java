package C09Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C04WebserverDB {
    public static void main(String[] args) throws IOException, SQLException {
        String url = "jdbc:mysql://localhost:3306/board?useSSL=false";
        String userName = "root";
        String password = "1234";
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작");
        while (true) {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement st = connection.createStatement();

            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            System.out.println(sb);


            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            if (infos.contains("?")) {
                id = infos.split("=")[1];
            }
            ResultSet rs = st.executeQuery("select * from post where id=" + '\'' + id + '\'');
            String reponse = "HTTP/1.1 200 OKay\r\n\r\n";
            while (rs.next()) {
                reponse += "ID: " + rs.getInt("id") + "\n";
                reponse += "Title: " + rs.getString("title") + "\n";
                reponse += "Contents: " + rs.getString("contents") + "\n";
            }
            socket.getOutputStream().write(reponse.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();
            connection.close();
        }
    }
}

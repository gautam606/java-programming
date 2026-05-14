import java.io.*;
import java.net.*;

public class SimpleWebServer {

    public static void main(String[] args) {

        try {

            // CREATE SERVER

            ServerSocket server = new ServerSocket(9999);

            // GET COMPUTER IP

            InetAddress ip = InetAddress.getLocalHost();

            System.out.println("=================================");
            System.out.println(" JAVA WEB SERVER STARTED ");
            System.out.println("=================================");

            System.out.println("Open in Laptop:");
            System.out.println("http://localhost:9999");

            System.out.println("\nOpen in Mobile:");
            System.out.println("http://" +
                    ip.getHostAddress() + ":9999");

            System.out.println("=================================");

            // SERVER RUNS FOREVER

            while (true) {

                // ACCEPT CLIENT

                Socket client = server.accept();

                System.out.println("\nClient Connected");

                try {

                    // READ REQUEST

                    BufferedReader br =
                            new BufferedReader(
                                    new InputStreamReader(
                                            client.getInputStream()));

                    // SEND RESPONSE

                    OutputStream os =
                            client.getOutputStream();

                    PrintWriter pw =
                            new PrintWriter(os, true);//send http request to the client*3-

                    // GET FIRST REQUEST LINE

                    String requestLine =
                            br.readLine();

                    System.out.println(
                            "Request: " + requestLine);

                    String path = "/";

                    // EXTRACT FILE PATH

                    if (requestLine != null &&
                            !requestLine.isEmpty()) {

                        String[] parts =
                                requestLine.split(" ");

                        if (parts.length > 1) {

                            path = parts[1];
                        }
                    }

                    // DEFAULT PAGE

                    if (path.equals("/")) {

                        path = "/index.html";
                    }

                    // ACCESS FILE FROM D DRIVE

                    File file =
                            new File("D:" + path);

                    System.out.println(
                            "Looking for file: "
                                    + file.getAbsolutePath());

                    // FILE EXISTS

                    if (file.exists() &&
                            !file.isDirectory()) {

                        // DETECT CONTENT TYPE

                        String contentType =
                                URLConnection
                                        .guessContentTypeFromName(
                                                file.getName());

                        // UNKNOWN TYPE

                        if (contentType == null) {

                            contentType =
                                    "application/octet-stream";
                        }

                        // SEND HTTP HEADER

                        pw.println("HTTP/1.1 200 OK");
                        pw.println(
                                "Content-Type: "
                                        + contentType);

                        pw.println(
                                "Content-Length: "
                                        + file.length());

                        pw.println();

                        pw.flush();

                        // SEND FILE

                        BufferedOutputStream bos =
                                new BufferedOutputStream(os);

                        FileInputStream fis =
                                new FileInputStream(file);

                        byte[] buffer =
                                new byte[8192];

                        int count;

                        //reads file chunk by chunk
                        while ((count =
                                fis.read(buffer)) != -1) {

                            bos.write(
                                    buffer,
                                    0,
                                    count);//sends bytes to browser
                        }

                        bos.flush();

                        fis.close();

                        System.out.println(
                                "File Sent Successfully");
                    }

                    else {

                        // 404 RESPONSE

                        pw.println(
                                "HTTP/1.1 404 Not Found");

                        pw.println(
                                "Content-Type: text/html");

                        pw.println();

                        pw.println("<html>");

                        pw.println("<head>");

                        pw.println(
                                "<title>404 Error</title>");

                        pw.println("<style>");

                        pw.println("body {");
                        pw.println(
                                "background:#f4f4f4;");
                        pw.println(
                                "font-family:Arial;");
                        pw.println(
                                "text-align:center;");
                        pw.println(
                                "padding-top:100px;");
                        pw.println("}");

                        pw.println(".box {");
                        pw.println(
                                "background:white;");
                        pw.println(
                                "width:400px;");
                        pw.println(
                                "margin:auto;");
                        pw.println(
                                "padding:30px;");
                        pw.println(
                                "border-radius:10px;");
                        pw.println(
                                "box-shadow:0 0 10px gray;");
                        pw.println("}");

                        pw.println("h1 {");
                        pw.println("color:red;");
                        pw.println(
                                "font-size:50px;");
                        pw.println("}");

                        pw.println("</style>");

                        pw.println("</head>");

                        pw.println("<body>");

                        pw.println("<div class='box'>");

                        pw.println("<h1>404</h1>");

                        pw.println(
                                "<p>File Not Found</p>");

                        pw.println("</div>");

                        pw.println("</body>");

                        pw.println("</html>");

                        pw.flush();

                        System.out.println(
                                "404 File Not Found");
                    }

                }

                catch (Exception e) {

                    System.out.println(
                            "Client Error: "
                                    + e.getMessage());
                }

                finally {

                    // CLOSE CONNECTION

                    client.close();

                    System.out.println(
                            "Client Disconnected");
                }
            }

        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
public class CheckJava {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            int exitCode = process.waitFor(); // waits for command to finish

            if (exitCode == 0) {
                System.out.println("Java is installed on this system.");
            } else {
                System.out.println("Java is NOT installed on this system.");
            }

        } catch (Exception e) {
            System.out.println("Java is NOT installed on this system.");
        }
    }
}


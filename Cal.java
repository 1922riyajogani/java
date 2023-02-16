public class Cal {

    public static void main(String[] args) {

        String a = "37";
        String b = "74";

        int r = 2;

        switch (r) {
            case 1:
                int ans1 = Integer.parseInt(a) + Integer.parseInt(b);
                System.out.println("ans =  " + ans1);
                break;
            case 2:
                int ans2 = Integer.parseInt(a) - Integer.parseInt(b);
                System.out.println("ans =  " + ans2);
                break;
            case 3:
                int ans3 = Integer.parseInt(a) * Integer.parseInt(b);
                System.out.println("ans =  " + ans3);
                break;
            case 4:
                double ans4 = Double.parseDouble(a) / Double.parseDouble(b);
                System.out.println("ans =  " + ans4);
                break;

            default:
                break;
        }
    }
}
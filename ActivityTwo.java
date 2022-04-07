import java.util.Scanner;

class ActivityTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] players = new String[5];
        byte[] ages = new byte[5];

        System.out.println("Please input the names and age of each player in your team below: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Player " + spellNumber(i + 1) + "'s name: ");
            players[i] = sc.nextLine();
            System.out.println("Player " + spellNumber(i + 1) + "'s age: ");
            ages[i] = sc.nextByte();
            sc.nextLine();
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + spellNumber(i + 1) + "'s name is " + players[i] + " and he/she is " + ages[i] + " years old.");
        }

        sc.close();

    }

    public static String spellNumber(int i) {
        String result = "";

        switch(i) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            default:
                result = "Input went past the limit.";
        }

        return result;
    }
}
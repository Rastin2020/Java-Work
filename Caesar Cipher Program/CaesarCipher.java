public class Main {

    public static void main(String[] args) {

        /*--------------- This code only works for 0 =< s =< 104 of the full alphabet range ---------------*/

        System.out.println(Encoder("Hello",2));
    }

    public static String Encoder(String m, int s) {
        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
                'v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
                'v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
                'v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
                'v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
                'v','w','x','y','z'};

        ArrayList<Character> characters = new ArrayList<>();
        for(int i=0; i<m.length(); i++) {
            characters.add(m.charAt(i));
        }
        for(int i=0; i<m.length(); i++) {
            characters.set(i,(alphabet[(charToNumber(characters.get(i)))+s]));
        }

        StringBuilder result = new StringBuilder(characters.size());
        for (Character c : characters) {
            result.append(c);
        }
        return "Answer is " + result;
    }

    public static int charToNumber (char charInput) {
        switch(charInput) {
            case 'a':
            case 'A':
                return 0;
            case 'b':
            case 'B':
                return 1;
            case 'c':
            case 'C':
                return 2;
            case 'd':
            case 'D':
                return 3;
            case 'e':
            case 'E':
                return 4;
            case 'f':
            case 'F':
                return 5;
            case 'g':
            case 'G':
                return 6;
            case 'h':
            case 'H':
                return 7;
            case 'i':
            case 'I':
                return 8;
            case 'j':
            case 'J':
                return 9;
            case 'k':
            case 'K':
                return 10;
            case 'l':
            case 'L':
                return 11;
            case 'm':
            case 'M':
                return 12;
            case 'n':
            case 'N':
                return 13;
            case 'o':
            case 'O':
                return 14;
            case 'p':
            case 'P':
                return 15;
            case 'q':
            case 'Q':
                return 16;
            case 'r':
            case 'R':
                return 17;
            case 's':
            case 'S':
                return 18;
            case 't':
            case 'T':
                return 19;
            case 'u':
            case 'U':
                return 20;
            case 'v':
            case 'V':
                return 21;
            case 'w':
            case 'W':
                return 22;
            case 'x':
            case 'X':
                return 23;
            case 'y':
            case 'Y':
                return 24;
            case 'z':
            case 'Z':
                return 25;
            default:
                return -1;
        }
    }
}

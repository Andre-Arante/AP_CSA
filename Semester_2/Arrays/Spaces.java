// Andre Arante

public class Spaces {

    public static void main(String[] args) {
	// write your code here
        String[] sentences = {"Hello", "hellogoodbye", "hello goodbye", "hello good bye", "yo "};
        System.out.println(get_spaces(sentences));
    }

    public static int get_spaces(String[] arr) {
        int spaces = 0;
        for(String s : arr) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' ') {
                    spaces++;
                }
            }
        }
        return spaces;
    }
}

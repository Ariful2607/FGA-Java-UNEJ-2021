package stringsplit;

public class StringSplit {

	public static void main(String[] args) {
		String sentence = "This is my sentence";

		String[] words = sentence.split(" ");
		//words will look like {This,is,my,sentence}
        for(String word : words)
		   System.out.print(word + ", ");
        //endfor
        System.out.println("\n");
		String[] tokens = sentence.split("i");
		//tokens will look like {Th,s ,s my sentence}
        for(String token : tokens)
		   System.out.print(token + ", ");
        //endfor
        System.out.println("\n");
        String[] tokens2 = sentence.split("[ie]");
        //tokens will look like {Th,s ,s my s,nt,nc}
        //each token is separated by any occurrence of an i or any occurrence of an e.
        for(String token : tokens2)
		   System.out.print(token + ", ");
        //endfor
	}//end method main
}//end class StringSplit

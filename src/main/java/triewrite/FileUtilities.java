package triewrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


/** FileUtilities class provides basic methods to read and write a file, 
 * and search and count words. It uses Binary Search Tree to carry out these functions. 
 */
public class FileUtilities {


	BinarySearchTree<Word> wordTree;  //To store words in the document

	/**readFile() opens the file with filename, 
	 * extracts content into a StringBuilder
	 * and returns the StringBuilder
s	 */
	StringBuilder readFile(String fileName)  {
		File file = new File(fileName);
		StringBuilder fileContent = new StringBuilder();
		try {
			Scanner input = new Scanner (file);
			while (input.hasNextLine()) {
				fileContent.append(input.nextLine() + "\n");
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return fileContent;				
	}
	
	/** writeFile() takes fileName and fileContent
	 * and writes it to the disk in the project folder.
	 */
	String writeFile(String fileName, String fileContent) {
		try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName))) {
			br.write(fileContent );
			return "File saved";

		} catch (IOException e) {
			return "Could not save file";
		}
	}

	/**buildWordTree() takes a text string, tokenizes it into words 
	 * and adds these words into the wordTree.
	 * The regex to find delimiters to tokenize is " .,!?;:\"()[]{}<>-\n"
	 * -----------This method is tested in JUnit test-cases.----------
	 */
	void buildWordTree(String text) {
		//write your code here
	}

	/** getWordPositions() takes a search string,
	 * searches for it in the words in the wordTree, and if found, 
	 * returns its positions in the document as a List.
	 * -----------This method is tested in JUnit test-cases.----------
	 */
	List<Integer> getWordPositions(String searchString) {
		//write your code here
		return null;
	}


	/** wordCount() takes a string, builds its wordTree,
	 * and returns the total number of words in
	 * the document.  
	 * -----------This method is tested in JUnit test-cases.---------- 
	 */
	int countWords(String fileContent) {
		//write your code here;
		return 0;
	}

	/** countUniqueWords() takes a string, builds its wordTree,
	 * and returns unique words in the tree.
	 *-----------This method is tested in JUnit test-cases.----------
	 */
	int countUniqueWords(String fileContent) {
		//write your cide here
		return 0;
	}

}

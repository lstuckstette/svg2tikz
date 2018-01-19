package main.conversion;

public class TikzBuilder {

	private StringBuilder content;

	public TikzBuilder() {
		content = new StringBuilder();
		initTikZ();
	}
	
	private void initTikZ() {
		/*
		 * TODO: write leadin:
		 */
	}

	public void appendString(String input) {

		content.append(input+"\n");
	}

	public String toString() {

		return content.toString();
	}

	public StringBuilder getStringBuilder() {
		return content;
	}

}

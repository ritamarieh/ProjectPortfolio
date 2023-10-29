/**

 *  Learn to use the extend keyword
 *  CS108-1
 *  06 June 2021
 *  @author  Rita Herfi
 */
public class AuthoringAssistantPlus extends AuthoringAssistant{
	/**
	 * 
	 * @param toFind
	 * @param replaceWith
	 * @return usrStr
	 * Will replace every occurrence of toFind with replaceWith in the member variable usrString
	 */
	public String findAndReplace(String toFind, String replaceWith) {
			usrStr = usrStr.replace(toFind, replaceWith);
		return usrStr;
	}
	/**
	 * 
	 * @param spaces
	 * @return
	 * puts the number of spaces at the start of the member variable usrString stored in the object
	 * then returns the updated usrString
	 */
	public String indent(int spaces) {
		String indent = "";
		for(int i = 0; i < spaces; i++) {
			indent += " "; //Goes through number of spaces requested and adds more until desired length
		}
		usrStr = indent + usrStr; //adds indents first then the string
		return usrStr;
	}
	
}

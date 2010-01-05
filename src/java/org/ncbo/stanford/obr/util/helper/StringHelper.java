package org.ncbo.stanford.obr.util.helper;


/**
 * @author Kuladip Yadav
 *
 */
public interface StringHelper {
	
	// Separator '> ' used to separator localConceptIDs for reported annotation
	public static final String GT_SEPARATOR_STRING = "> ";	
	// String constant for empty string
	public static final String EMPTY_STRING = "";
	// String constant for blank space ' '
	public static final String BLANK_SPACE = " ";
	// String constant for comma ','
	public static final String COMMA_STRING = ",";	
	// String constant for semicolon ';'
	public static final String SEMICOLON_STRING = ";";	
	// String constant for comma separator with blank space ', '
	public static final String COMMA_SEPARATOR = COMMA_STRING + BLANK_SPACE;
	// Regular expression  for  non digit character
	public static final String NON_DIGIT_REGEX = "\\D";
	// String constant for tab
	public static final String TAB_STRING = "\t"; 
	// String constant for hash #
	public static final String HASH_STRING = "#";	 	
	// String constant for empty string
	public static final String SLASH_STRING = "/";	
	// String constant for + string
	public static final String PLUS_STRING = "+";	
	// Regex for plus string
	public static final String PLUS_STRING_REG = "\\"+PLUS_STRING;
	// Regex for plus string
	public static final String NEW_LINE_REGEX = "\n";
	// String constant for underscore
	public static final String UNDERSCORE_STRING = "_"; 
  
}

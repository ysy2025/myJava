// Generated from java-escape by ANTLR 4.11.1

package customparser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CustomParserParser}.
 */
public interface CustomParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CustomParserParser#testParser}.
	 * @param ctx the parse tree
	 */
	void enterTestParser(CustomParserParser.TestParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomParserParser#testParser}.
	 * @param ctx the parse tree
	 */
	void exitTestParser(CustomParserParser.TestParserContext ctx);
}
// Generated from SVGParser.g4 by ANTLR 4.7.1

package main.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SVGParser}.
 */
public interface SVGParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(SVGParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(SVGParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(SVGParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(SVGParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(SVGParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(SVGParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(SVGParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(SVGParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(SVGParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(SVGParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeName(SVGParser.HtmlAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeName(SVGParser.HtmlAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeValue(SVGParser.HtmlAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeValue(SVGParser.HtmlAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(SVGParser.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(SVGParser.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(SVGParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(SVGParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(SVGParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(SVGParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(SVGParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(SVGParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#xhtmlCDATA}.
	 * @param ctx the parse tree
	 */
	void enterXhtmlCDATA(SVGParser.XhtmlCDATAContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#xhtmlCDATA}.
	 * @param ctx the parse tree
	 */
	void exitXhtmlCDATA(SVGParser.XhtmlCDATAContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#dtd}.
	 * @param ctx the parse tree
	 */
	void enterDtd(SVGParser.DtdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#dtd}.
	 * @param ctx the parse tree
	 */
	void exitDtd(SVGParser.DtdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#xml}.
	 * @param ctx the parse tree
	 */
	void enterXml(SVGParser.XmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#xml}.
	 * @param ctx the parse tree
	 */
	void exitXml(SVGParser.XmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#scriptlet}.
	 * @param ctx the parse tree
	 */
	void enterScriptlet(SVGParser.ScriptletContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#scriptlet}.
	 * @param ctx the parse tree
	 */
	void exitScriptlet(SVGParser.ScriptletContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(SVGParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(SVGParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(SVGParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(SVGParser.StyleContext ctx);
}
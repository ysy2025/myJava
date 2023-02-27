//package parserimplement;
//
//import customparser.CustomParserListener;
//import customparser.CustomParserParser;
//import org.antlr.v4.runtime.ParserRuleContext;
//import org.antlr.v4.runtime.tree.ErrorNode;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//public class MyCustomParserListener implements CustomParserListener {
//
//    public void enterTestParser(CustomParserParser.TestParserContext ctx) {
//
//    }
//
////    @Override
//    public void exitTestParser(CustomParserParser.TestParserContext ctx) {
//        final String a = ctx.getChild(0).getText().toUpperCase();
//        final String b = ctx.getChild(1).getText().toUpperCase();
//        System.out.println(a + " " + b);
////        super.exitTestParser(ctx);
//    }
//
//    public void visitTerminal(TerminalNode terminalNode) {
//
//    }
//
//    public void visitErrorNode(ErrorNode errorNode) {
//
//    }
//
//    public void enterEveryRule(ParserRuleContext parserRuleContext) {
//
//    }
//
//    public void exitEveryRule(ParserRuleContext parserRuleContext) {
//
//    }
//}

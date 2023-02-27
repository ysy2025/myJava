//package parserimplement;
//
//import customparser.CustomParserLexer;
//import customparser.CustomParserParser;
//import org.antlr.v4.runtime.ANTLRInputStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//
//public class TestAntlr4 {
//    public static void main(String[] args) {
//        // test mycustomname
//        ANTLRInputStream inputStream = new ANTLRInputStream("hhh mycustomname");
//
//        // 构建词法分析器
//        CustomParserLexer lexer = new CustomParserLexer(inputStream);
//
//        // 构建词法符号的缓冲区,用于存储词法分析器的词法符号
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//
//        // 构建语法分析器,处理词法符号缓冲区内容
//        CustomParserParser parser = new CustomParserParser(tokenStream);
//
//        // 针对规则开始语法分析
//        CustomParserParser.TestParserContext context = parser.testParser();
//
//        // 构建监听器
//        MyCustomParserListener listener = new MyCustomParserListener();
//
//        // 使用监听器初始化对语法分析树的遍历
//        ParseTreeWalker.DEFAULT.walk(listener, context);
//    }
//}

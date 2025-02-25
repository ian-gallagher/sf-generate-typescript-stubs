package apextsstubgenerator.parsing;

import apextsstubgenerator.antlrapex.apexLexer;
import apextsstubgenerator.antlrapex.apexParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class ParseUtils {
    public static ParseTree getTree(String filePath) throws IOException {
        // Read the Apex code from a file or string
        CharStream input = CharStreams.fromFileName(filePath);

        // Create the lexer and parser
        apexLexer lexer = new apexLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        apexParser parser = new apexParser(tokens);

        // Parse the input and get the AST
        return parser.compilationUnit();
    }

    public static WalkerAndCompilationUnit getWalker(
            String filePath
        ) throws IOException {
        // Read the Apex code from a file or string
        CharStream input = CharStreams.fromFileName(filePath);

        // Create the lexer and parser
        apexLexer lexer = new apexLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        apexParser parser = new apexParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

        WalkerAndCompilationUnit walkerAndCompilationUnit = new WalkerAndCompilationUnit();
        walkerAndCompilationUnit.compilationUnitContext = parser.compilationUnit();
        walkerAndCompilationUnit.parseTreeWalker = walker;
        return walkerAndCompilationUnit;
    }
}

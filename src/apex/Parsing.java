package apex;

import antlrapex.apexLexer;
import antlrapex.apexParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Parsing {
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
}

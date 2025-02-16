import conversion.ApexToTypeScriptConverter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlrapex.apexLexer;
import antlrapex.apexParser;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        // Read the Apex code from a file or string
        CharStream input = CharStreams.fromFileName("input-code/ApexFile.cls");

        // Create the lexer and parser
        apexLexer lexer = new apexLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        apexParser parser = new apexParser(tokens);

        // Parse the input and get the AST
        ParseTree tree = parser.compilationUnit();

        // Traverse the AST using a listener or visitor
        ParseTreeWalker walker = new ParseTreeWalker();
        ApexToTypeScriptConverter converter = new ApexToTypeScriptConverter();
        walker.walk(converter, tree);
        FileWriter writer = new FileWriter("output/output.ts");
        writer.write(converter.getTypeScriptCode()); // Assuming you have a method to get the generated code
        writer.close();
    }
}

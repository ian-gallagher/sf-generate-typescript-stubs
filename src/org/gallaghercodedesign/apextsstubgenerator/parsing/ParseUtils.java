package org.gallaghercodedesign.apextsstubgenerator.parsing;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexLexer;
import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser;
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

        WalkerAndCompilationUnit walkerAndCompliationUnit = new WalkerAndCompilationUnit();
        walkerAndCompliationUnit.compilationUnitContext = parser.compilationUnit();
        walkerAndCompliationUnit.parseTreeWalker = walker;
        return walkerAndCompliationUnit;
    }
}

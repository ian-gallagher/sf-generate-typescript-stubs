
## Requisites
- Install Java JDK if not already installed
- Download ANTLR4 jar file I.E. `wget https://www.antlr.org/download/antlr-4.13.2-complete.jar`
- Move downloaded jar file to `/usr/local/lib/`
  - `sudo mv antlr-4.13.2-complete.jar /usr/local/lib/`
- If you need a different lexer/parser check here https://github.com/antlr/grammars-v4/tree/master/
and download corresponding .g4 file and store in `<project root>/parser-files/` folder
- add antlr-4.x-complete.jar as a dependency under Project Modules

## Setup
Example "java -jar antlr-4.13.2-complete.jar ./parser-files/apex.g4" or if you setup an
alias for antlr4
- Run command `antlr4 apex.g4 -o src/antlrapex -package antlrapex` or
- `java -jar antlr-4.13.2-complete.jar -o src/antlrapex -package antlrapex`

#### This should generate lexer/parser files necessary for antlr4 to use for parsing


## Requisites
- Java JDK if not already installed
- ANTLR4 jar file I.E. https://www.antlr.org/download/antlr-4.13.2-complete.jar
- If you need to update the apex grammar check here https://github.com/antlr/grammars-v4/tree/master/apex
and download corresponding .g4 file and store in `<project root>/parser-files/` folder
- In some IDEs add antlr-4.x-complete.jar as a dependency under Project Modules

## Setup
- run `npm install`

#### This should generate lexer/parser files necessary for antlr4 to use for parsing

# Apex to TypeScript Stub Generator
## About this Project
This project is a tool to generate TypeScript stubs from Apex code. The tool uses antlr4 to parse the Apex code and generate TypeScript stubs. The generated TypeScript stubs can be used to create TypeScript classes that can be used to interact with Salesforce APIs.

## Requisites
- Java JDK
- Verify `scripts/config.cfg` settings antlr4 jar file path is correct
- Update settings.properties file accordingly to point to apex source/input folder for apex code

## Setup
- run `npm install` (this will download and install antlr4 and build lexer/parser files)

#### This should generate lexer/parser files necessary for antlr4 to use for parsing

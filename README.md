# Apex to TypeScript Stub Generator
## About this Project
This project is a tool to generate TypeScript stubs from Apex code. The tool uses antlr4 to parse
the Apex code and generate TypeScript stubs. The generated TypeScript stubs can be used to create
TypeScript classes that can be used to interact with Salesforce APIs.

## Download Pre-built JAR
You can download the pre-built JAR from [releases] (https://github.com/ian-gallagher/sf-generate-typescript-stubs/releases/)

## Usage

To convert Apex classes to TypeScript, use the following command:

```bash
java -jar apex-to-typescript-converter-<version>.jar (-d "<input-directory>" | -f "<input-file>") -o "<output-directory>"
```

### Explanation:
1. **`<version>`**: replace this with the current JAR file version.
2. **`(-d "<input-directory>" | -f "<input-file>")`** `-d` or `-f` can be used, but not both.
3. **`-d <input-directory>`**: this with the path to the directory containing the Apex classes.
4. **`-f <input-file>`**: this with the path to the directory containing the Apex classes.
5. **`-o <output-directory>`**: **required** this with the folder path where the generated TypeScript
stubs will be output to

## How to use
- Clone the repository
- Run `npm install` to install antlr4 and build lexer/parser files
- Use Maven to build the project and run

## Requisites
- Java JDK

## Setup
- run `npm install` (this will download and install antlr4 and build lexer/parser files)

#### This should generate lexer/parser files necessary for antlr4 to use for parsing

// Generated from apex.g4 by ANTLR 4.13.2
package apextsstubgenerator.antlrapex;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class apexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SoqlLiteral=2, OVERRIDE=3, VIRTUAL=4, SET=5, GET=6, ABSTRACT=7, 
		BREAK=8, BYTE=9, CATCH=10, CHAR=11, CLASS=12, CONST=13, CONTINUE=14, DEFAULT=15, 
		DO=16, ELSE=17, ENUM=18, EXTENDS=19, FINAL=20, FINALLY=21, FLOAT=22, FOR=23, 
		IF=24, GOTO=25, IMPLEMENTS=26, IMPORT=27, INSTANCEOF=28, INT=29, INTERFACE=30, 
		NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, RETURN=37, 
		SHORT=38, STATIC=39, SUPER=40, SYNCHRONIZED=41, THIS=42, THROW=43, THROWS=44, 
		TRANSIENT=45, TRY=46, VOID=47, VOLATILE=48, WHILE=49, GLOBAL=50, WEBSERVICE=51, 
		APEX_INHERITED_SHARING=52, APEX_WITH_SHARING=53, APEX_WITHOUT_SHARING=54, 
		SELECT=55, DB_INSERT=56, DB_UPSERT=57, DB_UPDATE=58, DB_DELETE=59, DB_UNDELETE=60, 
		TESTMETHOD=61, RUNAS=62, IntegerLiteral=63, FloatingPointLiteral=64, BooleanLiteral=65, 
		CharacterLiteral=66, StringLiteral=67, NullLiteral=68, LPAREN=69, RPAREN=70, 
		LBRACE=71, RBRACE=72, LBRACK=73, RBRACK=74, SEMI=75, COMMA=76, DOT=77, 
		ASSIGN=78, GT=79, LT=80, BANG=81, TILDE=82, QUESTION=83, COLON=84, EQUAL=85, 
		LE=86, GE=87, NOTEQUAL=88, AND=89, OR=90, INC=91, DEC=92, ADD=93, SUB=94, 
		MUL=95, DIV=96, BITAND=97, BITOR=98, CARET=99, MOD=100, ADD_ASSIGN=101, 
		SUB_ASSIGN=102, MUL_ASSIGN=103, DIV_ASSIGN=104, AND_ASSIGN=105, OR_ASSIGN=106, 
		XOR_ASSIGN=107, MOD_ASSIGN=108, LSHIFT_ASSIGN=109, RSHIFT_ASSIGN=110, 
		URSHIFT_ASSIGN=111, LAMBDA_LIKE=112, Identifier=113, AT=114, ELLIPSIS=115, 
		WS=116, APEXDOC_COMMENT=117, APEXDOC_COMMENT_START=118, COMMENT=119, COMMENT_START=120, 
		LINE_COMMENT=121, QUOTE=122;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_propertyDeclaration = 26, 
		RULE_propertyBodyDeclaration = 27, RULE_interfaceBodyDeclaration = 28, 
		RULE_interfaceMemberDeclaration = 29, RULE_constDeclaration = 30, RULE_constantDeclarator = 31, 
		RULE_interfaceMethodDeclaration = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36, 
		RULE_variableInitializer = 37, RULE_arrayInitializer = 38, RULE_enumConstantName = 39, 
		RULE_type_ = 40, RULE_classOrInterfaceType = 41, RULE_primitiveType = 42, 
		RULE_typeArguments = 43, RULE_typeArgument = 44, RULE_qualifiedNameList = 45, 
		RULE_formalParameters = 46, RULE_formalParameterList = 47, RULE_formalParameter = 48, 
		RULE_lastFormalParameter = 49, RULE_methodBody = 50, RULE_constructorBody = 51, 
		RULE_qualifiedName = 52, RULE_literal = 53, RULE_annotation = 54, RULE_annotationName = 55, 
		RULE_elementValuePairs = 56, RULE_elementValuePair = 57, RULE_elementValue = 58, 
		RULE_elementValueArrayInitializer = 59, RULE_annotationTypeDeclaration = 60, 
		RULE_annotationTypeBody = 61, RULE_annotationTypeElementDeclaration = 62, 
		RULE_annotationTypeElementRest = 63, RULE_annotationMethodOrConstantRest = 64, 
		RULE_annotationMethodRest = 65, RULE_annotationConstantRest = 66, RULE_defaultValue = 67, 
		RULE_block = 68, RULE_blockStatement = 69, RULE_localVariableDeclarationStatement = 70, 
		RULE_localVariableDeclaration = 71, RULE_statement = 72, RULE_propertyBlock = 73, 
		RULE_getter = 74, RULE_setter = 75, RULE_catchClause = 76, RULE_catchType = 77, 
		RULE_finallyBlock = 78, RULE_resourceSpecification = 79, RULE_resources = 80, 
		RULE_resource = 81, RULE_forControl = 82, RULE_forInit = 83, RULE_enhancedForControl = 84, 
		RULE_forUpdate = 85, RULE_parExpression = 86, RULE_expressionList = 87, 
		RULE_statementExpression = 88, RULE_constantExpression = 89, RULE_apexDbUpsertExpression = 90, 
		RULE_apexDbExpression = 91, RULE_expression = 92, RULE_primary = 93, RULE_creator = 94, 
		RULE_createdName = 95, RULE_innerCreator = 96, RULE_arrayCreatorRest = 97, 
		RULE_mapCreatorRest = 98, RULE_setCreatorRest = 99, RULE_classCreatorRest = 100, 
		RULE_explicitGenericInvocation = 101, RULE_nonWildcardTypeArguments = 102, 
		RULE_typeArgumentsOrDiamond = 103, RULE_nonWildcardTypeArgumentsOrDiamond = 104, 
		RULE_superSuffix = 105, RULE_explicitGenericInvocationSuffix = 106, RULE_arguments = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
			"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
			"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
			"genericConstructorDeclaration", "fieldDeclaration", "propertyDeclaration", 
			"propertyBodyDeclaration", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
			"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
			"genericInterfaceMethodDeclaration", "variableDeclarators", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "enumConstantName", 
			"type_", "classOrInterfaceType", "primitiveType", "typeArguments", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
			"lastFormalParameter", "methodBody", "constructorBody", "qualifiedName", 
			"literal", "annotation", "annotationName", "elementValuePairs", "elementValuePair", 
			"elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
			"localVariableDeclaration", "statement", "propertyBlock", "getter", "setter", 
			"catchClause", "catchType", "finallyBlock", "resourceSpecification", 
			"resources", "resource", "forControl", "forInit", "enhancedForControl", 
			"forUpdate", "parExpression", "expressionList", "statementExpression", 
			"constantExpression", "apexDbUpsertExpression", "apexDbExpression", "expression", 
			"primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
			"mapCreatorRest", "setCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"nonWildcardTypeArguments", "typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", 
			"superSuffix", "explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<>'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", "'=>'", null, "'@'", "'...'", null, null, "'/**'", 
			null, "'/*'", null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SoqlLiteral", "OVERRIDE", "VIRTUAL", "SET", "GET", "ABSTRACT", 
			"BREAK", "BYTE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", 
			"DO", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", 
			"IF", "GOTO", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", 
			"NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
			"SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
			"TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "GLOBAL", "WEBSERVICE", 
			"APEX_INHERITED_SHARING", "APEX_WITH_SHARING", "APEX_WITHOUT_SHARING", 
			"SELECT", "DB_INSERT", "DB_UPSERT", "DB_UPDATE", "DB_DELETE", "DB_UNDELETE", 
			"TESTMETHOD", "RUNAS", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
			"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
			"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "LAMBDA_LIKE", "Identifier", "AT", 
			"ELLIPSIS", "WS", "APEXDOC_COMMENT", "APEXDOC_COMMENT_START", "COMMENT", 
			"COMMENT_START", "LINE_COMMENT", "QUOTE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "apex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public apexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(apexParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(216);
				packageDeclaration();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(219);
				importDeclaration();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340746577415770264L) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(225);
				typeDeclaration();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(apexParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(233);
				annotation();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(PACKAGE);
			setState(240);
			qualifiedName();
			setState(241);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(apexParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(apexParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(apexParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IMPORT);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(244);
				match(STATIC);
				}
			}

			setState(247);
			qualifiedName();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(248);
				match(DOT);
				setState(249);
				match(MUL);
				}
			}

			setState(252);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340746576341762200L) != 0) || _la==AT) {
					{
					{
					setState(254);
					classOrInterfaceModifier();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340746576341762200L) != 0) || _la==AT) {
					{
					{
					setState(261);
					classOrInterfaceModifier();
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(267);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340746576341762200L) != 0) || _la==AT) {
					{
					{
					setState(268);
					classOrInterfaceModifier();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(281);
				annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(apexParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(apexParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(apexParser.TRANSIENT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case VIRTUAL:
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case GLOBAL:
			case WEBSERVICE:
			case APEX_INHERITED_SHARING:
			case APEX_WITH_SHARING:
			case APEX_WITHOUT_SHARING:
			case TESTMETHOD:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(288);
				match(TRANSIENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(apexParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(apexParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(apexParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(apexParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(apexParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(apexParser.FINAL, 0); }
		public TerminalNode GLOBAL() { return getToken(apexParser.GLOBAL, 0); }
		public TerminalNode WEBSERVICE() { return getToken(apexParser.WEBSERVICE, 0); }
		public TerminalNode OVERRIDE() { return getToken(apexParser.OVERRIDE, 0); }
		public TerminalNode VIRTUAL() { return getToken(apexParser.VIRTUAL, 0); }
		public TerminalNode TESTMETHOD() { return getToken(apexParser.TESTMETHOD, 0); }
		public TerminalNode APEX_INHERITED_SHARING() { return getToken(apexParser.APEX_INHERITED_SHARING, 0); }
		public TerminalNode APEX_WITH_SHARING() { return getToken(apexParser.APEX_WITH_SHARING, 0); }
		public TerminalNode APEX_WITHOUT_SHARING() { return getToken(apexParser.APEX_WITHOUT_SHARING, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				match(FINAL);
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
				match(GLOBAL);
				}
				break;
			case WEBSERVICE:
				enterOuterAlt(_localctx, 9);
				{
				setState(299);
				match(WEBSERVICE);
				}
				break;
			case OVERRIDE:
				enterOuterAlt(_localctx, 10);
				{
				setState(300);
				match(OVERRIDE);
				}
				break;
			case VIRTUAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(301);
				match(VIRTUAL);
				}
				break;
			case TESTMETHOD:
				enterOuterAlt(_localctx, 12);
				{
				setState(302);
				match(TESTMETHOD);
				}
				break;
			case APEX_INHERITED_SHARING:
				enterOuterAlt(_localctx, 13);
				{
				setState(303);
				match(APEX_INHERITED_SHARING);
				}
				break;
			case APEX_WITH_SHARING:
				enterOuterAlt(_localctx, 14);
				{
				setState(304);
				match(APEX_WITH_SHARING);
				}
				break;
			case APEX_WITHOUT_SHARING:
				enterOuterAlt(_localctx, 15);
				{
				setState(305);
				match(APEX_WITHOUT_SHARING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(apexParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(apexParser.CLASS, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode GET() { return getToken(apexParser.GET, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(apexParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(CLASS);
			setState(313);
			_la = _input.LA(1);
			if ( !(_la==GET || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(314);
				typeParameters();
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(317);
				match(EXTENDS);
				setState(318);
				type_();
				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(321);
				match(IMPLEMENTS);
				setState(322);
				typeList();
				}
			}

			setState(325);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(LT);
			setState(328);
			typeParameter();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				typeParameter();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(Identifier);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(339);
				match(EXTENDS);
				setState(340);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(apexParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(apexParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			type_();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(344);
				match(BITAND);
				setState(345);
				type_();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(apexParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(apexParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(apexParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ENUM);
			setState(352);
			match(Identifier);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(353);
				match(IMPLEMENTS);
				setState(354);
				typeList();
				}
			}

			setState(357);
			match(LBRACE);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(358);
				enumConstants();
				}
			}

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(361);
				match(COMMA);
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(364);
				enumBodyDeclarations();
				}
			}

			setState(367);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			enumConstant();
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					match(COMMA);
					setState(371);
					enumConstant();
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(377);
				annotation();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(Identifier);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(384);
				arguments();
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(387);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(SEMI);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340924975865928376L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 13194139533841L) != 0)) {
				{
				{
				setState(391);
				classBodyDeclaration();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(apexParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(INTERFACE);
			setState(398);
			match(Identifier);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(399);
				typeParameters();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(402);
				match(EXTENDS);
				setState(403);
				typeList();
				}
			}

			setState(406);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeListContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			type_();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409);
				match(COMMA);
				setState(410);
				type_();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LBRACE);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340924975865928376L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 13194139533841L) != 0)) {
				{
				{
				setState(417);
				classBodyDeclaration();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(LBRACE);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340924975865928376L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 824633720865L) != 0)) {
				{
				{
				setState(426);
				interfaceBodyDeclaration();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(apexParser.STATIC, 0); }
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						annotation();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(441);
						modifier();
						}
						} 
					}
					setState(446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(447);
				memberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(448);
					match(STATIC);
					}
				}

				setState(451);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(459);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(461);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(462);
				enumDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(463);
				propertyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode GET() { return getToken(apexParser.GET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(apexParser.VOID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TerminalNode OVERRIDE() { return getToken(apexParser.OVERRIDE, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(apexParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(466);
				match(OVERRIDE);
				}
			}

			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				{
				setState(469);
				type_();
				}
				break;
			case VOID:
				{
				setState(470);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(473);
			_la = _input.LA(1);
			if ( !(_la==GET || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(474);
			formalParameters();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(475);
				match(LBRACK);
				setState(476);
				match(RBRACK);
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(482);
				match(THROWS);
				setState(483);
				qualifiedNameList();
				}
			}

			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(486);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(487);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			typeParameters();
			setState(491);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(apexParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(Identifier);
			setState(494);
			formalParameters();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(495);
				match(THROWS);
				setState(496);
				qualifiedNameList();
				}
			}

			setState(499);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			typeParameters();
			setState(502);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			type_();
			setState(505);
			variableDeclarators();
			setState(506);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public PropertyBodyDeclarationContext propertyBodyDeclaration() {
			return getRuleContext(PropertyBodyDeclarationContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPropertyDeclaration(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_propertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			type_();
			setState(509);
			variableDeclarators();
			setState(510);
			propertyBodyDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public List<PropertyBlockContext> propertyBlock() {
			return getRuleContexts(PropertyBlockContext.class);
		}
		public PropertyBlockContext propertyBlock(int i) {
			return getRuleContext(PropertyBlockContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public PropertyBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPropertyBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPropertyBodyDeclaration(this);
		}
	}

	public final PropertyBodyDeclarationContext propertyBodyDeclaration() throws RecognitionException {
		PropertyBodyDeclarationContext _localctx = new PropertyBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_propertyBodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(LBRACE);
			setState(513);
			propertyBlock();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340783961884590328L) != 0) || _la==AT) {
				{
				setState(514);
				propertyBlock();
				}
			}

			setState(517);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case VIRTUAL:
			case SET:
			case ABSTRACT:
			case BYTE:
			case CHAR:
			case CLASS:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case GLOBAL:
			case WEBSERVICE:
			case APEX_INHERITED_SHARING:
			case APEX_WITH_SHARING:
			case APEX_WITHOUT_SHARING:
			case TESTMETHOD:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(519);
						modifier();
						}
						} 
					}
					setState(524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(525);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMemberDeclaration);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(532);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(535);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			type_();
			setState(539);
			constantDeclarator();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(540);
				match(COMMA);
				setState(541);
				constantDeclarator();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(Identifier);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(550);
				match(LBRACK);
				setState(551);
				match(RBRACK);
				}
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(557);
			match(ASSIGN);
			setState(558);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(apexParser.VOID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(apexParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				{
				setState(560);
				type_();
				}
				break;
			case VOID:
				{
				setState(561);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(564);
			match(Identifier);
			setState(565);
			formalParameters();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(566);
				match(LBRACK);
				setState(567);
				match(RBRACK);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(573);
				match(THROWS);
				setState(574);
				qualifiedNameList();
				}
			}

			setState(577);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			typeParameters();
			setState(580);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			variableDeclarator();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(583);
				match(COMMA);
				setState(584);
				variableDeclarator();
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			variableDeclaratorId();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(591);
				match(ASSIGN);
				setState(592);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(Identifier);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(596);
				match(LBRACK);
				setState(597);
				match(RBRACK);
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableInitializer);
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				arrayInitializer();
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(LBRACE);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146175L) != 0)) {
				{
				setState(608);
				variableInitializer();
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(609);
						match(COMMA);
						setState(610);
						variableInitializer();
						}
						} 
					}
					setState(615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(616);
					match(COMMA);
					}
				}

				}
			}

			setState(621);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_Context extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_type_);
		try {
			int _alt;
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				classOrInterfaceType();
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(626);
						match(LBRACK);
						setState(627);
						match(RBRACK);
						}
						} 
					}
					setState(632);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				primitiveType();
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						match(LBRACK);
						setState(635);
						match(RBRACK);
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(apexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(apexParser.DOT, i);
		}
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classOrInterfaceType);
		try {
			int _alt;
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(Identifier);
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(644);
					typeArguments();
					}
					break;
				}
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(647);
						match(DOT);
						setState(648);
						match(Identifier);
						setState(650);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
						case 1:
							{
							setState(649);
							typeArguments();
							}
							break;
						}
						}
						} 
					}
					setState(656);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(SET);
				setState(658);
				typeArguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(apexParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(apexParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(apexParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(apexParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(apexParser.FLOAT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 275418974720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(LT);
			setState(664);
			typeArgument();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(665);
				match(COMMA);
				setState(666);
				typeArgument();
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode QUESTION() { return getToken(apexParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(apexParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeArgument);
		int _la;
		try {
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				type_();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(QUESTION);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(676);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(677);
					type_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			qualifiedName();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(683);
				match(COMMA);
				setState(684);
				qualifiedName();
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(LPAREN);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275420023328L) != 0) || _la==Identifier || _la==AT) {
				{
				setState(691);
				formalParameterList();
				}
			}

			setState(694);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				formalParameter();
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(697);
						match(COMMA);
						setState(698);
						formalParameter();
						}
						} 
					}
					setState(703);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(704);
					match(COMMA);
					setState(705);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(711);
				variableModifier();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			type_();
			setState(718);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(apexParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(720);
				variableModifier();
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			type_();
			setState(727);
			match(ELLIPSIS);
			setState(728);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(apexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(apexParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(Identifier);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(735);
					match(DOT);
					setState(736);
					match(Identifier);
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(apexParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(apexParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(apexParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(apexParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(apexParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(apexParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(apexParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(AT);
			setState(745);
			annotationName();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(746);
				match(LPAREN);
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(747);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(748);
					elementValue();
					}
					break;
				}
				setState(751);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationName(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			elementValuePair();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==Identifier) {
				{
				{
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(757);
					match(COMMA);
					}
				}

				setState(760);
				elementValuePair();
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(Identifier);
			setState(767);
			match(ASSIGN);
			setState(768);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementValue);
		try {
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				expression(0);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(LBRACE);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1688851873988799L) != 0)) {
				{
				setState(776);
				elementValue();
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(777);
						match(COMMA);
						setState(778);
						elementValue();
						}
						} 
					}
					setState(783);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				}
			}

			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(786);
				match(COMMA);
				}
			}

			setState(789);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(apexParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(apexParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(AT);
			setState(792);
			match(INTERFACE);
			setState(793);
			match(Identifier);
			setState(794);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(LBRACE);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340784238377573048L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 824633720833L) != 0)) {
				{
				{
				setState(797);
				annotationTypeElementDeclaration();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case VIRTUAL:
			case SET:
			case ABSTRACT:
			case BYTE:
			case CHAR:
			case CLASS:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case SYNCHRONIZED:
			case TRANSIENT:
			case GLOBAL:
			case WEBSERVICE:
			case APEX_INHERITED_SHARING:
			case APEX_WITH_SHARING:
			case APEX_WITHOUT_SHARING:
			case TESTMETHOD:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(805);
						modifier();
						}
						} 
					}
					setState(810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				setState(811);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_annotationTypeElementRest);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				type_();
				setState(816);
				annotationMethodOrConstantRest();
				setState(817);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				classDeclaration();
				setState(821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(820);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
				interfaceDeclaration();
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(824);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(827);
				enumDeclaration();
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(828);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				annotationTypeDeclaration();
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(832);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotationMethodOrConstantRest);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(Identifier);
			setState(842);
			match(LPAREN);
			setState(843);
			match(RPAREN);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(844);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(apexParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(DEFAULT);
			setState(850);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(LBRACE);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -36365258820592708L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1688851873990847L) != 0)) {
				{
				{
				setState(853);
				blockStatement();
				}
				}
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(859);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_blockStatement);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			localVariableDeclaration();
			setState(867);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(869);
				variableModifier();
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(875);
			type_();
			setState(876);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(apexParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(apexParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(apexParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(apexParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(apexParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public TerminalNode RUNAS() { return getToken(apexParser.RUNAS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TRY() { return getToken(apexParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(apexParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(apexParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(apexParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode CONTINUE() { return getToken(apexParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(apexParser.COLON, 0); }
		public ApexDbExpressionContext apexDbExpression() {
			return getRuleContext(ApexDbExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_statement);
		int _la;
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				match(IF);
				setState(880);
				parExpression();
				setState(881);
				statement();
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(882);
					match(ELSE);
					setState(883);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				match(FOR);
				setState(887);
				match(LPAREN);
				setState(888);
				forControl();
				setState(889);
				match(RPAREN);
				setState(890);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(892);
				match(WHILE);
				setState(893);
				parExpression();
				setState(894);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(896);
				match(DO);
				setState(897);
				statement();
				setState(898);
				match(WHILE);
				setState(899);
				parExpression();
				setState(900);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(902);
				match(RUNAS);
				setState(903);
				match(LPAREN);
				setState(904);
				expression(0);
				setState(905);
				match(RPAREN);
				setState(906);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(908);
				match(TRY);
				setState(909);
				block();
				setState(919);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(911); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(910);
						catchClause();
						}
						}
						setState(913); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(915);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(918);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(921);
				match(TRY);
				setState(922);
				resourceSpecification();
				setState(923);
				block();
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(924);
					catchClause();
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(930);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(933);
				match(RETURN);
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
					{
					setState(934);
					expression(0);
					}
				}

				setState(937);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(938);
				match(THROW);
				setState(939);
				expression(0);
				setState(940);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(942);
				match(BREAK);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(943);
					match(Identifier);
					}
				}

				setState(946);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(947);
				match(CONTINUE);
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(948);
					match(Identifier);
					}
				}

				setState(951);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(952);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(953);
				statementExpression();
				setState(954);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(956);
				match(Identifier);
				setState(957);
				match(COLON);
				setState(958);
				statement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(959);
				apexDbExpression();
				setState(960);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBlockContext extends ParserRuleContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public PropertyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPropertyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPropertyBlock(this);
		}
	}

	public final PropertyBlockContext propertyBlock() throws RecognitionException {
		PropertyBlockContext _localctx = new PropertyBlockContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_propertyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2340783961884590232L) != 0) || _la==AT) {
				{
				{
				setState(964);
				modifier();
				}
				}
				setState(969);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(970);
				getter();
				}
				break;
			case SET:
				{
				setState(971);
				setter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(apexParser.GET, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitGetter(this);
		}
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(GET);
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(975);
				match(SEMI);
				}
				break;
			case LBRACE:
				{
				setState(976);
				methodBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetterContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterSetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitSetter(this);
		}
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(SET);
			setState(982);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(980);
				match(SEMI);
				}
				break;
			case LBRACE:
				{
				setState(981);
				methodBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(apexParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(CATCH);
			setState(985);
			match(LPAREN);
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(986);
				variableModifier();
				}
				}
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(992);
			catchType();
			setState(993);
			match(Identifier);
			setState(994);
			match(RPAREN);
			setState(995);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(apexParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(apexParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			qualifiedName();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(998);
				match(BITOR);
				setState(999);
				qualifiedName();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(apexParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(FINALLY);
			setState(1006);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(apexParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(LPAREN);
			setState(1009);
			resources();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1010);
				match(SEMI);
				}
			}

			setState(1013);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(apexParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(apexParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			resource();
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1016);
					match(SEMI);
					setState(1017);
					resource();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1023);
				variableModifier();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1029);
			classOrInterfaceType();
			setState(1030);
			variableDeclaratorId();
			setState(1031);
			match(ASSIGN);
			setState(1032);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(apexParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(apexParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forControl);
		int _la;
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522093290972L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1688851873988671L) != 0)) {
					{
					setState(1035);
					forInit();
					}
				}

				setState(1038);
				match(SEMI);
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
					{
					setState(1039);
					expression(0);
					}
				}

				setState(1042);
				match(SEMI);
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
					{
					setState(1043);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_forInit);
		try {
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1048);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedForControlContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(apexParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1052);
				variableModifier();
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
			type_();
			setState(1059);
			variableDeclaratorId();
			setState(1060);
			match(COLON);
			setState(1061);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(LPAREN);
			setState(1066);
			expression(0);
			setState(1067);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			expression(0);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1070);
				match(COMMA);
				setState(1071);
				expression(0);
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApexDbUpsertExpressionContext extends ParserRuleContext {
		public TerminalNode DB_UPSERT() { return getToken(apexParser.DB_UPSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ApexDbUpsertExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apexDbUpsertExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterApexDbUpsertExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitApexDbUpsertExpression(this);
		}
	}

	public final ApexDbUpsertExpressionContext apexDbUpsertExpression() throws RecognitionException {
		ApexDbUpsertExpressionContext _localctx = new ApexDbUpsertExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_apexDbUpsertExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(DB_UPSERT);
			setState(1082);
			expression(0);
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
				{
				{
				setState(1083);
				expression(0);
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApexDbExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DB_INSERT() { return getToken(apexParser.DB_INSERT, 0); }
		public TerminalNode DB_UPDATE() { return getToken(apexParser.DB_UPDATE, 0); }
		public TerminalNode DB_DELETE() { return getToken(apexParser.DB_DELETE, 0); }
		public TerminalNode DB_UNDELETE() { return getToken(apexParser.DB_UNDELETE, 0); }
		public ApexDbUpsertExpressionContext apexDbUpsertExpression() {
			return getRuleContext(ApexDbUpsertExpressionContext.class,0);
		}
		public ApexDbExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apexDbExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterApexDbExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitApexDbExpression(this);
		}
	}

	public final ApexDbExpressionContext apexDbExpression() throws RecognitionException {
		ApexDbExpressionContext _localctx = new ApexDbExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_apexDbExpression);
		int _la;
		try {
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DB_INSERT:
			case DB_UPDATE:
			case DB_DELETE:
			case DB_UNDELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2089670227099910144L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1090);
				expression(0);
				}
				break;
			case DB_UPSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				apexDbUpsertExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NEW() { return getToken(apexParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(apexParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(apexParser.SUB, 0); }
		public TerminalNode INC() { return getToken(apexParser.INC, 0); }
		public TerminalNode DEC() { return getToken(apexParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(apexParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(apexParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(apexParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(apexParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(apexParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(apexParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(apexParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(apexParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(apexParser.GT, i);
		}
		public TerminalNode LE() { return getToken(apexParser.LE, 0); }
		public TerminalNode GE() { return getToken(apexParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(apexParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(apexParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(apexParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(apexParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(apexParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(apexParser.AND, 0); }
		public TerminalNode OR() { return getToken(apexParser.OR, 0); }
		public TerminalNode QUESTION() { return getToken(apexParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(apexParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(apexParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(apexParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(apexParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(apexParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(apexParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(apexParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(apexParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(apexParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(apexParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(apexParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(apexParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(apexParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode GET() { return getToken(apexParser.GET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public TerminalNode THIS() { return getToken(apexParser.THIS, 0); }
		public TerminalNode DB_INSERT() { return getToken(apexParser.DB_INSERT, 0); }
		public TerminalNode DB_UPSERT() { return getToken(apexParser.DB_UPSERT, 0); }
		public TerminalNode DB_UPDATE() { return getToken(apexParser.DB_UPDATE, 0); }
		public TerminalNode DB_DELETE() { return getToken(apexParser.DB_DELETE, 0); }
		public TerminalNode DB_UNDELETE() { return getToken(apexParser.DB_UNDELETE, 0); }
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(apexParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(apexParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(apexParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1095);
				primary();
				}
				break;
			case 2:
				{
				setState(1096);
				match(NEW);
				setState(1097);
				creator();
				}
				break;
			case 3:
				{
				setState(1098);
				match(LPAREN);
				setState(1099);
				type_();
				setState(1100);
				match(RPAREN);
				setState(1101);
				expression(17);
				}
				break;
			case 4:
				{
				setState(1103);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1104);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1105);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1106);
				expression(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1213);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1109);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1110);
						_la = _input.LA(1);
						if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 35L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1111);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1112);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1113);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1114);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1115);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1123);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
						case 1:
							{
							setState(1116);
							match(LT);
							setState(1117);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1118);
							match(GT);
							setState(1119);
							match(GT);
							setState(1120);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1121);
							match(GT);
							setState(1122);
							match(GT);
							}
							break;
						}
						setState(1125);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1126);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1127);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 387L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1128);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1129);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1130);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1131);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1132);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1133);
						match(BITAND);
						setState(1134);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1135);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1136);
						match(CARET);
						setState(1137);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1139);
						match(BITOR);
						setState(1140);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1142);
						match(AND);
						setState(1143);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1145);
						match(OR);
						setState(1146);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1148);
						match(QUESTION);
						setState(1149);
						expression(0);
						setState(1150);
						match(COLON);
						setState(1151);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1153);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1154);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 17171480577L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1155);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1156);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1158);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(1157);
							match(QUESTION);
							}
						}

						setState(1160);
						match(DOT);
						setState(1161);
						match(GET);
						setState(1162);
						match(LPAREN);
						setState(1164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
							{
							setState(1163);
							expressionList();
							}
						}

						setState(1166);
						match(RPAREN);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1167);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1168);
						match(DOT);
						setState(1169);
						match(SET);
						setState(1170);
						match(LPAREN);
						setState(1172);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
							{
							setState(1171);
							expressionList();
							}
						}

						setState(1174);
						match(RPAREN);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1177);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==QUESTION) {
							{
							setState(1176);
							match(QUESTION);
							}
						}

						setState(1179);
						match(DOT);
						setState(1180);
						match(Identifier);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1182);
						match(DOT);
						setState(1183);
						match(THIS);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1185);
						match(DOT);
						setState(1186);
						match(NEW);
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1187);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1188);
						match(DOT);
						setState(1189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233785415175766016L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1190);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1191);
						match(DOT);
						setState(1192);
						match(SUPER);
						setState(1193);
						superSuffix();
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1194);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1195);
						match(DOT);
						setState(1196);
						explicitGenericInvocation();
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1197);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1198);
						match(LBRACK);
						setState(1199);
						expression(0);
						setState(1200);
						match(RBRACK);
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1202);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1203);
						match(LPAREN);
						setState(1205);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
							{
							setState(1204);
							expressionList();
							}
						}

						setState(1207);
						match(RPAREN);
						}
						break;
					case 23:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1208);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1209);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 24:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1210);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1211);
						match(INSTANCEOF);
						setState(1212);
						type_();
						}
						break;
					}
					} 
				}
				setState(1217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(apexParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(apexParser.CLASS, 0); }
		public TerminalNode VOID() { return getToken(apexParser.VOID, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SoqlLiteral() { return getToken(apexParser.SoqlLiteral, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_primary);
		try {
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				match(LPAREN);
				setState(1219);
				expression(0);
				setState(1220);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1223);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1224);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1225);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1226);
				type_();
				setState(1227);
				match(DOT);
				setState(1228);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1230);
				match(VOID);
				setState(1231);
				match(DOT);
				setState(1232);
				match(CLASS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1233);
				nonWildcardTypeArguments();
				setState(1237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1234);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1235);
					match(THIS);
					setState(1236);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1239);
				match(SoqlLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public MapCreatorRestContext mapCreatorRest() {
			return getRuleContext(MapCreatorRestContext.class,0);
		}
		public SetCreatorRestContext setCreatorRest() {
			return getRuleContext(SetCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_creator);
		try {
			setState(1253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				nonWildcardTypeArguments();
				setState(1243);
				createdName();
				setState(1244);
				classCreatorRest();
				}
				break;
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				createdName();
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1247);
					arrayCreatorRest();
					}
					break;
				case 2:
					{
					setState(1248);
					classCreatorRest();
					}
					break;
				case 3:
					{
					setState(1249);
					mapCreatorRest();
					}
					break;
				case 4:
					{
					setState(1250);
					setCreatorRest();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(apexParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(apexParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(apexParser.SET, 0); }
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_createdName);
		int _la;
		try {
			setState(1272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1255);
				match(Identifier);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1256);
					typeArgumentsOrDiamond();
					}
				}

				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1259);
					match(DOT);
					setState(1260);
					match(Identifier);
					setState(1262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1261);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				primitiveType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(1270);
				match(SET);
				setState(1271);
				typeArgumentsOrDiamond();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(Identifier);
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1275);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1278);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(apexParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(apexParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(apexParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(apexParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(LBRACK);
			setState(1308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1281);
				match(RBRACK);
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1282);
					match(LBRACK);
					setState(1283);
					match(RBRACK);
					}
					}
					setState(1288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1289);
				arrayInitializer();
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1290);
				expression(0);
				setState(1291);
				match(RBRACK);
				setState(1298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1292);
						match(LBRACK);
						setState(1293);
						expression(0);
						setState(1294);
						match(RBRACK);
						}
						} 
					}
					setState(1300);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				}
				setState(1305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1301);
						match(LBRACK);
						setState(1302);
						match(RBRACK);
						}
						} 
					}
					setState(1307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<TerminalNode> LAMBDA_LIKE() { return getTokens(apexParser.LAMBDA_LIKE); }
		public TerminalNode LAMBDA_LIKE(int i) {
			return getToken(apexParser.LAMBDA_LIKE, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(apexParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(apexParser.Identifier, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public MapCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterMapCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitMapCreatorRest(this);
		}
	}

	public final MapCreatorRestContext mapCreatorRest() throws RecognitionException {
		MapCreatorRestContext _localctx = new MapCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_mapCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			match(LBRACE);
			setState(1338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				{
				setState(1311);
				match(RBRACE);
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1312);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1313);
					expression(0);
					}
					break;
				}
				setState(1316);
				match(LAMBDA_LIKE);
				setState(1319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1317);
					literal();
					}
					break;
				case 2:
					{
					setState(1318);
					expression(0);
					}
					break;
				}
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1321);
					match(COMMA);
					setState(1324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						setState(1322);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(1323);
						expression(0);
						}
						break;
					}
					setState(1326);
					match(LAMBDA_LIKE);
					setState(1329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1327);
						literal();
						}
						break;
					case 2:
						{
						setState(1328);
						expression(0);
						}
						break;
					}
					}
					}
					setState(1335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1336);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetCreatorRestContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(apexParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(apexParser.RBRACE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(apexParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(apexParser.COMMA, i);
		}
		public SetCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterSetCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitSetCreatorRest(this);
		}
	}

	public final SetCreatorRestContext setCreatorRest() throws RecognitionException {
		SetCreatorRestContext _localctx = new SetCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_setCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(LBRACE);
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACE:
				{
				setState(1341);
				match(RBRACE);
				}
				break;
			case SoqlLiteral:
			case SET:
			case BYTE:
			case CHAR:
			case FLOAT:
			case INT:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1342);
					literal();
					}
					break;
				case 2:
					{
					setState(1343);
					expression(0);
					}
					break;
				}
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1346);
					match(COMMA);
					setState(1349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1347);
						literal();
						}
						break;
					case 2:
						{
						setState(1348);
						expression(0);
						}
						break;
					}
					}
					}
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1356);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			arguments();
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1361);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			nonWildcardTypeArguments();
			setState(1365);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(LT);
			setState(1368);
			typeList();
			setState(1369);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typeArgumentsOrDiamond);
		try {
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				match(LT);
				setState(1372);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(apexParser.LT, 0); }
		public TerminalNode GT() { return getToken(apexParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				match(LT);
				setState(1377);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1378);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(apexParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_superSuffix);
		try {
			setState(1387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				match(DOT);
				setState(1383);
				match(Identifier);
				setState(1385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1384);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(apexParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(apexParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1389);
				match(SUPER);
				setState(1390);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				match(Identifier);
				setState(1392);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(apexParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(apexParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof apexListener ) ((apexListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(LPAREN);
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223225522094339548L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 562951967146047L) != 0)) {
				{
				setState(1396);
				expressionList();
				}
			}

			setState(1399);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 92:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 28);
		case 13:
			return precpred(_ctx, 27);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 25);
		case 16:
			return precpred(_ctx, 24);
		case 17:
			return precpred(_ctx, 23);
		case 18:
			return precpred(_ctx, 22);
		case 19:
			return precpred(_ctx, 21);
		case 20:
			return precpred(_ctx, 20);
		case 21:
			return precpred(_ctx, 19);
		case 22:
			return precpred(_ctx, 16);
		case 23:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001z\u057a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0001\u0000\u0003\u0000\u00da\b\u0000"+
		"\u0001\u0000\u0005\u0000\u00dd\b\u0000\n\u0000\f\u0000\u00e0\t\u0000\u0001"+
		"\u0000\u0005\u0000\u00e3\b\u0000\n\u0000\f\u0000\u00e6\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001\u00eb\b\u0001\n\u0001\f\u0001\u00ee"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00f6\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00fb\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003\u0100"+
		"\b\u0003\n\u0003\f\u0003\u0103\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u0107\b\u0003\n\u0003\f\u0003\u010a\t\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u010e\b\u0003\n\u0003\f\u0003\u0111\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0115\b\u0003\n\u0003\f\u0003\u0118\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u011c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0122\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0133\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0137\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u013c\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0140\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0144\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u014c\b\b\n\b\f\b\u014f\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0156\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u015b\b\n\n\n\f\n"+
		"\u015e\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0164\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0168\b\u000b\u0001"+
		"\u000b\u0003\u000b\u016b\b\u000b\u0001\u000b\u0003\u000b\u016e\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0175\b\f\n\f"+
		"\f\f\u0178\t\f\u0001\r\u0005\r\u017b\b\r\n\r\f\r\u017e\t\r\u0001\r\u0001"+
		"\r\u0003\r\u0182\b\r\u0001\r\u0003\r\u0185\b\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0189\b\u000e\n\u000e\f\u000e\u018c\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0191\b\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0195\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u019c\b\u0010\n\u0010\f\u0010\u019f\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u01a3\b\u0011\n\u0011\f\u0011\u01a6\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u01ac\b\u0012\n"+
		"\u0012\f\u0012\u01af\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u01b5\b\u0013\n\u0013\f\u0013\u01b8\t\u0013\u0001\u0013"+
		"\u0005\u0013\u01bb\b\u0013\n\u0013\f\u0013\u01be\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01c2\b\u0013\u0001\u0013\u0003\u0013\u01c5\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01d1\b\u0014"+
		"\u0001\u0015\u0003\u0015\u01d4\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01d8\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u01de\b\u0015\n\u0015\f\u0015\u01e1\t\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01e5\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e9\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01f2\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0204\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0005\u001c\u0209\b\u001c\n\u001c\f\u001c\u020c\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0210\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0219\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u021f\b\u001e\n"+
		"\u001e\f\u001e\u0222\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0229\b\u001f\n\u001f\f\u001f\u022c\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0233\b \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u0239\b \n \f \u023c\t \u0001 \u0001 \u0003"+
		" \u0240\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u024a\b\"\n\"\f\"\u024d\t\"\u0001#\u0001#\u0001#\u0003#\u0252"+
		"\b#\u0001$\u0001$\u0001$\u0005$\u0257\b$\n$\f$\u025a\t$\u0001%\u0001%"+
		"\u0003%\u025e\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u0264\b&\n&\f&\u0267"+
		"\t&\u0001&\u0003&\u026a\b&\u0003&\u026c\b&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0005(\u0275\b(\n(\f(\u0278\t(\u0001(\u0001(\u0001"+
		"(\u0005(\u027d\b(\n(\f(\u0280\t(\u0003(\u0282\b(\u0001)\u0001)\u0003)"+
		"\u0286\b)\u0001)\u0001)\u0001)\u0003)\u028b\b)\u0005)\u028d\b)\n)\f)\u0290"+
		"\t)\u0001)\u0001)\u0003)\u0294\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u029c\b+\n+\f+\u029f\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u02a7\b,\u0003,\u02a9\b,\u0001-\u0001-\u0001-\u0005-\u02ae\b"+
		"-\n-\f-\u02b1\t-\u0001.\u0001.\u0003.\u02b5\b.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0005/\u02bc\b/\n/\f/\u02bf\t/\u0001/\u0001/\u0003/\u02c3\b/"+
		"\u0001/\u0003/\u02c6\b/\u00010\u00050\u02c9\b0\n0\f0\u02cc\t0\u00010\u0001"+
		"0\u00010\u00011\u00051\u02d2\b1\n1\f1\u02d5\t1\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00054\u02e2\b4\n4"+
		"\f4\u02e5\t4\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00036\u02ee"+
		"\b6\u00016\u00036\u02f1\b6\u00017\u00017\u00018\u00018\u00038\u02f7\b"+
		"8\u00018\u00058\u02fa\b8\n8\f8\u02fd\t8\u00019\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0003:\u0306\b:\u0001;\u0001;\u0001;\u0001;\u0005;\u030c"+
		"\b;\n;\f;\u030f\t;\u0003;\u0311\b;\u0001;\u0003;\u0314\b;\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0005=\u031f\b=\n="+
		"\f=\u0322\t=\u0001=\u0001=\u0001>\u0005>\u0327\b>\n>\f>\u032a\t>\u0001"+
		">\u0001>\u0003>\u032e\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u0336\b?\u0001?\u0001?\u0003?\u033a\b?\u0001?\u0001?\u0003?\u033e\b"+
		"?\u0001?\u0001?\u0003?\u0342\b?\u0003?\u0344\b?\u0001@\u0001@\u0003@\u0348"+
		"\b@\u0001A\u0001A\u0001A\u0001A\u0003A\u034e\bA\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0005D\u0357\bD\nD\fD\u035a\tD\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0003E\u0361\bE\u0001F\u0001F\u0001F\u0001G\u0005G\u0367"+
		"\bG\nG\fG\u036a\tG\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u0375\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0004H\u0390"+
		"\bH\u000bH\fH\u0391\u0001H\u0003H\u0395\bH\u0001H\u0003H\u0398\bH\u0001"+
		"H\u0001H\u0001H\u0001H\u0005H\u039e\bH\nH\fH\u03a1\tH\u0001H\u0003H\u03a4"+
		"\bH\u0001H\u0001H\u0003H\u03a8\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0003H\u03b1\bH\u0001H\u0001H\u0001H\u0003H\u03b6\bH\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003"+
		"H\u03c3\bH\u0001I\u0005I\u03c6\bI\nI\fI\u03c9\tI\u0001I\u0001I\u0003I"+
		"\u03cd\bI\u0001J\u0001J\u0001J\u0003J\u03d2\bJ\u0001K\u0001K\u0001K\u0003"+
		"K\u03d7\bK\u0001L\u0001L\u0001L\u0005L\u03dc\bL\nL\fL\u03df\tL\u0001L"+
		"\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0005M\u03e9\bM\nM\f"+
		"M\u03ec\tM\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0003O\u03f4\bO\u0001"+
		"O\u0001O\u0001P\u0001P\u0001P\u0005P\u03fb\bP\nP\fP\u03fe\tP\u0001Q\u0005"+
		"Q\u0401\bQ\nQ\fQ\u0404\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0003R\u040d\bR\u0001R\u0001R\u0003R\u0411\bR\u0001R\u0001R\u0003R\u0415"+
		"\bR\u0003R\u0417\bR\u0001S\u0001S\u0003S\u041b\bS\u0001T\u0005T\u041e"+
		"\bT\nT\fT\u0421\tT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001"+
		"V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0005W\u0431\bW\nW\fW\u0434"+
		"\tW\u0001X\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0005Z\u043d\bZ\n"+
		"Z\fZ\u0440\tZ\u0001[\u0001[\u0001[\u0003[\u0445\b[\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0003\\\u0454\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003"+
		"\\\u0464\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u0487"+
		"\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u048d\b\\\u0001\\\u0001\\"+
		"\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u0495\b\\\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u049a\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0003\\\u04b6\b\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0005\\\u04be\b\\\n\\\f\\\u04c1\t\\\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0003]\u04d6\b]\u0001]\u0003]\u04d9\b]\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u04e4"+
		"\b^\u0003^\u04e6\b^\u0001_\u0001_\u0003_\u04ea\b_\u0001_\u0001_\u0001"+
		"_\u0003_\u04ef\b_\u0005_\u04f1\b_\n_\f_\u04f4\t_\u0001_\u0001_\u0001_"+
		"\u0003_\u04f9\b_\u0001`\u0001`\u0003`\u04fd\b`\u0001`\u0001`\u0001a\u0001"+
		"a\u0001a\u0001a\u0005a\u0505\ba\na\fa\u0508\ta\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0005a\u0511\ba\na\fa\u0514\ta\u0001a\u0001a\u0005"+
		"a\u0518\ba\na\fa\u051b\ta\u0003a\u051d\ba\u0001b\u0001b\u0001b\u0001b"+
		"\u0003b\u0523\bb\u0001b\u0001b\u0001b\u0003b\u0528\bb\u0001b\u0001b\u0001"+
		"b\u0003b\u052d\bb\u0001b\u0001b\u0001b\u0003b\u0532\bb\u0005b\u0534\b"+
		"b\nb\fb\u0537\tb\u0001b\u0001b\u0003b\u053b\bb\u0001c\u0001c\u0001c\u0001"+
		"c\u0003c\u0541\bc\u0001c\u0001c\u0001c\u0003c\u0546\bc\u0005c\u0548\b"+
		"c\nc\fc\u054b\tc\u0001c\u0001c\u0003c\u054f\bc\u0001d\u0001d\u0003d\u0553"+
		"\bd\u0001e\u0001e\u0001e\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001"+
		"g\u0003g\u055f\bg\u0001h\u0001h\u0001h\u0003h\u0564\bh\u0001i\u0001i\u0001"+
		"i\u0001i\u0003i\u056a\bi\u0003i\u056c\bi\u0001j\u0001j\u0001j\u0001j\u0003"+
		"j\u0572\bj\u0001k\u0001k\u0003k\u0576\bk\u0001k\u0001k\u0001k\u0000\u0001"+
		"\u00b8l\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u0000\u000e\u0002\u0000\u0006"+
		"\u0006qq\u0005\u0000\t\t\u000b\u000b\u0016\u0016\u001d\u001d&&\u0002\u0000"+
		"\u0013\u0013((\u0001\u0000?D\u0002\u000088:<\u0001\u0000[^\u0001\u0000"+
		"QR\u0002\u0000_`dd\u0001\u0000]^\u0002\u0000OPVW\u0003\u0000\u0001\u0001"+
		"UUXX\u0002\u0000NNeo\u0001\u00008<\u0001\u0000[\\\u060c\u0000\u00d9\u0001"+
		"\u0000\u0000\u0000\u0002\u00ec\u0001\u0000\u0000\u0000\u0004\u00f3\u0001"+
		"\u0000\u0000\u0000\u0006\u011b\u0001\u0000\u0000\u0000\b\u0121\u0001\u0000"+
		"\u0000\u0000\n\u0132\u0001\u0000\u0000\u0000\f\u0136\u0001\u0000\u0000"+
		"\u0000\u000e\u0138\u0001\u0000\u0000\u0000\u0010\u0147\u0001\u0000\u0000"+
		"\u0000\u0012\u0152\u0001\u0000\u0000\u0000\u0014\u0157\u0001\u0000\u0000"+
		"\u0000\u0016\u015f\u0001\u0000\u0000\u0000\u0018\u0171\u0001\u0000\u0000"+
		"\u0000\u001a\u017c\u0001\u0000\u0000\u0000\u001c\u0186\u0001\u0000\u0000"+
		"\u0000\u001e\u018d\u0001\u0000\u0000\u0000 \u0198\u0001\u0000\u0000\u0000"+
		"\"\u01a0\u0001\u0000\u0000\u0000$\u01a9\u0001\u0000\u0000\u0000&\u01c4"+
		"\u0001\u0000\u0000\u0000(\u01d0\u0001\u0000\u0000\u0000*\u01d3\u0001\u0000"+
		"\u0000\u0000,\u01ea\u0001\u0000\u0000\u0000.\u01ed\u0001\u0000\u0000\u0000"+
		"0\u01f5\u0001\u0000\u0000\u00002\u01f8\u0001\u0000\u0000\u00004\u01fc"+
		"\u0001\u0000\u0000\u00006\u0200\u0001\u0000\u0000\u00008\u020f\u0001\u0000"+
		"\u0000\u0000:\u0218\u0001\u0000\u0000\u0000<\u021a\u0001\u0000\u0000\u0000"+
		">\u0225\u0001\u0000\u0000\u0000@\u0232\u0001\u0000\u0000\u0000B\u0243"+
		"\u0001\u0000\u0000\u0000D\u0246\u0001\u0000\u0000\u0000F\u024e\u0001\u0000"+
		"\u0000\u0000H\u0253\u0001\u0000\u0000\u0000J\u025d\u0001\u0000\u0000\u0000"+
		"L\u025f\u0001\u0000\u0000\u0000N\u026f\u0001\u0000\u0000\u0000P\u0281"+
		"\u0001\u0000\u0000\u0000R\u0293\u0001\u0000\u0000\u0000T\u0295\u0001\u0000"+
		"\u0000\u0000V\u0297\u0001\u0000\u0000\u0000X\u02a8\u0001\u0000\u0000\u0000"+
		"Z\u02aa\u0001\u0000\u0000\u0000\\\u02b2\u0001\u0000\u0000\u0000^\u02c5"+
		"\u0001\u0000\u0000\u0000`\u02ca\u0001\u0000\u0000\u0000b\u02d3\u0001\u0000"+
		"\u0000\u0000d\u02da\u0001\u0000\u0000\u0000f\u02dc\u0001\u0000\u0000\u0000"+
		"h\u02de\u0001\u0000\u0000\u0000j\u02e6\u0001\u0000\u0000\u0000l\u02e8"+
		"\u0001\u0000\u0000\u0000n\u02f2\u0001\u0000\u0000\u0000p\u02f4\u0001\u0000"+
		"\u0000\u0000r\u02fe\u0001\u0000\u0000\u0000t\u0305\u0001\u0000\u0000\u0000"+
		"v\u0307\u0001\u0000\u0000\u0000x\u0317\u0001\u0000\u0000\u0000z\u031c"+
		"\u0001\u0000\u0000\u0000|\u032d\u0001\u0000\u0000\u0000~\u0343\u0001\u0000"+
		"\u0000\u0000\u0080\u0347\u0001\u0000\u0000\u0000\u0082\u0349\u0001\u0000"+
		"\u0000\u0000\u0084\u034f\u0001\u0000\u0000\u0000\u0086\u0351\u0001\u0000"+
		"\u0000\u0000\u0088\u0354\u0001\u0000\u0000\u0000\u008a\u0360\u0001\u0000"+
		"\u0000\u0000\u008c\u0362\u0001\u0000\u0000\u0000\u008e\u0368\u0001\u0000"+
		"\u0000\u0000\u0090\u03c2\u0001\u0000\u0000\u0000\u0092\u03c7\u0001\u0000"+
		"\u0000\u0000\u0094\u03ce\u0001\u0000\u0000\u0000\u0096\u03d3\u0001\u0000"+
		"\u0000\u0000\u0098\u03d8\u0001\u0000\u0000\u0000\u009a\u03e5\u0001\u0000"+
		"\u0000\u0000\u009c\u03ed\u0001\u0000\u0000\u0000\u009e\u03f0\u0001\u0000"+
		"\u0000\u0000\u00a0\u03f7\u0001\u0000\u0000\u0000\u00a2\u0402\u0001\u0000"+
		"\u0000\u0000\u00a4\u0416\u0001\u0000\u0000\u0000\u00a6\u041a\u0001\u0000"+
		"\u0000\u0000\u00a8\u041f\u0001\u0000\u0000\u0000\u00aa\u0427\u0001\u0000"+
		"\u0000\u0000\u00ac\u0429\u0001\u0000\u0000\u0000\u00ae\u042d\u0001\u0000"+
		"\u0000\u0000\u00b0\u0435\u0001\u0000\u0000\u0000\u00b2\u0437\u0001\u0000"+
		"\u0000\u0000\u00b4\u0439\u0001\u0000\u0000\u0000\u00b6\u0444\u0001\u0000"+
		"\u0000\u0000\u00b8\u0453\u0001\u0000\u0000\u0000\u00ba\u04d8\u0001\u0000"+
		"\u0000\u0000\u00bc\u04e5\u0001\u0000\u0000\u0000\u00be\u04f8\u0001\u0000"+
		"\u0000\u0000\u00c0\u04fa\u0001\u0000\u0000\u0000\u00c2\u0500\u0001\u0000"+
		"\u0000\u0000\u00c4\u051e\u0001\u0000\u0000\u0000\u00c6\u053c\u0001\u0000"+
		"\u0000\u0000\u00c8\u0550\u0001\u0000\u0000\u0000\u00ca\u0554\u0001\u0000"+
		"\u0000\u0000\u00cc\u0557\u0001\u0000\u0000\u0000\u00ce\u055e\u0001\u0000"+
		"\u0000\u0000\u00d0\u0563\u0001\u0000\u0000\u0000\u00d2\u056b\u0001\u0000"+
		"\u0000\u0000\u00d4\u0571\u0001\u0000\u0000\u0000\u00d6\u0573\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0003\u0002\u0001\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00de\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0003\u0004\u0002\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003\u0006"+
		"\u0003\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0000\u0000\u0001\u00e8\u0001\u0001\u0000"+
		"\u0000\u0000\u00e9\u00eb\u0003l6\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005!\u0000\u0000\u00f0"+
		"\u00f1\u0003h4\u0000\u00f1\u00f2\u0005K\u0000\u0000\u00f2\u0003\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0005\u001b\u0000\u0000\u00f4\u00f6\u0005"+
		"\'\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fa\u0003h4\u0000"+
		"\u00f8\u00f9\u0005M\u0000\u0000\u00f9\u00fb\u0005_\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005K\u0000\u0000\u00fd\u0005\u0001"+
		"\u0000\u0000\u0000\u00fe\u0100\u0003\n\u0005\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u011c\u0003\u000e"+
		"\u0007\u0000\u0105\u0107\u0003\n\u0005\u0000\u0106\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u011c\u0003\u0016\u000b"+
		"\u0000\u010c\u010e\u0003\n\u0005\u0000\u010d\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u011c\u0003\u001e\u000f\u0000"+
		"\u0113\u0115\u0003\n\u0005\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115"+
		"\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0003x<\u0000\u011a\u011c\u0005"+
		"K\u0000\u0000\u011b\u0101\u0001\u0000\u0000\u0000\u011b\u0108\u0001\u0000"+
		"\u0000\u0000\u011b\u010f\u0001\u0000\u0000\u0000\u011b\u0116\u0001\u0000"+
		"\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u0007\u0001\u0000"+
		"\u0000\u0000\u011d\u0122\u0003\n\u0005\u0000\u011e\u0122\u0005\u001f\u0000"+
		"\u0000\u011f\u0122\u0005)\u0000\u0000\u0120\u0122\u0005-\u0000\u0000\u0121"+
		"\u011d\u0001\u0000\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\t\u0001\u0000\u0000\u0000\u0123\u0133\u0003l6\u0000\u0124\u0133\u0005"+
		"$\u0000\u0000\u0125\u0133\u0005#\u0000\u0000\u0126\u0133\u0005\"\u0000"+
		"\u0000\u0127\u0133\u0005\'\u0000\u0000\u0128\u0133\u0005\u0007\u0000\u0000"+
		"\u0129\u0133\u0005\u0014\u0000\u0000\u012a\u0133\u00052\u0000\u0000\u012b"+
		"\u0133\u00053\u0000\u0000\u012c\u0133\u0005\u0003\u0000\u0000\u012d\u0133"+
		"\u0005\u0004\u0000\u0000\u012e\u0133\u0005=\u0000\u0000\u012f\u0133\u0005"+
		"4\u0000\u0000\u0130\u0133\u00055\u0000\u0000\u0131\u0133\u00056\u0000"+
		"\u0000\u0132\u0123\u0001\u0000\u0000\u0000\u0132\u0124\u0001\u0000\u0000"+
		"\u0000\u0132\u0125\u0001\u0000\u0000\u0000\u0132\u0126\u0001\u0000\u0000"+
		"\u0000\u0132\u0127\u0001\u0000\u0000\u0000\u0132\u0128\u0001\u0000\u0000"+
		"\u0000\u0132\u0129\u0001\u0000\u0000\u0000\u0132\u012a\u0001\u0000\u0000"+
		"\u0000\u0132\u012b\u0001\u0000\u0000\u0000\u0132\u012c\u0001\u0000\u0000"+
		"\u0000\u0132\u012d\u0001\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000"+
		"\u0000\u0132\u012f\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u000b\u0001\u0000\u0000"+
		"\u0000\u0134\u0137\u0005\u0014\u0000\u0000\u0135\u0137\u0003l6\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\r\u0001\u0000\u0000\u0000\u0138\u0139\u0005\f\u0000\u0000\u0139\u013b"+
		"\u0007\u0000\u0000\u0000\u013a\u013c\u0003\u0010\b\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013f\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0005\u0013\u0000\u0000\u013e\u0140\u0003"+
		"P(\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u001a\u0000"+
		"\u0000\u0142\u0144\u0003 \u0010\u0000\u0143\u0141\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0003\"\u0011\u0000\u0146\u000f\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005P\u0000\u0000\u0148\u014d\u0003\u0012\t\u0000\u0149\u014a"+
		"\u0005L\u0000\u0000\u014a\u014c\u0003\u0012\t\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0005"+
		"O\u0000\u0000\u0151\u0011\u0001\u0000\u0000\u0000\u0152\u0155\u0005q\u0000"+
		"\u0000\u0153\u0154\u0005\u0013\u0000\u0000\u0154\u0156\u0003\u0014\n\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0013\u0001\u0000\u0000\u0000\u0157\u015c\u0003P(\u0000\u0158\u0159"+
		"\u0005a\u0000\u0000\u0159\u015b\u0003P(\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u0015\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0012"+
		"\u0000\u0000\u0160\u0163\u0005q\u0000\u0000\u0161\u0162\u0005\u001a\u0000"+
		"\u0000\u0162\u0164\u0003 \u0010\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0167\u0005G\u0000\u0000\u0166\u0168\u0003\u0018\f\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u016a\u0001\u0000\u0000\u0000\u0169\u016b\u0005L\u0000\u0000\u016a\u0169"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u001c\u000e\u0000\u016d\u016c"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0005H\u0000\u0000\u0170\u0017\u0001"+
		"\u0000\u0000\u0000\u0171\u0176\u0003\u001a\r\u0000\u0172\u0173\u0005L"+
		"\u0000\u0000\u0173\u0175\u0003\u001a\r\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0019\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017b\u0003l6\u0000\u017a"+
		"\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c"+
		"\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d"+
		"\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f"+
		"\u0181\u0005q\u0000\u0000\u0180\u0182\u0003\u00d6k\u0000\u0181\u0180\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u0185\u0003\"\u0011\u0000\u0184\u0183\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u001b\u0001\u0000"+
		"\u0000\u0000\u0186\u018a\u0005K\u0000\u0000\u0187\u0189\u0003&\u0013\u0000"+
		"\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u001d\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005\u001e\u0000\u0000\u018e\u0190\u0005q\u0000\u0000\u018f"+
		"\u0191\u0003\u0010\b\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0005\u0013\u0000\u0000\u0193\u0195\u0003 \u0010\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0003$\u0012\u0000\u0197\u001f\u0001\u0000"+
		"\u0000\u0000\u0198\u019d\u0003P(\u0000\u0199\u019a\u0005L\u0000\u0000"+
		"\u019a\u019c\u0003P(\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f"+
		"\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e!\u0001\u0000\u0000\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a4\u0005G\u0000\u0000\u01a1\u01a3\u0003&\u0013"+
		"\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005H\u0000\u0000\u01a8#\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ad\u0005G\u0000\u0000\u01aa\u01ac\u00038\u001c\u0000\u01ab\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"H\u0000\u0000\u01b1%\u0001\u0000\u0000\u0000\u01b2\u01c5\u0005K\u0000"+
		"\u0000\u01b3\u01b5\u0003l6\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01bc\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003\b\u0004\u0000\u01ba\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf"+
		"\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c5"+
		"\u0003(\u0014\u0000\u01c0\u01c2\u0005\'\u0000\u0000\u01c1\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c5\u0003\u0088D\u0000\u01c4\u01b2\u0001\u0000"+
		"\u0000\u0000\u01c4\u01b6\u0001\u0000\u0000\u0000\u01c4\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c5\'\u0001\u0000\u0000\u0000\u01c6\u01d1\u0003*\u0015"+
		"\u0000\u01c7\u01d1\u0003,\u0016\u0000\u01c8\u01d1\u00032\u0019\u0000\u01c9"+
		"\u01d1\u0003.\u0017\u0000\u01ca\u01d1\u00030\u0018\u0000\u01cb\u01d1\u0003"+
		"\u001e\u000f\u0000\u01cc\u01d1\u0003x<\u0000\u01cd\u01d1\u0003\u000e\u0007"+
		"\u0000\u01ce\u01d1\u0003\u0016\u000b\u0000\u01cf\u01d1\u00034\u001a\u0000"+
		"\u01d0\u01c6\u0001\u0000\u0000\u0000\u01d0\u01c7\u0001\u0000\u0000\u0000"+
		"\u01d0\u01c8\u0001\u0000\u0000\u0000\u01d0\u01c9\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ca\u0001\u0000\u0000\u0000\u01d0\u01cb\u0001\u0000\u0000\u0000"+
		"\u01d0\u01cc\u0001\u0000\u0000\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d1)\u0001\u0000\u0000\u0000\u01d2\u01d4\u0005\u0003\u0000\u0000\u01d3"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d8\u0003P(\u0000\u01d6\u01d8\u0005"+
		"/\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0007\u0000"+
		"\u0000\u0000\u01da\u01df\u0003\\.\u0000\u01db\u01dc\u0005I\u0000\u0000"+
		"\u01dc\u01de\u0005J\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de"+
		"\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e4\u0001\u0000\u0000\u0000\u01e1"+
		"\u01df\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005,\u0000\u0000\u01e3\u01e5"+
		"\u0003Z-\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e9\u0003d2\u0000"+
		"\u01e7\u01e9\u0005K\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e9+\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0003\u0010\b\u0000\u01eb\u01ec\u0003*\u0015\u0000\u01ec-\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005q\u0000\u0000\u01ee\u01f1\u0003\\.\u0000"+
		"\u01ef\u01f0\u0005,\u0000\u0000\u01f0\u01f2\u0003Z-\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003f3\u0000\u01f4/\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0003\u0010\b\u0000\u01f6\u01f7\u0003.\u0017"+
		"\u0000\u01f71\u0001\u0000\u0000\u0000\u01f8\u01f9\u0003P(\u0000\u01f9"+
		"\u01fa\u0003D\"\u0000\u01fa\u01fb\u0005K\u0000\u0000\u01fb3\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0003P(\u0000\u01fd\u01fe\u0003D\"\u0000\u01fe"+
		"\u01ff\u00036\u001b\u0000\u01ff5\u0001\u0000\u0000\u0000\u0200\u0201\u0005"+
		"G\u0000\u0000\u0201\u0203\u0003\u0092I\u0000\u0202\u0204\u0003\u0092I"+
		"\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0005H\u0000\u0000"+
		"\u02067\u0001\u0000\u0000\u0000\u0207\u0209\u0003\b\u0004\u0000\u0208"+
		"\u0207\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a"+
		"\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b"+
		"\u020d\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020d"+
		"\u0210\u0003:\u001d\u0000\u020e\u0210\u0005K\u0000\u0000\u020f\u020a\u0001"+
		"\u0000\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u02109\u0001\u0000"+
		"\u0000\u0000\u0211\u0219\u0003<\u001e\u0000\u0212\u0219\u0003@ \u0000"+
		"\u0213\u0219\u0003B!\u0000\u0214\u0219\u0003\u001e\u000f\u0000\u0215\u0219"+
		"\u0003x<\u0000\u0216\u0219\u0003\u000e\u0007\u0000\u0217\u0219\u0003\u0016"+
		"\u000b\u0000\u0218\u0211\u0001\u0000\u0000\u0000\u0218\u0212\u0001\u0000"+
		"\u0000\u0000\u0218\u0213\u0001\u0000\u0000\u0000\u0218\u0214\u0001\u0000"+
		"\u0000\u0000\u0218\u0215\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0219;\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0003P(\u0000\u021b\u0220\u0003>\u001f\u0000\u021c"+
		"\u021d\u0005L\u0000\u0000\u021d\u021f\u0003>\u001f\u0000\u021e\u021c\u0001"+
		"\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000\u0000\u0220\u021e\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0223\u0001"+
		"\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223\u0224\u0005"+
		"K\u0000\u0000\u0224=\u0001\u0000\u0000\u0000\u0225\u022a\u0005q\u0000"+
		"\u0000\u0226\u0227\u0005I\u0000\u0000\u0227\u0229\u0005J\u0000\u0000\u0228"+
		"\u0226\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a"+
		"\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b"+
		"\u022d\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0005N\u0000\u0000\u022e\u022f\u0003J%\u0000\u022f?\u0001\u0000"+
		"\u0000\u0000\u0230\u0233\u0003P(\u0000\u0231\u0233\u0005/\u0000\u0000"+
		"\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0235\u0005q\u0000\u0000\u0235"+
		"\u023a\u0003\\.\u0000\u0236\u0237\u0005I\u0000\u0000\u0237\u0239\u0005"+
		"J\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000"+
		"\u0000\u0000\u023b\u023f\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0005,\u0000\u0000\u023e\u0240\u0003Z-\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0005K\u0000\u0000\u0242"+
		"A\u0001\u0000\u0000\u0000\u0243\u0244\u0003\u0010\b\u0000\u0244\u0245"+
		"\u0003@ \u0000\u0245C\u0001\u0000\u0000\u0000\u0246\u024b\u0003F#\u0000"+
		"\u0247\u0248\u0005L\u0000\u0000\u0248\u024a\u0003F#\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u0249"+
		"\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024cE\u0001"+
		"\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u0251\u0003"+
		"H$\u0000\u024f\u0250\u0005N\u0000\u0000\u0250\u0252\u0003J%\u0000\u0251"+
		"\u024f\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252"+
		"G\u0001\u0000\u0000\u0000\u0253\u0258\u0005q\u0000\u0000\u0254\u0255\u0005"+
		"I\u0000\u0000\u0255\u0257\u0005J\u0000\u0000\u0256\u0254\u0001\u0000\u0000"+
		"\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259I\u0001\u0000\u0000\u0000"+
		"\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025e\u0003L&\u0000\u025c\u025e"+
		"\u0003\u00b8\\\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025c\u0001"+
		"\u0000\u0000\u0000\u025eK\u0001\u0000\u0000\u0000\u025f\u026b\u0005G\u0000"+
		"\u0000\u0260\u0265\u0003J%\u0000\u0261\u0262\u0005L\u0000\u0000\u0262"+
		"\u0264\u0003J%\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0267\u0001"+
		"\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001"+
		"\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0268\u026a\u0005L\u0000\u0000\u0269\u0268\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000"+
		"\u0000\u0000\u026b\u0260\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0005H\u0000"+
		"\u0000\u026eM\u0001\u0000\u0000\u0000\u026f\u0270\u0005q\u0000\u0000\u0270"+
		"O\u0001\u0000\u0000\u0000\u0271\u0276\u0003R)\u0000\u0272\u0273\u0005"+
		"I\u0000\u0000\u0273\u0275\u0005J\u0000\u0000\u0274\u0272\u0001\u0000\u0000"+
		"\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0282\u0001\u0000\u0000"+
		"\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027e\u0003T*\u0000\u027a"+
		"\u027b\u0005I\u0000\u0000\u027b\u027d\u0005J\u0000\u0000\u027c\u027a\u0001"+
		"\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0282\u0001"+
		"\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281\u0271\u0001"+
		"\u0000\u0000\u0000\u0281\u0279\u0001\u0000\u0000\u0000\u0282Q\u0001\u0000"+
		"\u0000\u0000\u0283\u0285\u0005q\u0000\u0000\u0284\u0286\u0003V+\u0000"+
		"\u0285\u0284\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000"+
		"\u0286\u028e\u0001\u0000\u0000\u0000\u0287\u0288\u0005M\u0000\u0000\u0288"+
		"\u028a\u0005q\u0000\u0000\u0289\u028b\u0003V+\u0000\u028a\u0289\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028d\u0001"+
		"\u0000\u0000\u0000\u028c\u0287\u0001\u0000\u0000\u0000\u028d\u0290\u0001"+
		"\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028f\u0001"+
		"\u0000\u0000\u0000\u028f\u0294\u0001\u0000\u0000\u0000\u0290\u028e\u0001"+
		"\u0000\u0000\u0000\u0291\u0292\u0005\u0005\u0000\u0000\u0292\u0294\u0003"+
		"V+\u0000\u0293\u0283\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000"+
		"\u0000\u0294S\u0001\u0000\u0000\u0000\u0295\u0296\u0007\u0001\u0000\u0000"+
		"\u0296U\u0001\u0000\u0000\u0000\u0297\u0298\u0005P\u0000\u0000\u0298\u029d"+
		"\u0003X,\u0000\u0299\u029a\u0005L\u0000\u0000\u029a\u029c\u0003X,\u0000"+
		"\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000\u0000"+
		"\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000"+
		"\u029e\u02a0\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a1\u0005O\u0000\u0000\u02a1W\u0001\u0000\u0000\u0000\u02a2\u02a9"+
		"\u0003P(\u0000\u02a3\u02a6\u0005S\u0000\u0000\u02a4\u02a5\u0007\u0002"+
		"\u0000\u0000\u02a5\u02a7\u0003P(\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a9\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a2\u0001\u0000\u0000\u0000\u02a8\u02a3\u0001\u0000\u0000\u0000"+
		"\u02a9Y\u0001\u0000\u0000\u0000\u02aa\u02af\u0003h4\u0000\u02ab\u02ac"+
		"\u0005L\u0000\u0000\u02ac\u02ae\u0003h4\u0000\u02ad\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0[\u0001\u0000\u0000"+
		"\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2\u02b4\u0005E\u0000\u0000"+
		"\u02b3\u02b5\u0003^/\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b7"+
		"\u0005F\u0000\u0000\u02b7]\u0001\u0000\u0000\u0000\u02b8\u02bd\u0003`"+
		"0\u0000\u02b9\u02ba\u0005L\u0000\u0000\u02ba\u02bc\u0003`0\u0000\u02bb"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000\u02bd"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be"+
		"\u02c2\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u0005L\u0000\u0000\u02c1\u02c3\u0003b1\u0000\u02c2\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c6\u0003b1\u0000\u02c5\u02b8\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6_\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c9\u0003\f\u0006\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9"+
		"\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc"+
		"\u02ca\u0001\u0000\u0000\u0000\u02cd\u02ce\u0003P(\u0000\u02ce\u02cf\u0003"+
		"H$\u0000\u02cfa\u0001\u0000\u0000\u0000\u02d0\u02d2\u0003\f\u0006\u0000"+
		"\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d7\u0003P(\u0000\u02d7\u02d8\u0005s\u0000\u0000\u02d8\u02d9"+
		"\u0003H$\u0000\u02d9c\u0001\u0000\u0000\u0000\u02da\u02db\u0003\u0088"+
		"D\u0000\u02dbe\u0001\u0000\u0000\u0000\u02dc\u02dd\u0003\u0088D\u0000"+
		"\u02ddg\u0001\u0000\u0000\u0000\u02de\u02e3\u0005q\u0000\u0000\u02df\u02e0"+
		"\u0005M\u0000\u0000\u02e0\u02e2\u0005q\u0000\u0000\u02e1\u02df\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4i\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e7\u0007\u0003\u0000"+
		"\u0000\u02e7k\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005r\u0000\u0000\u02e9"+
		"\u02f0\u0003n7\u0000\u02ea\u02ed\u0005E\u0000\u0000\u02eb\u02ee\u0003"+
		"p8\u0000\u02ec\u02ee\u0003t:\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f1\u0005F\u0000\u0000\u02f0"+
		"\u02ea\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1"+
		"m\u0001\u0000\u0000\u0000\u02f2\u02f3\u0003h4\u0000\u02f3o\u0001\u0000"+
		"\u0000\u0000\u02f4\u02fb\u0003r9\u0000\u02f5\u02f7\u0005L\u0000\u0000"+
		"\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0003r9\u0000\u02f9\u02f6"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9"+
		"\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fcq\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005"+
		"q\u0000\u0000\u02ff\u0300\u0005N\u0000\u0000\u0300\u0301\u0003t:\u0000"+
		"\u0301s\u0001\u0000\u0000\u0000\u0302\u0306\u0003\u00b8\\\u0000\u0303"+
		"\u0306\u0003l6\u0000\u0304\u0306\u0003v;\u0000\u0305\u0302\u0001\u0000"+
		"\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0304\u0001\u0000"+
		"\u0000\u0000\u0306u\u0001\u0000\u0000\u0000\u0307\u0310\u0005G\u0000\u0000"+
		"\u0308\u030d\u0003t:\u0000\u0309\u030a\u0005L\u0000\u0000\u030a\u030c"+
		"\u0003t:\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000"+
		"\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000"+
		"\u0000\u0000\u030e\u0311\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000"+
		"\u0000\u0000\u0310\u0308\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000"+
		"\u0000\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0314\u0005L\u0000"+
		"\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000"+
		"\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0005H\u0000\u0000"+
		"\u0316w\u0001\u0000\u0000\u0000\u0317\u0318\u0005r\u0000\u0000\u0318\u0319"+
		"\u0005\u001e\u0000\u0000\u0319\u031a\u0005q\u0000\u0000\u031a\u031b\u0003"+
		"z=\u0000\u031by\u0001\u0000\u0000\u0000\u031c\u0320\u0005G\u0000\u0000"+
		"\u031d\u031f\u0003|>\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f\u0322"+
		"\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0001\u0000\u0000\u0000\u0321\u0323\u0001\u0000\u0000\u0000\u0322\u0320"+
		"\u0001\u0000\u0000\u0000\u0323\u0324\u0005H\u0000\u0000\u0324{\u0001\u0000"+
		"\u0000\u0000\u0325\u0327\u0003\b\u0004\u0000\u0326\u0325\u0001\u0000\u0000"+
		"\u0000\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001\u0000\u0000"+
		"\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032e\u0003~?\u0000\u032c"+
		"\u032e\u0005K\u0000\u0000\u032d\u0328\u0001\u0000\u0000\u0000\u032d\u032c"+
		"\u0001\u0000\u0000\u0000\u032e}\u0001\u0000\u0000\u0000\u032f\u0330\u0003"+
		"P(\u0000\u0330\u0331\u0003\u0080@\u0000\u0331\u0332\u0005K\u0000\u0000"+
		"\u0332\u0344\u0001\u0000\u0000\u0000\u0333\u0335\u0003\u000e\u0007\u0000"+
		"\u0334\u0336\u0005K\u0000\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335"+
		"\u0336\u0001\u0000\u0000\u0000\u0336\u0344\u0001\u0000\u0000\u0000\u0337"+
		"\u0339\u0003\u001e\u000f\u0000\u0338\u033a\u0005K\u0000\u0000\u0339\u0338"+
		"\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u0344"+
		"\u0001\u0000\u0000\u0000\u033b\u033d\u0003\u0016\u000b\u0000\u033c\u033e"+
		"\u0005K\u0000\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033d\u033e\u0001"+
		"\u0000\u0000\u0000\u033e\u0344\u0001\u0000\u0000\u0000\u033f\u0341\u0003"+
		"x<\u0000\u0340\u0342\u0005K\u0000\u0000\u0341\u0340\u0001\u0000\u0000"+
		"\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0344\u0001\u0000\u0000"+
		"\u0000\u0343\u032f\u0001\u0000\u0000\u0000\u0343\u0333\u0001\u0000\u0000"+
		"\u0000\u0343\u0337\u0001\u0000\u0000\u0000\u0343\u033b\u0001\u0000\u0000"+
		"\u0000\u0343\u033f\u0001\u0000\u0000\u0000\u0344\u007f\u0001\u0000\u0000"+
		"\u0000\u0345\u0348\u0003\u0082A\u0000\u0346\u0348\u0003\u0084B\u0000\u0347"+
		"\u0345\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0348"+
		"\u0081\u0001\u0000\u0000\u0000\u0349\u034a\u0005q\u0000\u0000\u034a\u034b"+
		"\u0005E\u0000\u0000\u034b\u034d\u0005F\u0000\u0000\u034c\u034e\u0003\u0086"+
		"C\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000"+
		"\u0000\u034e\u0083\u0001\u0000\u0000\u0000\u034f\u0350\u0003D\"\u0000"+
		"\u0350\u0085\u0001\u0000\u0000\u0000\u0351\u0352\u0005\u000f\u0000\u0000"+
		"\u0352\u0353\u0003t:\u0000\u0353\u0087\u0001\u0000\u0000\u0000\u0354\u0358"+
		"\u0005G\u0000\u0000\u0355\u0357\u0003\u008aE\u0000\u0356\u0355\u0001\u0000"+
		"\u0000\u0000\u0357\u035a\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u035b\u0001\u0000"+
		"\u0000\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035b\u035c\u0005H\u0000"+
		"\u0000\u035c\u0089\u0001\u0000\u0000\u0000\u035d\u0361\u0003\u008cF\u0000"+
		"\u035e\u0361\u0003\u0090H\u0000\u035f\u0361\u0003\u0006\u0003\u0000\u0360"+
		"\u035d\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0360"+
		"\u035f\u0001\u0000\u0000\u0000\u0361\u008b\u0001\u0000\u0000\u0000\u0362"+
		"\u0363\u0003\u008eG\u0000\u0363\u0364\u0005K\u0000\u0000\u0364\u008d\u0001"+
		"\u0000\u0000\u0000\u0365\u0367\u0003\f\u0006\u0000\u0366\u0365\u0001\u0000"+
		"\u0000\u0000\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u036b\u0001\u0000"+
		"\u0000\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036b\u036c\u0003P(\u0000"+
		"\u036c\u036d\u0003D\"\u0000\u036d\u008f\u0001\u0000\u0000\u0000\u036e"+
		"\u03c3\u0003\u0088D\u0000\u036f\u0370\u0005\u0018\u0000\u0000\u0370\u0371"+
		"\u0003\u00acV\u0000\u0371\u0374\u0003\u0090H\u0000\u0372\u0373\u0005\u0011"+
		"\u0000\u0000\u0373\u0375\u0003\u0090H\u0000\u0374\u0372\u0001\u0000\u0000"+
		"\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u03c3\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0005\u0017\u0000\u0000\u0377\u0378\u0005E\u0000\u0000"+
		"\u0378\u0379\u0003\u00a4R\u0000\u0379\u037a\u0005F\u0000\u0000\u037a\u037b"+
		"\u0003\u0090H\u0000\u037b\u03c3\u0001\u0000\u0000\u0000\u037c\u037d\u0005"+
		"1\u0000\u0000\u037d\u037e\u0003\u00acV\u0000\u037e\u037f\u0003\u0090H"+
		"\u0000\u037f\u03c3\u0001\u0000\u0000\u0000\u0380\u0381\u0005\u0010\u0000"+
		"\u0000\u0381\u0382\u0003\u0090H\u0000\u0382\u0383\u00051\u0000\u0000\u0383"+
		"\u0384\u0003\u00acV\u0000\u0384\u0385\u0005K\u0000\u0000\u0385\u03c3\u0001"+
		"\u0000\u0000\u0000\u0386\u0387\u0005>\u0000\u0000\u0387\u0388\u0005E\u0000"+
		"\u0000\u0388\u0389\u0003\u00b8\\\u0000\u0389\u038a\u0005F\u0000\u0000"+
		"\u038a\u038b\u0003\u0090H\u0000\u038b\u03c3\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0005.\u0000\u0000\u038d\u0397\u0003\u0088D\u0000\u038e\u0390\u0003"+
		"\u0098L\u0000\u038f\u038e\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000"+
		"\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000"+
		"\u0000\u0000\u0392\u0394\u0001\u0000\u0000\u0000\u0393\u0395\u0003\u009c"+
		"N\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000"+
		"\u0000\u0395\u0398\u0001\u0000\u0000\u0000\u0396\u0398\u0003\u009cN\u0000"+
		"\u0397\u038f\u0001\u0000\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000"+
		"\u0398\u03c3\u0001\u0000\u0000\u0000\u0399\u039a\u0005.\u0000\u0000\u039a"+
		"\u039b\u0003\u009eO\u0000\u039b\u039f\u0003\u0088D\u0000\u039c\u039e\u0003"+
		"\u0098L\u0000\u039d\u039c\u0001\u0000\u0000\u0000\u039e\u03a1\u0001\u0000"+
		"\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a3\u0001\u0000\u0000\u0000\u03a1\u039f\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a4\u0003\u009cN\u0000\u03a3\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03c3\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a7\u0005%\u0000\u0000\u03a6\u03a8\u0003\u00b8\\\u0000"+
		"\u03a7\u03a6\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001\u0000\u0000\u0000"+
		"\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03c3\u0005K\u0000\u0000\u03aa"+
		"\u03ab\u0005+\u0000\u0000\u03ab\u03ac\u0003\u00b8\\\u0000\u03ac\u03ad"+
		"\u0005K\u0000\u0000\u03ad\u03c3\u0001\u0000\u0000\u0000\u03ae\u03b0\u0005"+
		"\b\u0000\u0000\u03af\u03b1\u0005q\u0000\u0000\u03b0\u03af\u0001\u0000"+
		"\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b2\u03c3\u0005K\u0000\u0000\u03b3\u03b5\u0005\u000e\u0000"+
		"\u0000\u03b4\u03b6\u0005q\u0000\u0000\u03b5\u03b4\u0001\u0000\u0000\u0000"+
		"\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000"+
		"\u03b7\u03c3\u0005K\u0000\u0000\u03b8\u03c3\u0005K\u0000\u0000\u03b9\u03ba"+
		"\u0003\u00b0X\u0000\u03ba\u03bb\u0005K\u0000\u0000\u03bb\u03c3\u0001\u0000"+
		"\u0000\u0000\u03bc\u03bd\u0005q\u0000\u0000\u03bd\u03be\u0005T\u0000\u0000"+
		"\u03be\u03c3\u0003\u0090H\u0000\u03bf\u03c0\u0003\u00b6[\u0000\u03c0\u03c1"+
		"\u0005K\u0000\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2\u036e\u0001"+
		"\u0000\u0000\u0000\u03c2\u036f\u0001\u0000\u0000\u0000\u03c2\u0376\u0001"+
		"\u0000\u0000\u0000\u03c2\u037c\u0001\u0000\u0000\u0000\u03c2\u0380\u0001"+
		"\u0000\u0000\u0000\u03c2\u0386\u0001\u0000\u0000\u0000\u03c2\u038c\u0001"+
		"\u0000\u0000\u0000\u03c2\u0399\u0001\u0000\u0000\u0000\u03c2\u03a5\u0001"+
		"\u0000\u0000\u0000\u03c2\u03aa\u0001\u0000\u0000\u0000\u03c2\u03ae\u0001"+
		"\u0000\u0000\u0000\u03c2\u03b3\u0001\u0000\u0000\u0000\u03c2\u03b8\u0001"+
		"\u0000\u0000\u0000\u03c2\u03b9\u0001\u0000\u0000\u0000\u03c2\u03bc\u0001"+
		"\u0000\u0000\u0000\u03c2\u03bf\u0001\u0000\u0000\u0000\u03c3\u0091\u0001"+
		"\u0000\u0000\u0000\u03c4\u03c6\u0003\b\u0004\u0000\u03c5\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c9\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03cc\u0001\u0000"+
		"\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03ca\u03cd\u0003\u0094"+
		"J\u0000\u03cb\u03cd\u0003\u0096K\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000"+
		"\u03cc\u03cb\u0001\u0000\u0000\u0000\u03cd\u0093\u0001\u0000\u0000\u0000"+
		"\u03ce\u03d1\u0005\u0006\u0000\u0000\u03cf\u03d2\u0005K\u0000\u0000\u03d0"+
		"\u03d2\u0003d2\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d0\u0001"+
		"\u0000\u0000\u0000\u03d2\u0095\u0001\u0000\u0000\u0000\u03d3\u03d6\u0005"+
		"\u0005\u0000\u0000\u03d4\u03d7\u0005K\u0000\u0000\u03d5\u03d7\u0003d2"+
		"\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d7\u0097\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005\n\u0000\u0000"+
		"\u03d9\u03dd\u0005E\u0000\u0000\u03da\u03dc\u0003\f\u0006\u0000\u03db"+
		"\u03da\u0001\u0000\u0000\u0000\u03dc\u03df\u0001\u0000\u0000\u0000\u03dd"+
		"\u03db\u0001\u0000\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de"+
		"\u03e0\u0001\u0000\u0000\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e1\u0003\u009aM\u0000\u03e1\u03e2\u0005q\u0000\u0000\u03e2\u03e3\u0005"+
		"F\u0000\u0000\u03e3\u03e4\u0003\u0088D\u0000\u03e4\u0099\u0001\u0000\u0000"+
		"\u0000\u03e5\u03ea\u0003h4\u0000\u03e6\u03e7\u0005b\u0000\u0000\u03e7"+
		"\u03e9\u0003h4\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e9\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001"+
		"\u0000\u0000\u0000\u03eb\u009b\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ed\u03ee\u0005\u0015\u0000\u0000\u03ee\u03ef\u0003"+
		"\u0088D\u0000\u03ef\u009d\u0001\u0000\u0000\u0000\u03f0\u03f1\u0005E\u0000"+
		"\u0000\u03f1\u03f3\u0003\u00a0P\u0000\u03f2\u03f4\u0005K\u0000\u0000\u03f3"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f6\u0005F\u0000\u0000\u03f6\u009f"+
		"\u0001\u0000\u0000\u0000\u03f7\u03fc\u0003\u00a2Q\u0000\u03f8\u03f9\u0005"+
		"K\u0000\u0000\u03f9\u03fb\u0003\u00a2Q\u0000\u03fa\u03f8\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fe\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u00a1\u0001\u0000\u0000"+
		"\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u0401\u0003\f\u0006\u0000"+
		"\u0400\u03ff\u0001\u0000\u0000\u0000\u0401\u0404\u0001\u0000\u0000\u0000"+
		"\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000"+
		"\u0403\u0405\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000\u0000\u0000"+
		"\u0405\u0406\u0003R)\u0000\u0406\u0407\u0003H$\u0000\u0407\u0408\u0005"+
		"N\u0000\u0000\u0408\u0409\u0003\u00b8\\\u0000\u0409\u00a3\u0001\u0000"+
		"\u0000\u0000\u040a\u0417\u0003\u00a8T\u0000\u040b\u040d\u0003\u00a6S\u0000"+
		"\u040c\u040b\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000"+
		"\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u0410\u0005K\u0000\u0000\u040f"+
		"\u0411\u0003\u00b8\\\u0000\u0410\u040f\u0001\u0000\u0000\u0000\u0410\u0411"+
		"\u0001\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0414"+
		"\u0005K\u0000\u0000\u0413\u0415\u0003\u00aaU\u0000\u0414\u0413\u0001\u0000"+
		"\u0000\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0417\u0001\u0000"+
		"\u0000\u0000\u0416\u040a\u0001\u0000\u0000\u0000\u0416\u040c\u0001\u0000"+
		"\u0000\u0000\u0417\u00a5\u0001\u0000\u0000\u0000\u0418\u041b\u0003\u008e"+
		"G\u0000\u0419\u041b\u0003\u00aeW\u0000\u041a\u0418\u0001\u0000\u0000\u0000"+
		"\u041a\u0419\u0001\u0000\u0000\u0000\u041b\u00a7\u0001\u0000\u0000\u0000"+
		"\u041c\u041e\u0003\f\u0006\u0000\u041d\u041c\u0001\u0000\u0000\u0000\u041e"+
		"\u0421\u0001\u0000\u0000\u0000\u041f\u041d\u0001\u0000\u0000\u0000\u041f"+
		"\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0001\u0000\u0000\u0000\u0421"+
		"\u041f\u0001\u0000\u0000\u0000\u0422\u0423\u0003P(\u0000\u0423\u0424\u0003"+
		"H$\u0000\u0424\u0425\u0005T\u0000\u0000\u0425\u0426\u0003\u00b8\\\u0000"+
		"\u0426\u00a9\u0001\u0000\u0000\u0000\u0427\u0428\u0003\u00aeW\u0000\u0428"+
		"\u00ab\u0001\u0000\u0000\u0000\u0429\u042a\u0005E\u0000\u0000\u042a\u042b"+
		"\u0003\u00b8\\\u0000\u042b\u042c\u0005F\u0000\u0000\u042c\u00ad\u0001"+
		"\u0000\u0000\u0000\u042d\u0432\u0003\u00b8\\\u0000\u042e\u042f\u0005L"+
		"\u0000\u0000\u042f\u0431\u0003\u00b8\\\u0000\u0430\u042e\u0001\u0000\u0000"+
		"\u0000\u0431\u0434\u0001\u0000\u0000\u0000\u0432\u0430\u0001\u0000\u0000"+
		"\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u00af\u0001\u0000\u0000"+
		"\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0435\u0436\u0003\u00b8\\\u0000"+
		"\u0436\u00b1\u0001\u0000\u0000\u0000\u0437\u0438\u0003\u00b8\\\u0000\u0438"+
		"\u00b3\u0001\u0000\u0000\u0000\u0439\u043a\u00059\u0000\u0000\u043a\u043e"+
		"\u0003\u00b8\\\u0000\u043b\u043d\u0003\u00b8\\\u0000\u043c\u043b\u0001"+
		"\u0000\u0000\u0000\u043d\u0440\u0001\u0000\u0000\u0000\u043e\u043c\u0001"+
		"\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u00b5\u0001"+
		"\u0000\u0000\u0000\u0440\u043e\u0001\u0000\u0000\u0000\u0441\u0442\u0007"+
		"\u0004\u0000\u0000\u0442\u0445\u0003\u00b8\\\u0000\u0443\u0445\u0003\u00b4"+
		"Z\u0000\u0444\u0441\u0001\u0000\u0000\u0000\u0444\u0443\u0001\u0000\u0000"+
		"\u0000\u0445\u00b7\u0001\u0000\u0000\u0000\u0446\u0447\u0006\\\uffff\uffff"+
		"\u0000\u0447\u0454\u0003\u00ba]\u0000\u0448\u0449\u0005 \u0000\u0000\u0449"+
		"\u0454\u0003\u00bc^\u0000\u044a\u044b\u0005E\u0000\u0000\u044b\u044c\u0003"+
		"P(\u0000\u044c\u044d\u0005F\u0000\u0000\u044d\u044e\u0003\u00b8\\\u0011"+
		"\u044e\u0454\u0001\u0000\u0000\u0000\u044f\u0450\u0007\u0005\u0000\u0000"+
		"\u0450\u0454\u0003\u00b8\\\u000f\u0451\u0452\u0007\u0006\u0000\u0000\u0452"+
		"\u0454\u0003\u00b8\\\u000e\u0453\u0446\u0001\u0000\u0000\u0000\u0453\u0448"+
		"\u0001\u0000\u0000\u0000\u0453\u044a\u0001\u0000\u0000\u0000\u0453\u044f"+
		"\u0001\u0000\u0000\u0000\u0453\u0451\u0001\u0000\u0000\u0000\u0454\u04bf"+
		"\u0001\u0000\u0000\u0000\u0455\u0456\n\r\u0000\u0000\u0456\u0457\u0007"+
		"\u0007\u0000\u0000\u0457\u04be\u0003\u00b8\\\u000e\u0458\u0459\n\f\u0000"+
		"\u0000\u0459\u045a\u0007\b\u0000\u0000\u045a\u04be\u0003\u00b8\\\r\u045b"+
		"\u0463\n\u000b\u0000\u0000\u045c\u045d\u0005P\u0000\u0000\u045d\u0464"+
		"\u0005P\u0000\u0000\u045e\u045f\u0005O\u0000\u0000\u045f\u0460\u0005O"+
		"\u0000\u0000\u0460\u0464\u0005O\u0000\u0000\u0461\u0462\u0005O\u0000\u0000"+
		"\u0462\u0464\u0005O\u0000\u0000\u0463\u045c\u0001\u0000\u0000\u0000\u0463"+
		"\u045e\u0001\u0000\u0000\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0464"+
		"\u0465\u0001\u0000\u0000\u0000\u0465\u04be\u0003\u00b8\\\f\u0466\u0467"+
		"\n\n\u0000\u0000\u0467\u0468\u0007\t\u0000\u0000\u0468\u04be\u0003\u00b8"+
		"\\\u000b\u0469\u046a\n\b\u0000\u0000\u046a\u046b\u0007\n\u0000\u0000\u046b"+
		"\u04be\u0003\u00b8\\\t\u046c\u046d\n\u0007\u0000\u0000\u046d\u046e\u0005"+
		"a\u0000\u0000\u046e\u04be\u0003\u00b8\\\b\u046f\u0470\n\u0006\u0000\u0000"+
		"\u0470\u0471\u0005c\u0000\u0000\u0471\u04be\u0003\u00b8\\\u0007\u0472"+
		"\u0473\n\u0005\u0000\u0000\u0473\u0474\u0005b\u0000\u0000\u0474\u04be"+
		"\u0003\u00b8\\\u0006\u0475\u0476\n\u0004\u0000\u0000\u0476\u0477\u0005"+
		"Y\u0000\u0000\u0477\u04be\u0003\u00b8\\\u0005\u0478\u0479\n\u0003\u0000"+
		"\u0000\u0479\u047a\u0005Z\u0000\u0000\u047a\u04be\u0003\u00b8\\\u0004"+
		"\u047b\u047c\n\u0002\u0000\u0000\u047c\u047d\u0005S\u0000\u0000\u047d"+
		"\u047e\u0003\u00b8\\\u0000\u047e\u047f\u0005T\u0000\u0000\u047f\u0480"+
		"\u0003\u00b8\\\u0003\u0480\u04be\u0001\u0000\u0000\u0000\u0481\u0482\n"+
		"\u0001\u0000\u0000\u0482\u0483\u0007\u000b\u0000\u0000\u0483\u04be\u0003"+
		"\u00b8\\\u0001\u0484\u0486\n\u001c\u0000\u0000\u0485\u0487\u0005S\u0000"+
		"\u0000\u0486\u0485\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000"+
		"\u0000\u0487\u0488\u0001\u0000\u0000\u0000\u0488\u0489\u0005M\u0000\u0000"+
		"\u0489\u048a\u0005\u0006\u0000\u0000\u048a\u048c\u0005E\u0000\u0000\u048b"+
		"\u048d\u0003\u00aeW\u0000\u048c\u048b\u0001\u0000\u0000\u0000\u048c\u048d"+
		"\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u04be"+
		"\u0005F\u0000\u0000\u048f\u0490\n\u001b\u0000\u0000\u0490\u0491\u0005"+
		"M\u0000\u0000\u0491\u0492\u0005\u0005\u0000\u0000\u0492\u0494\u0005E\u0000"+
		"\u0000\u0493\u0495\u0003\u00aeW\u0000\u0494\u0493\u0001\u0000\u0000\u0000"+
		"\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u0496\u0001\u0000\u0000\u0000"+
		"\u0496\u04be\u0005F\u0000\u0000\u0497\u0499\n\u001a\u0000\u0000\u0498"+
		"\u049a\u0005S\u0000\u0000\u0499\u0498\u0001\u0000\u0000\u0000\u0499\u049a"+
		"\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b\u049c"+
		"\u0005M\u0000\u0000\u049c\u04be\u0005q\u0000\u0000\u049d\u049e\n\u0019"+
		"\u0000\u0000\u049e\u049f\u0005M\u0000\u0000\u049f\u04be\u0005*\u0000\u0000"+
		"\u04a0\u04a1\n\u0018\u0000\u0000\u04a1\u04a2\u0005M\u0000\u0000\u04a2"+
		"\u04be\u0005 \u0000\u0000\u04a3\u04a4\n\u0017\u0000\u0000\u04a4\u04a5"+
		"\u0005M\u0000\u0000\u04a5\u04be\u0007\f\u0000\u0000\u04a6\u04a7\n\u0016"+
		"\u0000\u0000\u04a7\u04a8\u0005M\u0000\u0000\u04a8\u04a9\u0005(\u0000\u0000"+
		"\u04a9\u04be\u0003\u00d2i\u0000\u04aa\u04ab\n\u0015\u0000\u0000\u04ab"+
		"\u04ac\u0005M\u0000\u0000\u04ac\u04be\u0003\u00cae\u0000\u04ad\u04ae\n"+
		"\u0014\u0000\u0000\u04ae\u04af\u0005I\u0000\u0000\u04af\u04b0\u0003\u00b8"+
		"\\\u0000\u04b0\u04b1\u0005J\u0000\u0000\u04b1\u04be\u0001\u0000\u0000"+
		"\u0000\u04b2\u04b3\n\u0013\u0000\u0000\u04b3\u04b5\u0005E\u0000\u0000"+
		"\u04b4\u04b6\u0003\u00aeW\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000\u04b5"+
		"\u04b6\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000\u04b7"+
		"\u04be\u0005F\u0000\u0000\u04b8\u04b9\n\u0010\u0000\u0000\u04b9\u04be"+
		"\u0007\r\u0000\u0000\u04ba\u04bb\n\t\u0000\u0000\u04bb\u04bc\u0005\u001c"+
		"\u0000\u0000\u04bc\u04be\u0003P(\u0000\u04bd\u0455\u0001\u0000\u0000\u0000"+
		"\u04bd\u0458\u0001\u0000\u0000\u0000\u04bd\u045b\u0001\u0000\u0000\u0000"+
		"\u04bd\u0466\u0001\u0000\u0000\u0000\u04bd\u0469\u0001\u0000\u0000\u0000"+
		"\u04bd\u046c\u0001\u0000\u0000\u0000\u04bd\u046f\u0001\u0000\u0000\u0000"+
		"\u04bd\u0472\u0001\u0000\u0000\u0000\u04bd\u0475\u0001\u0000\u0000\u0000"+
		"\u04bd\u0478\u0001\u0000\u0000\u0000\u04bd\u047b\u0001\u0000\u0000\u0000"+
		"\u04bd\u0481\u0001\u0000\u0000\u0000\u04bd\u0484\u0001\u0000\u0000\u0000"+
		"\u04bd\u048f\u0001\u0000\u0000\u0000\u04bd\u0497\u0001\u0000\u0000\u0000"+
		"\u04bd\u049d\u0001\u0000\u0000\u0000\u04bd\u04a0\u0001\u0000\u0000\u0000"+
		"\u04bd\u04a3\u0001\u0000\u0000\u0000\u04bd\u04a6\u0001\u0000\u0000\u0000"+
		"\u04bd\u04aa\u0001\u0000\u0000\u0000\u04bd\u04ad\u0001\u0000\u0000\u0000"+
		"\u04bd\u04b2\u0001\u0000\u0000\u0000\u04bd\u04b8\u0001\u0000\u0000\u0000"+
		"\u04bd\u04ba\u0001\u0000\u0000\u0000\u04be\u04c1\u0001\u0000\u0000\u0000"+
		"\u04bf\u04bd\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000"+
		"\u04c0\u00b9\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000\u0000"+
		"\u04c2\u04c3\u0005E\u0000\u0000\u04c3\u04c4\u0003\u00b8\\\u0000\u04c4"+
		"\u04c5\u0005F\u0000\u0000\u04c5\u04d9\u0001\u0000\u0000\u0000\u04c6\u04d9"+
		"\u0005*\u0000\u0000\u04c7\u04d9\u0005(\u0000\u0000\u04c8\u04d9\u0003j"+
		"5\u0000\u04c9\u04d9\u0005q\u0000\u0000\u04ca\u04cb\u0003P(\u0000\u04cb"+
		"\u04cc\u0005M\u0000\u0000\u04cc\u04cd\u0005\f\u0000\u0000\u04cd\u04d9"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cf\u0005/\u0000\u0000\u04cf\u04d0\u0005"+
		"M\u0000\u0000\u04d0\u04d9\u0005\f\u0000\u0000\u04d1\u04d5\u0003\u00cc"+
		"f\u0000\u04d2\u04d6\u0003\u00d4j\u0000\u04d3\u04d4\u0005*\u0000\u0000"+
		"\u04d4\u04d6\u0003\u00d6k\u0000\u04d5\u04d2\u0001\u0000\u0000\u0000\u04d5"+
		"\u04d3\u0001\u0000\u0000\u0000\u04d6\u04d9\u0001\u0000\u0000\u0000\u04d7"+
		"\u04d9\u0005\u0002\u0000\u0000\u04d8\u04c2\u0001\u0000\u0000\u0000\u04d8"+
		"\u04c6\u0001\u0000\u0000\u0000\u04d8\u04c7\u0001\u0000\u0000\u0000\u04d8"+
		"\u04c8\u0001\u0000\u0000\u0000\u04d8\u04c9\u0001\u0000\u0000\u0000\u04d8"+
		"\u04ca\u0001\u0000\u0000\u0000\u04d8\u04ce\u0001\u0000\u0000\u0000\u04d8"+
		"\u04d1\u0001\u0000\u0000\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000\u04d9"+
		"\u00bb\u0001\u0000\u0000\u0000\u04da\u04db\u0003\u00ccf\u0000\u04db\u04dc"+
		"\u0003\u00be_\u0000\u04dc\u04dd\u0003\u00c8d\u0000\u04dd\u04e6\u0001\u0000"+
		"\u0000\u0000\u04de\u04e3\u0003\u00be_\u0000\u04df\u04e4\u0003\u00c2a\u0000"+
		"\u04e0\u04e4\u0003\u00c8d\u0000\u04e1\u04e4\u0003\u00c4b\u0000\u04e2\u04e4"+
		"\u0003\u00c6c\u0000\u04e3\u04df\u0001\u0000\u0000\u0000\u04e3\u04e0\u0001"+
		"\u0000\u0000\u0000\u04e3\u04e1\u0001\u0000\u0000\u0000\u04e3\u04e2\u0001"+
		"\u0000\u0000\u0000\u04e4\u04e6\u0001\u0000\u0000\u0000\u04e5\u04da\u0001"+
		"\u0000\u0000\u0000\u04e5\u04de\u0001\u0000\u0000\u0000\u04e6\u00bd\u0001"+
		"\u0000\u0000\u0000\u04e7\u04e9\u0005q\u0000\u0000\u04e8\u04ea\u0003\u00ce"+
		"g\u0000\u04e9\u04e8\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000"+
		"\u0000\u04ea\u04f2\u0001\u0000\u0000\u0000\u04eb\u04ec\u0005M\u0000\u0000"+
		"\u04ec\u04ee\u0005q\u0000\u0000\u04ed\u04ef\u0003\u00ceg\u0000\u04ee\u04ed"+
		"\u0001\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f1"+
		"\u0001\u0000\u0000\u0000\u04f0\u04eb\u0001\u0000\u0000\u0000\u04f1\u04f4"+
		"\u0001\u0000\u0000\u0000\u04f2\u04f0\u0001\u0000\u0000\u0000\u04f2\u04f3"+
		"\u0001\u0000\u0000\u0000\u04f3\u04f9\u0001\u0000\u0000\u0000\u04f4\u04f2"+
		"\u0001\u0000\u0000\u0000\u04f5\u04f9\u0003T*\u0000\u04f6\u04f7\u0005\u0005"+
		"\u0000\u0000\u04f7\u04f9\u0003\u00ceg\u0000\u04f8\u04e7\u0001\u0000\u0000"+
		"\u0000\u04f8\u04f5\u0001\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000"+
		"\u0000\u04f9\u00bf\u0001\u0000\u0000\u0000\u04fa\u04fc\u0005q\u0000\u0000"+
		"\u04fb\u04fd\u0003\u00d0h\u0000\u04fc\u04fb\u0001\u0000\u0000\u0000\u04fc"+
		"\u04fd\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe"+
		"\u04ff\u0003\u00c8d\u0000\u04ff\u00c1\u0001\u0000\u0000\u0000\u0500\u051c"+
		"\u0005I\u0000\u0000\u0501\u0506\u0005J\u0000\u0000\u0502\u0503\u0005I"+
		"\u0000\u0000\u0503\u0505\u0005J\u0000\u0000\u0504\u0502\u0001\u0000\u0000"+
		"\u0000\u0505\u0508\u0001\u0000\u0000\u0000\u0506\u0504\u0001\u0000\u0000"+
		"\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507\u0509\u0001\u0000\u0000"+
		"\u0000\u0508\u0506\u0001\u0000\u0000\u0000\u0509\u051d\u0003L&\u0000\u050a"+
		"\u050b\u0003\u00b8\\\u0000\u050b\u0512\u0005J\u0000\u0000\u050c\u050d"+
		"\u0005I\u0000\u0000\u050d\u050e\u0003\u00b8\\\u0000\u050e\u050f\u0005"+
		"J\u0000\u0000\u050f\u0511\u0001\u0000\u0000\u0000\u0510\u050c\u0001\u0000"+
		"\u0000\u0000\u0511\u0514\u0001\u0000\u0000\u0000\u0512\u0510\u0001\u0000"+
		"\u0000\u0000\u0512\u0513\u0001\u0000\u0000\u0000\u0513\u0519\u0001\u0000"+
		"\u0000\u0000\u0514\u0512\u0001\u0000\u0000\u0000\u0515\u0516\u0005I\u0000"+
		"\u0000\u0516\u0518\u0005J\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000"+
		"\u0518\u051b\u0001\u0000\u0000\u0000\u0519\u0517\u0001\u0000\u0000\u0000"+
		"\u0519\u051a\u0001\u0000\u0000\u0000\u051a\u051d\u0001\u0000\u0000\u0000"+
		"\u051b\u0519\u0001\u0000\u0000\u0000\u051c\u0501\u0001\u0000\u0000\u0000"+
		"\u051c\u050a\u0001\u0000\u0000\u0000\u051d\u00c3\u0001\u0000\u0000\u0000"+
		"\u051e\u053a\u0005G\u0000\u0000\u051f\u053b\u0005H\u0000\u0000\u0520\u0523"+
		"\u0005q\u0000\u0000\u0521\u0523\u0003\u00b8\\\u0000\u0522\u0520\u0001"+
		"\u0000\u0000\u0000\u0522\u0521\u0001\u0000\u0000\u0000\u0523\u0524\u0001"+
		"\u0000\u0000\u0000\u0524\u0527\u0005p\u0000\u0000\u0525\u0528\u0003j5"+
		"\u0000\u0526\u0528\u0003\u00b8\\\u0000\u0527\u0525\u0001\u0000\u0000\u0000"+
		"\u0527\u0526\u0001\u0000\u0000\u0000\u0528\u0535\u0001\u0000\u0000\u0000"+
		"\u0529\u052c\u0005L\u0000\u0000\u052a\u052d\u0005q\u0000\u0000\u052b\u052d"+
		"\u0003\u00b8\\\u0000\u052c\u052a\u0001\u0000\u0000\u0000\u052c\u052b\u0001"+
		"\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000\u0000\u052e\u0531\u0005"+
		"p\u0000\u0000\u052f\u0532\u0003j5\u0000\u0530\u0532\u0003\u00b8\\\u0000"+
		"\u0531\u052f\u0001\u0000\u0000\u0000\u0531\u0530\u0001\u0000\u0000\u0000"+
		"\u0532\u0534\u0001\u0000\u0000\u0000\u0533\u0529\u0001\u0000\u0000\u0000"+
		"\u0534\u0537\u0001\u0000\u0000\u0000\u0535\u0533\u0001\u0000\u0000\u0000"+
		"\u0535\u0536\u0001\u0000\u0000\u0000\u0536\u0538\u0001\u0000\u0000\u0000"+
		"\u0537\u0535\u0001\u0000\u0000\u0000\u0538\u0539\u0005H\u0000\u0000\u0539"+
		"\u053b\u0001\u0000\u0000\u0000\u053a\u051f\u0001\u0000\u0000\u0000\u053a"+
		"\u0522\u0001\u0000\u0000\u0000\u053b\u00c5\u0001\u0000\u0000\u0000\u053c"+
		"\u054e\u0005G\u0000\u0000\u053d\u054f\u0005H\u0000\u0000\u053e\u0541\u0003"+
		"j5\u0000\u053f\u0541\u0003\u00b8\\\u0000\u0540\u053e\u0001\u0000\u0000"+
		"\u0000\u0540\u053f\u0001\u0000\u0000\u0000\u0541\u0549\u0001\u0000\u0000"+
		"\u0000\u0542\u0545\u0005L\u0000\u0000\u0543\u0546\u0003j5\u0000\u0544"+
		"\u0546\u0003\u00b8\\\u0000\u0545\u0543\u0001\u0000\u0000\u0000\u0545\u0544"+
		"\u0001\u0000\u0000\u0000\u0546\u0548\u0001\u0000\u0000\u0000\u0547\u0542"+
		"\u0001\u0000\u0000\u0000\u0548\u054b\u0001\u0000\u0000\u0000\u0549\u0547"+
		"\u0001\u0000\u0000\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a\u054c"+
		"\u0001\u0000\u0000\u0000\u054b\u0549\u0001\u0000\u0000\u0000\u054c\u054d"+
		"\u0005H\u0000\u0000\u054d\u054f\u0001\u0000\u0000\u0000\u054e\u053d\u0001"+
		"\u0000\u0000\u0000\u054e\u0540\u0001\u0000\u0000\u0000\u054f\u00c7\u0001"+
		"\u0000\u0000\u0000\u0550\u0552\u0003\u00d6k\u0000\u0551\u0553\u0003\""+
		"\u0011\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000"+
		"\u0000\u0000\u0553\u00c9\u0001\u0000\u0000\u0000\u0554\u0555\u0003\u00cc"+
		"f\u0000\u0555\u0556\u0003\u00d4j\u0000\u0556\u00cb\u0001\u0000\u0000\u0000"+
		"\u0557\u0558\u0005P\u0000\u0000\u0558\u0559\u0003 \u0010\u0000\u0559\u055a"+
		"\u0005O\u0000\u0000\u055a\u00cd\u0001\u0000\u0000\u0000\u055b\u055c\u0005"+
		"P\u0000\u0000\u055c\u055f\u0005O\u0000\u0000\u055d\u055f\u0003V+\u0000"+
		"\u055e\u055b\u0001\u0000\u0000\u0000\u055e\u055d\u0001\u0000\u0000\u0000"+
		"\u055f\u00cf\u0001\u0000\u0000\u0000\u0560\u0561\u0005P\u0000\u0000\u0561"+
		"\u0564\u0005O\u0000\u0000\u0562\u0564\u0003\u00ccf\u0000\u0563\u0560\u0001"+
		"\u0000\u0000\u0000\u0563\u0562\u0001\u0000\u0000\u0000\u0564\u00d1\u0001"+
		"\u0000\u0000\u0000\u0565\u056c\u0003\u00d6k\u0000\u0566\u0567\u0005M\u0000"+
		"\u0000\u0567\u0569\u0005q\u0000\u0000\u0568\u056a\u0003\u00d6k\u0000\u0569"+
		"\u0568\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000\u0000\u056a"+
		"\u056c\u0001\u0000\u0000\u0000\u056b\u0565\u0001\u0000\u0000\u0000\u056b"+
		"\u0566\u0001\u0000\u0000\u0000\u056c\u00d3\u0001\u0000\u0000\u0000\u056d"+
		"\u056e\u0005(\u0000\u0000\u056e\u0572\u0003\u00d2i\u0000\u056f\u0570\u0005"+
		"q\u0000\u0000\u0570\u0572\u0003\u00d6k\u0000\u0571\u056d\u0001\u0000\u0000"+
		"\u0000\u0571\u056f\u0001\u0000\u0000\u0000\u0572\u00d5\u0001\u0000\u0000"+
		"\u0000\u0573\u0575\u0005E\u0000\u0000\u0574\u0576\u0003\u00aeW\u0000\u0575"+
		"\u0574\u0001\u0000\u0000\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576"+
		"\u0577\u0001\u0000\u0000\u0000\u0577\u0578\u0005F\u0000\u0000\u0578\u00d7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00d9\u00de\u00e4\u00ec\u00f5\u00fa\u0101"+
		"\u0108\u010f\u0116\u011b\u0121\u0132\u0136\u013b\u013f\u0143\u014d\u0155"+
		"\u015c\u0163\u0167\u016a\u016d\u0176\u017c\u0181\u0184\u018a\u0190\u0194"+
		"\u019d\u01a4\u01ad\u01b6\u01bc\u01c1\u01c4\u01d0\u01d3\u01d7\u01df\u01e4"+
		"\u01e8\u01f1\u0203\u020a\u020f\u0218\u0220\u022a\u0232\u023a\u023f\u024b"+
		"\u0251\u0258\u025d\u0265\u0269\u026b\u0276\u027e\u0281\u0285\u028a\u028e"+
		"\u0293\u029d\u02a6\u02a8\u02af\u02b4\u02bd\u02c2\u02c5\u02ca\u02d3\u02e3"+
		"\u02ed\u02f0\u02f6\u02fb\u0305\u030d\u0310\u0313\u0320\u0328\u032d\u0335"+
		"\u0339\u033d\u0341\u0343\u0347\u034d\u0358\u0360\u0368\u0374\u0391\u0394"+
		"\u0397\u039f\u03a3\u03a7\u03b0\u03b5\u03c2\u03c7\u03cc\u03d1\u03d6\u03dd"+
		"\u03ea\u03f3\u03fc\u0402\u040c\u0410\u0414\u0416\u041a\u041f\u0432\u043e"+
		"\u0444\u0453\u0463\u0486\u048c\u0494\u0499\u04b5\u04bd\u04bf\u04d5\u04d8"+
		"\u04e3\u04e5\u04e9\u04ee\u04f2\u04f8\u04fc\u0506\u0512\u0519\u051c\u0522"+
		"\u0527\u052c\u0531\u0535\u053a\u0540\u0545\u0549\u054e\u0552\u055e\u0563"+
		"\u0569\u056b\u0571\u0575";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}

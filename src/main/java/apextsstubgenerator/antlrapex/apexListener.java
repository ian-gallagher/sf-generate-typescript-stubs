// Generated from apex.g4 by ANTLR 4.13.2
package apextsstubgenerator.antlrapex;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link apexParser}.
 */
public interface apexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link apexParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(apexParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(apexParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(apexParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(apexParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(apexParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(apexParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(apexParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(apexParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(apexParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(apexParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(apexParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(apexParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(apexParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(apexParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(apexParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(apexParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(apexParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(apexParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(apexParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(apexParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(apexParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(apexParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(apexParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(apexParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(apexParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(apexParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(apexParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(apexParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(apexParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(apexParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(apexParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(apexParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(apexParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(apexParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(apexParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(apexParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(apexParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(apexParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(apexParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(apexParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(apexParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(apexParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(apexParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(apexParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(apexParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(apexParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(apexParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(apexParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(apexParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(apexParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(apexParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(apexParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(apexParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(apexParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#propertyBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBodyDeclaration(apexParser.PropertyBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#propertyBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBodyDeclaration(apexParser.PropertyBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(apexParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(apexParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(apexParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(apexParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(apexParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(apexParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(apexParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(apexParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(apexParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(apexParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(apexParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(apexParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(apexParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(apexParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(apexParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(apexParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(apexParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(apexParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(apexParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(apexParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(apexParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(apexParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(apexParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(apexParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(apexParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(apexParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(apexParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(apexParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(apexParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(apexParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(apexParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(apexParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(apexParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(apexParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(apexParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(apexParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(apexParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(apexParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(apexParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(apexParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(apexParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(apexParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(apexParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(apexParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(apexParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(apexParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(apexParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(apexParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(apexParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(apexParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(apexParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(apexParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(apexParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(apexParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(apexParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(apexParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(apexParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(apexParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(apexParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(apexParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(apexParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(apexParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(apexParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(apexParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(apexParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(apexParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(apexParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(apexParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(apexParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(apexParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(apexParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(apexParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(apexParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(apexParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(apexParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(apexParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(apexParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(apexParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(apexParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(apexParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(apexParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(apexParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(apexParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(apexParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(apexParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(apexParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(apexParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(apexParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(apexParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(apexParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBlock(apexParser.PropertyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#propertyBlock}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBlock(apexParser.PropertyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(apexParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(apexParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(apexParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(apexParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(apexParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(apexParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(apexParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(apexParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(apexParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(apexParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(apexParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(apexParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(apexParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(apexParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(apexParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(apexParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(apexParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(apexParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(apexParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(apexParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(apexParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(apexParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(apexParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(apexParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(apexParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(apexParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(apexParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(apexParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(apexParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(apexParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(apexParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(apexParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#apexDbUpsertExpression}.
	 * @param ctx the parse tree
	 */
	void enterApexDbUpsertExpression(apexParser.ApexDbUpsertExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#apexDbUpsertExpression}.
	 * @param ctx the parse tree
	 */
	void exitApexDbUpsertExpression(apexParser.ApexDbUpsertExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#apexDbExpression}.
	 * @param ctx the parse tree
	 */
	void enterApexDbExpression(apexParser.ApexDbExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#apexDbExpression}.
	 * @param ctx the parse tree
	 */
	void exitApexDbExpression(apexParser.ApexDbExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(apexParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(apexParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(apexParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(apexParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(apexParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(apexParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(apexParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(apexParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(apexParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(apexParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(apexParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(apexParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#mapCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterMapCreatorRest(apexParser.MapCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#mapCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitMapCreatorRest(apexParser.MapCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#setCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterSetCreatorRest(apexParser.SetCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#setCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitSetCreatorRest(apexParser.SetCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(apexParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(apexParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(apexParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(apexParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(apexParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(apexParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(apexParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(apexParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(apexParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(apexParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(apexParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(apexParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(apexParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(apexParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link apexParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(apexParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link apexParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(apexParser.ArgumentsContext ctx);
}

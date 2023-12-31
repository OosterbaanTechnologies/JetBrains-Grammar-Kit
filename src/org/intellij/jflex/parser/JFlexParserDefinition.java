/*
 * Copyright 2011-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.intellij.jflex.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.intellij.jflex.JFlexLanguage;
import org.intellij.jflex.psi.JFlexTokenType;
import org.intellij.jflex.psi.impl.JFlexFileImpl;
import org.jetbrains.annotations.NotNull;

import static org.intellij.jflex.psi.JFlexTypes.*;

/**
 * @author gregsh
 */
public class JFlexParserDefinition implements ParserDefinition {

  public static final IFileElementType FILE_NODE_TYPE = new IFileElementType("JFLEX_FILE", JFlexLanguage.INSTANCE);
  public static final IElementType FLEX_NEWLINE = new JFlexTokenType("newline");
  public static final TokenSet WS = TokenSet.create(TokenType.WHITE_SPACE, FLEX_NEWLINE);
  public static final TokenSet COMMENTS = TokenSet.create(FLEX_LINE_COMMENT, FLEX_BLOCK_COMMENT);
  public static final TokenSet LITERALS = TokenSet.create(FLEX_STRING);
  public static final TokenSet CHAR_CLASS_OPERATORS = TokenSet.create(FLEX_AMPAMP, FLEX_BARBAR, FLEX_DASHDASH, FLEX_HAT, FLEX_TILDETILDE);
  public static final TokenSet PATTERN_OPERATORS = TokenSet.create(FLEX_BAR, FLEX_BANG, FLEX_DOLLAR, FLEX_PLUS, FLEX_QUESTION, FLEX_STAR, FLEX_TILDE);

  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new JFlexLexer();
  }

  @Override
  public @NotNull PsiParser createParser(Project project) {
    return new JFlexParser();
  }

  @Override
  public @NotNull IFileElementType getFileNodeType() {
    return FILE_NODE_TYPE;
  }

  @Override
  public @NotNull TokenSet getWhitespaceTokens() {
    return WS;
  }

  @Override
  public @NotNull TokenSet getCommentTokens() {
    return COMMENTS;
  }

  @Override
  public @NotNull TokenSet getStringLiteralElements() {
    return LITERALS;
  }

  @Override
  public @NotNull PsiElement createElement(ASTNode astNode) {
    throw new UnsupportedOperationException(astNode.getElementType().toString());
  }

  @Override
  public @NotNull PsiFile createFile(@NotNull FileViewProvider fileViewProvider) {
    return new JFlexFileImpl(fileViewProvider);
  }

  @Override
  public @NotNull SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
    return SpaceRequirements.MAY;
  }
  
}

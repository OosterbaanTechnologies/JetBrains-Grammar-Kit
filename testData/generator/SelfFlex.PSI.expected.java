// ---- JFlexTypes.java -----------------
// license.txt
package org.intellij.jflex.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.jflex.psi.impl.*;
import com.intellij.psi.impl.source.tree.CompositePsiElement;

public interface JFlexTypes {

  IElementType FLEX_CHAR_RANGE = new JFlexCompositeElementType("FLEX_CHAR_RANGE");
  IElementType FLEX_CHOICE_EXPRESSION = new JFlexCompositeElementType("FLEX_CHOICE_EXPRESSION");
  IElementType FLEX_CLASS_EXPRESSION = new JFlexCompositeElementType("FLEX_CLASS_EXPRESSION");
  IElementType FLEX_DECLARATIONS_SECTION = new JFlexCompositeElementType("FLEX_DECLARATIONS_SECTION");
  IElementType FLEX_EXPRESSION = new JFlexCompositeElementType("FLEX_EXPRESSION");
  IElementType FLEX_JAVA_CODE = new JFlexCompositeElementType("FLEX_JAVA_CODE");
  IElementType FLEX_JAVA_NAME = new JFlexCompositeElementType("FLEX_JAVA_NAME");
  IElementType FLEX_JAVA_TYPE = new JFlexCompositeElementType("FLEX_JAVA_TYPE");
  IElementType FLEX_JAVA_TYPE_PARAMETERS = new JFlexCompositeElementType("FLEX_JAVA_TYPE_PARAMETERS");
  IElementType FLEX_LEXICAL_RULES_SECTION = new JFlexCompositeElementType("FLEX_LEXICAL_RULES_SECTION");
  IElementType FLEX_LITERAL_EXPRESSION = new JFlexCompositeElementType("FLEX_LITERAL_EXPRESSION");
  IElementType FLEX_LOOK_AHEAD = new JFlexCompositeElementType("FLEX_LOOK_AHEAD");
  IElementType FLEX_MACRO_DEFINITION = new JFlexCompositeElementType("FLEX_MACRO_DEFINITION");
  IElementType FLEX_MACRO_REFERENCE = new JFlexCompositeElementType("FLEX_MACRO_REFERENCE");
  IElementType FLEX_MACRO_REF_EXPRESSION = new JFlexCompositeElementType("FLEX_MACRO_REF_EXPRESSION");
  IElementType FLEX_NOT_EXPRESSION = new JFlexCompositeElementType("FLEX_NOT_EXPRESSION");
  IElementType FLEX_OPTION = new JFlexCompositeElementType("FLEX_OPTION");
  IElementType FLEX_PAREN_EXPRESSION = new JFlexCompositeElementType("FLEX_PAREN_EXPRESSION");
  IElementType FLEX_PREDEFINED_CLASS_EXPRESSION = new JFlexCompositeElementType("FLEX_PREDEFINED_CLASS_EXPRESSION");
  IElementType FLEX_QUANTIFIER_EXPRESSION = new JFlexCompositeElementType("FLEX_QUANTIFIER_EXPRESSION");
  IElementType FLEX_RULE = new JFlexCompositeElementType("FLEX_RULE");
  IElementType FLEX_SEQUENCE_EXPRESSION = new JFlexCompositeElementType("FLEX_SEQUENCE_EXPRESSION");
  IElementType FLEX_STATE_DECLARATION = new JFlexCompositeElementType("FLEX_STATE_DECLARATION");
  IElementType FLEX_STATE_DEFINITION = new JFlexCompositeElementType("FLEX_STATE_DEFINITION");
  IElementType FLEX_STATE_LIST = new JFlexCompositeElementType("FLEX_STATE_LIST");
  IElementType FLEX_STATE_REFERENCE = new JFlexCompositeElementType("FLEX_STATE_REFERENCE");
  IElementType FLEX_USER_CODE_SECTION = new JFlexCompositeElementType("FLEX_USER_CODE_SECTION");
  IElementType FLEX_USER_VALUE = new JFlexCompositeElementType("FLEX_USER_VALUE");

  IElementType FLEX_AMPAMP = new JFlexTokenType("&&");
  IElementType FLEX_ANGLE1 = new JFlexTokenType("<");
  IElementType FLEX_ANGLE2 = new JFlexTokenType(">");
  IElementType FLEX_BANG = new JFlexTokenType("!");
  IElementType FLEX_BAR = new JFlexTokenType("|");
  IElementType FLEX_BARBAR = new JFlexTokenType("||");
  IElementType FLEX_BLOCK_COMMENT = new JFlexTokenType("block_comment");
  IElementType FLEX_BRACE1 = new JFlexTokenType("{");
  IElementType FLEX_BRACE2 = new JFlexTokenType("}");
  IElementType FLEX_BRACK1 = new JFlexTokenType("[");
  IElementType FLEX_BRACK2 = new JFlexTokenType("]");
  IElementType FLEX_CHAR = new JFlexTokenType("char");
  IElementType FLEX_CHAR_CLASS = new JFlexTokenType("char_class");
  IElementType FLEX_CHAR_ESC = new JFlexTokenType("char_esc");
  IElementType FLEX_COMMA = new JFlexTokenType(",");
  IElementType FLEX_DASH = new JFlexTokenType("-");
  IElementType FLEX_DASHDASH = new JFlexTokenType("--");
  IElementType FLEX_DOLLAR = new JFlexTokenType("$");
  IElementType FLEX_DOT = new JFlexTokenType(".");
  IElementType FLEX_EOF = new JFlexTokenType("<<EOF>>");
  IElementType FLEX_EQ = new JFlexTokenType("=");
  IElementType FLEX_FSLASH = new JFlexTokenType("/");
  IElementType FLEX_HAT = new JFlexTokenType("^");
  IElementType FLEX_ID = new JFlexTokenType("id");
  IElementType FLEX_LINE_COMMENT = new JFlexTokenType("line_comment");
  IElementType FLEX_NUMBER = new JFlexTokenType("number");
  IElementType FLEX_OPT16BIT = new JFlexTokenType("%16bit");
  IElementType FLEX_OPT_7BIT = new JFlexTokenType("%7bit");
  IElementType FLEX_OPT_8BIT = new JFlexTokenType("%8bit");
  IElementType FLEX_OPT_ABSTRACT = new JFlexTokenType("%abstract");
  IElementType FLEX_OPT_APIPRIVATE = new JFlexTokenType("%apiprivate");
  IElementType FLEX_OPT_BUFFER = new JFlexTokenType("%buffer");
  IElementType FLEX_OPT_CASELESS = new JFlexTokenType("%caseless");
  IElementType FLEX_OPT_CHAR = new JFlexTokenType("%char");
  IElementType FLEX_OPT_CLASS = new JFlexTokenType("%class");
  IElementType FLEX_OPT_CODE1 = new JFlexTokenType("%{");
  IElementType FLEX_OPT_CODE2 = new JFlexTokenType("%}");
  IElementType FLEX_OPT_COLUMN = new JFlexTokenType("%column");
  IElementType FLEX_OPT_CTORARG = new JFlexTokenType("%ctorarg");
  IElementType FLEX_OPT_CUP = new JFlexTokenType("%cup");
  IElementType FLEX_OPT_CUPDEBUG = new JFlexTokenType("%cupdebug");
  IElementType FLEX_OPT_CUPSYM = new JFlexTokenType("%cupsym");
  IElementType FLEX_OPT_DEBUG = new JFlexTokenType("%debug");
  IElementType FLEX_OPT_EOF1 = new JFlexTokenType("%eof{");
  IElementType FLEX_OPT_EOF2 = new JFlexTokenType("%eof}");
  IElementType FLEX_OPT_EOFCLOSE = new JFlexTokenType("%eofclose");
  IElementType FLEX_OPT_EOFTHROW = new JFlexTokenType("%eofthrow");
  IElementType FLEX_OPT_EOFTHROW1 = new JFlexTokenType("%eofthrow{");
  IElementType FLEX_OPT_EOFTHROW2 = new JFlexTokenType("%eofthrow}");
  IElementType FLEX_OPT_EOFVAL1 = new JFlexTokenType("%eofval{");
  IElementType FLEX_OPT_EOFVAL2 = new JFlexTokenType("%eofval}");
  IElementType FLEX_OPT_EXTENDS = new JFlexTokenType("%extends");
  IElementType FLEX_OPT_FINAL = new JFlexTokenType("%final");
  IElementType FLEX_OPT_FULL = new JFlexTokenType("%full");
  IElementType FLEX_OPT_FUNCTION = new JFlexTokenType("%function");
  IElementType FLEX_OPT_IGNORECASE = new JFlexTokenType("%ignorecase");
  IElementType FLEX_OPT_IMPLEMENTS = new JFlexTokenType("%implements");
  IElementType FLEX_OPT_INCLUDE = new JFlexTokenType("%include");
  IElementType FLEX_OPT_INIT1 = new JFlexTokenType("%init{");
  IElementType FLEX_OPT_INIT2 = new JFlexTokenType("%init}");
  IElementType FLEX_OPT_INITTHROW = new JFlexTokenType("%initthrow");
  IElementType FLEX_OPT_INITTHROW1 = new JFlexTokenType("%initthrow{");
  IElementType FLEX_OPT_INITTHROW2 = new JFlexTokenType("%initthrow}");
  IElementType FLEX_OPT_INT = new JFlexTokenType("%int");
  IElementType FLEX_OPT_INTEGER = new JFlexTokenType("%integer");
  IElementType FLEX_OPT_INTWRAP = new JFlexTokenType("%intwrap");
  IElementType FLEX_OPT_LINE = new JFlexTokenType("%line");
  IElementType FLEX_OPT_NOTUNIX = new JFlexTokenType("%notunix");
  IElementType FLEX_OPT_PUBLIC = new JFlexTokenType("%public");
  IElementType FLEX_OPT_SCANERROR = new JFlexTokenType("%scanerror");
  IElementType FLEX_OPT_STANDALONE = new JFlexTokenType("%standalone");
  IElementType FLEX_OPT_STATE = new JFlexTokenType("%state");
  IElementType FLEX_OPT_TYPE = new JFlexTokenType("%type");
  IElementType FLEX_OPT_UNICODE = new JFlexTokenType("%unicode");
  IElementType FLEX_OPT_XSTATE = new JFlexTokenType("%xstate");
  IElementType FLEX_OPT_YYEOF = new JFlexTokenType("%yyeof");
  IElementType FLEX_OPT_YYLEXTHROW = new JFlexTokenType("%yylexthrow");
  IElementType FLEX_OPT_YYLEXTHROW1 = new JFlexTokenType("%yylexthrow{");
  IElementType FLEX_OPT_YYLEXTHROW2 = new JFlexTokenType("%yylexthrow}");
  IElementType FLEX_PAREN1 = new JFlexTokenType("(");
  IElementType FLEX_PAREN2 = new JFlexTokenType(")");
  IElementType FLEX_PLUS = new JFlexTokenType("+");
  IElementType FLEX_QUESTION = new JFlexTokenType("?");
  IElementType FLEX_RAW = new JFlexTokenType("code block");
  IElementType FLEX_STAR = new JFlexTokenType("*");
  IElementType FLEX_STRING = new JFlexTokenType("string");
  IElementType FLEX_TILDE = new JFlexTokenType("~");
  IElementType FLEX_TILDETILDE = new JFlexTokenType("~~");
  IElementType FLEX_TWO_PERCS = new JFlexTokenType("%%");
  IElementType FLEX_UNCLOSED = new JFlexTokenType("unclosed");
  IElementType FLEX_VERSION = new JFlexTokenType("version");

  class Factory {
    public static CompositePsiElement createElement(IElementType type) {
       if (type == FLEX_CHAR_RANGE) {
        return new JFlexCharRangeImpl(type);
      }
      else if (type == FLEX_CHOICE_EXPRESSION) {
        return new JFlexChoiceExpressionImpl(type);
      }
      else if (type == FLEX_CLASS_EXPRESSION) {
        return new JFlexClassExpressionImpl(type);
      }
      else if (type == FLEX_DECLARATIONS_SECTION) {
        return new JFlexDeclarationsSectionImpl(type);
      }
      else if (type == FLEX_JAVA_CODE) {
        return new JFlexJavaCodeImpl(type);
      }
      else if (type == FLEX_JAVA_NAME) {
        return new JFlexJavaNameImpl(type);
      }
      else if (type == FLEX_JAVA_TYPE) {
        return new JFlexJavaTypeImpl(type);
      }
      else if (type == FLEX_JAVA_TYPE_PARAMETERS) {
        return new JFlexJavaTypeParametersImpl(type);
      }
      else if (type == FLEX_LEXICAL_RULES_SECTION) {
        return new JFlexLexicalRulesSectionImpl(type);
      }
      else if (type == FLEX_LITERAL_EXPRESSION) {
        return new JFlexLiteralExpressionImpl(type);
      }
      else if (type == FLEX_LOOK_AHEAD) {
        return new JFlexLookAheadImpl(type);
      }
      else if (type == FLEX_MACRO_DEFINITION) {
        return new JFlexMacroDefinitionImpl(type);
      }
      else if (type == FLEX_MACRO_REFERENCE) {
        return new JFlexMacroReferenceImpl(type);
      }
      else if (type == FLEX_MACRO_REF_EXPRESSION) {
        return new JFlexMacroRefExpressionImpl(type);
      }
      else if (type == FLEX_NOT_EXPRESSION) {
        return new JFlexNotExpressionImpl(type);
      }
      else if (type == FLEX_OPTION) {
        return new JFlexOptionImpl(type);
      }
      else if (type == FLEX_PAREN_EXPRESSION) {
        return new JFlexParenExpressionImpl(type);
      }
      else if (type == FLEX_PREDEFINED_CLASS_EXPRESSION) {
        return new JFlexPredefinedClassExpressionImpl(type);
      }
      else if (type == FLEX_QUANTIFIER_EXPRESSION) {
        return new JFlexQuantifierExpressionImpl(type);
      }
      else if (type == FLEX_RULE) {
        return new JFlexRuleImpl(type);
      }
      else if (type == FLEX_SEQUENCE_EXPRESSION) {
        return new JFlexSequenceExpressionImpl(type);
      }
      else if (type == FLEX_STATE_DECLARATION) {
        return new JFlexStateDeclarationImpl(type);
      }
      else if (type == FLEX_STATE_DEFINITION) {
        return new JFlexStateDefinitionImpl(type);
      }
      else if (type == FLEX_STATE_LIST) {
        return new JFlexStateListImpl(type);
      }
      else if (type == FLEX_STATE_REFERENCE) {
        return new JFlexStateReferenceImpl(type);
      }
      else if (type == FLEX_USER_CODE_SECTION) {
        return new JFlexUserCodeSectionImpl(type);
      }
      else if (type == FLEX_USER_VALUE) {
        return new JFlexUserValueImpl(type);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
// ---- JFlexCharRange.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexCharRange extends JFlexClassExpression {

}
// ---- JFlexChoiceExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexChoiceExpression extends JFlexExpression {

  @NotNull
  List<JFlexExpression> getExpressionList();

}
// ---- JFlexClassExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexClassExpression extends JFlexExpression {

  @NotNull
  List<JFlexExpression> getExpressionList();

}
// ---- JFlexDeclarationsSection.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexDeclarationsSection extends JFlexFileSection {

  @NotNull
  List<JFlexMacroDefinition> getMacroDefinitionList();

  @NotNull
  List<JFlexOption> getOptionList();

  @NotNull
  List<JFlexStateDeclaration> getStateDeclarationList();

}
// ---- JFlexExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexExpression extends JFlexComposite {

}
// ---- JFlexFileSection.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexFileSection extends JFlexComposite {

}
// ---- JFlexJavaCode.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface JFlexJavaCode extends JFlexComposite {

  PsiReference[] getReferences();

}
// ---- JFlexJavaName.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface JFlexJavaName extends JFlexComposite {

  PsiReference @NotNull [] getReferences();

}
// ---- JFlexJavaType.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexJavaType extends JFlexComposite {

  @NotNull
  JFlexJavaName getJavaName();

  @Nullable
  JFlexJavaTypeParameters getJavaTypeParameters();

}
// ---- JFlexJavaTypeParameters.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexJavaTypeParameters extends JFlexComposite {

  @NotNull
  List<JFlexJavaType> getJavaTypeList();

}
// ---- JFlexLexicalRulesSection.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexLexicalRulesSection extends JFlexFileSection {

  @NotNull
  List<JFlexOption> getOptionList();

  @NotNull
  List<JFlexRule> getRuleList();

}
// ---- JFlexLiteralExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexLiteralExpression extends JFlexExpression {

}
// ---- JFlexLookAhead.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexLookAhead extends JFlexComposite {

  @Nullable
  JFlexExpression getExpression();

}
// ---- JFlexMacroDefinition.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public interface JFlexMacroDefinition extends JFlexNamedElement {

  @Nullable
  JFlexExpression getExpression();

  @NotNull
  PsiElement getId();

  @NotNull String getName();

  @NotNull PsiNameIdentifierOwner setName(String p1);

  @NotNull PsiElement getNameIdentifier();

}
// ---- JFlexMacroRefExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexMacroRefExpression extends JFlexExpression {

  @NotNull
  JFlexMacroReference getMacroReference();

}
// ---- JFlexMacroReference.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface JFlexMacroReference extends JFlexComposite {

  @NotNull
  PsiElement getId();

  @NotNull PsiReference getReference();

}
// ---- JFlexNotExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexNotExpression extends JFlexExpression {

  @Nullable
  JFlexExpression getExpression();

}
// ---- JFlexOption.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexOption extends JFlexComposite {

}
// ---- JFlexParenExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexParenExpression extends JFlexExpression {

  @Nullable
  JFlexExpression getExpression();

}
// ---- JFlexPredefinedClassExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexPredefinedClassExpression extends JFlexExpression {

}
// ---- JFlexQuantifierExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexQuantifierExpression extends JFlexExpression {

  @NotNull
  JFlexExpression getExpression();

}
// ---- JFlexRule.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexRule extends JFlexComposite {

  @Nullable
  JFlexExpression getExpression();

  @Nullable
  JFlexJavaCode getJavaCode();

  @Nullable
  JFlexLookAhead getLookAhead();

  @NotNull
  List<JFlexOption> getOptionList();

  @NotNull
  List<JFlexRule> getRuleList();

  @Nullable
  JFlexStateList getStateList();

}
// ---- JFlexSequenceExpression.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexSequenceExpression extends JFlexExpression {

  @NotNull
  List<JFlexExpression> getExpressionList();

}
// ---- JFlexStateDeclaration.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexStateDeclaration extends JFlexComposite {

  @NotNull
  List<JFlexStateDefinition> getStateDefinitionList();

}
// ---- JFlexStateDefinition.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public interface JFlexStateDefinition extends JFlexNamedElement {

  @NotNull
  PsiElement getId();

  @NotNull String getName();

  @NotNull PsiNameIdentifierOwner setName(String p1);

  @NotNull PsiElement getNameIdentifier();

}
// ---- JFlexStateList.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexStateList extends JFlexComposite {

  @NotNull
  List<JFlexStateReference> getStateReferenceList();

}
// ---- JFlexStateReference.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface JFlexStateReference extends JFlexComposite {

  @NotNull
  PsiElement getId();

  @NotNull PsiReference getReference();

}
// ---- JFlexUserCodeSection.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexUserCodeSection extends JFlexFileSection {

  @Nullable
  JFlexJavaCode getJavaCode();

}
// ---- JFlexUserValue.java -----------------
// license.txt
package org.intellij.jflex.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JFlexUserValue extends JFlexComposite {

}
// ---- JFlexCharRangeImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexCharRangeImpl extends JFlexClassExpressionImpl implements JFlexCharRange {

  public JFlexCharRangeImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitCharRange(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

}
// ---- JFlexChoiceExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexChoiceExpressionImpl extends JFlexExpressionImpl implements JFlexChoiceExpression {

  public JFlexChoiceExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitChoiceExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexExpression.class);
  }

}
// ---- JFlexClassExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexClassExpressionImpl extends JFlexExpressionImpl implements JFlexClassExpression {

  public JFlexClassExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitClassExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexExpression.class);
  }

}
// ---- JFlexDeclarationsSectionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexDeclarationsSectionImpl extends JFlexFileSectionImpl implements JFlexDeclarationsSection {

  public JFlexDeclarationsSectionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitDeclarationsSection(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexMacroDefinition> getMacroDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexMacroDefinition.class);
  }

  @Override
  @NotNull
  public List<JFlexOption> getOptionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexOption.class);
  }

  @Override
  @NotNull
  public List<JFlexStateDeclaration> getStateDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexStateDeclaration.class);
  }

}
// ---- JFlexExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public abstract class JFlexExpressionImpl extends JFlexCompositeImpl implements JFlexExpression {

  public JFlexExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

}
// ---- JFlexFileSectionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexFileSectionImpl extends JFlexCompositeImpl implements JFlexFileSection {

  public JFlexFileSectionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitFileSection(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

}
// ---- JFlexJavaCodeImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;

public class JFlexJavaCodeImpl extends JFlexJavaCodeInjectionHostImpl implements JFlexJavaCode {

  public JFlexJavaCodeImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitJavaCode(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public PsiReference[] getReferences() {
    return JFlexPsiImplUtil.getReferences(this);
  }

}
// ---- JFlexJavaNameImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;

public class JFlexJavaNameImpl extends JFlexCompositeImpl implements JFlexJavaName {

  public JFlexJavaNameImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitJavaName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  public PsiReference @NotNull [] getReferences() {
    return JFlexPsiImplUtil.getReferences(this);
  }

}
// ---- JFlexJavaTypeImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexJavaTypeImpl extends JFlexCompositeImpl implements JFlexJavaType {

  public JFlexJavaTypeImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitJavaType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JFlexJavaName getJavaName() {
    return PsiTreeUtil.getChildOfType(this, JFlexJavaName.class);
  }

  @Override
  @Nullable
  public JFlexJavaTypeParameters getJavaTypeParameters() {
    return PsiTreeUtil.getChildOfType(this, JFlexJavaTypeParameters.class);
  }

}
// ---- JFlexJavaTypeParametersImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexJavaTypeParametersImpl extends JFlexCompositeImpl implements JFlexJavaTypeParameters {

  public JFlexJavaTypeParametersImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitJavaTypeParameters(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexJavaType> getJavaTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexJavaType.class);
  }

}
// ---- JFlexLexicalRulesSectionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexLexicalRulesSectionImpl extends JFlexFileSectionImpl implements JFlexLexicalRulesSection {

  public JFlexLexicalRulesSectionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitLexicalRulesSection(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexOption> getOptionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexOption.class);
  }

  @Override
  @NotNull
  public List<JFlexRule> getRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexRule.class);
  }

}
// ---- JFlexLiteralExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexLiteralExpressionImpl extends JFlexExpressionImpl implements JFlexLiteralExpression {

  public JFlexLiteralExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitLiteralExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

}
// ---- JFlexLookAheadImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexLookAheadImpl extends JFlexCompositeImpl implements JFlexLookAhead {

  public JFlexLookAheadImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitLookAhead(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JFlexExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, JFlexExpression.class);
  }

}
// ---- JFlexMacroDefinitionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.tree.IElementType;

public class JFlexMacroDefinitionImpl extends JFlexCompositeImpl implements JFlexMacroDefinition {

  public JFlexMacroDefinitionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitMacroDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JFlexExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, JFlexExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findPsiChildByType(FLEX_ID);
  }

  @Override
  public @NotNull String getName() {
    return JFlexPsiImplUtil.getName(this);
  }

  @Override
  public @NotNull PsiNameIdentifierOwner setName(String p1) {
    return JFlexPsiImplUtil.setName(this, p1);
  }

  @Override
  public @NotNull PsiElement getNameIdentifier() {
    return JFlexPsiImplUtil.getNameIdentifier(this);
  }

}
// ---- JFlexMacroRefExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexMacroRefExpressionImpl extends JFlexExpressionImpl implements JFlexMacroRefExpression {

  public JFlexMacroRefExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitMacroRefExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JFlexMacroReference getMacroReference() {
    return PsiTreeUtil.getChildOfType(this, JFlexMacroReference.class);
  }

}
// ---- JFlexMacroReferenceImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;

public class JFlexMacroReferenceImpl extends JFlexCompositeImpl implements JFlexMacroReference {

  public JFlexMacroReferenceImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitMacroReference(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findPsiChildByType(FLEX_ID);
  }

  @Override
  public @NotNull PsiReference getReference() {
    return JFlexPsiImplUtil.getReference(this);
  }

}
// ---- JFlexNotExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexNotExpressionImpl extends JFlexExpressionImpl implements JFlexNotExpression {

  public JFlexNotExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitNotExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JFlexExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, JFlexExpression.class);
  }

}
// ---- JFlexOptionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexOptionImpl extends JFlexCompositeImpl implements JFlexOption {

  public JFlexOptionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitOption(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

}
// ---- JFlexParenExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexParenExpressionImpl extends JFlexExpressionImpl implements JFlexParenExpression {

  public JFlexParenExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitParenExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JFlexExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, JFlexExpression.class);
  }

}
// ---- JFlexPredefinedClassExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexPredefinedClassExpressionImpl extends JFlexExpressionImpl implements JFlexPredefinedClassExpression {

  public JFlexPredefinedClassExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitPredefinedClassExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

}
// ---- JFlexQuantifierExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexQuantifierExpressionImpl extends JFlexExpressionImpl implements JFlexQuantifierExpression {

  public JFlexQuantifierExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitQuantifierExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JFlexExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, JFlexExpression.class);
  }

}
// ---- JFlexRuleImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexRuleImpl extends JFlexCompositeImpl implements JFlexRule {

  public JFlexRuleImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitRule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JFlexExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, JFlexExpression.class);
  }

  @Override
  @Nullable
  public JFlexJavaCode getJavaCode() {
    return PsiTreeUtil.getChildOfType(this, JFlexJavaCode.class);
  }

  @Override
  @Nullable
  public JFlexLookAhead getLookAhead() {
    return PsiTreeUtil.getChildOfType(this, JFlexLookAhead.class);
  }

  @Override
  @NotNull
  public List<JFlexOption> getOptionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexOption.class);
  }

  @Override
  @NotNull
  public List<JFlexRule> getRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexRule.class);
  }

  @Override
  @Nullable
  public JFlexStateList getStateList() {
    return PsiTreeUtil.getChildOfType(this, JFlexStateList.class);
  }

}
// ---- JFlexSequenceExpressionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexSequenceExpressionImpl extends JFlexExpressionImpl implements JFlexSequenceExpression {

  public JFlexSequenceExpressionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitSequenceExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexExpression.class);
  }

}
// ---- JFlexStateDeclarationImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexStateDeclarationImpl extends JFlexCompositeImpl implements JFlexStateDeclaration {

  public JFlexStateDeclarationImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitStateDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexStateDefinition> getStateDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexStateDefinition.class);
  }

}
// ---- JFlexStateDefinitionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.tree.IElementType;

public class JFlexStateDefinitionImpl extends JFlexCompositeImpl implements JFlexStateDefinition {

  public JFlexStateDefinitionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitStateDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findPsiChildByType(FLEX_ID);
  }

  @Override
  public @NotNull String getName() {
    return JFlexPsiImplUtil.getName(this);
  }

  @Override
  public @NotNull PsiNameIdentifierOwner setName(String p1) {
    return JFlexPsiImplUtil.setName(this, p1);
  }

  @Override
  public @NotNull PsiElement getNameIdentifier() {
    return JFlexPsiImplUtil.getNameIdentifier(this);
  }

}
// ---- JFlexStateListImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexStateListImpl extends JFlexCompositeImpl implements JFlexStateList {

  public JFlexStateListImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitStateList(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JFlexStateReference> getStateReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JFlexStateReference.class);
  }

}
// ---- JFlexStateReferenceImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.PsiReference;
import com.intellij.psi.tree.IElementType;

public class JFlexStateReferenceImpl extends JFlexCompositeImpl implements JFlexStateReference {

  public JFlexStateReferenceImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitStateReference(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findPsiChildByType(FLEX_ID);
  }

  @Override
  public @NotNull PsiReference getReference() {
    return JFlexPsiImplUtil.getReference(this);
  }

}
// ---- JFlexUserCodeSectionImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexUserCodeSectionImpl extends JFlexFileSectionImpl implements JFlexUserCodeSection {

  public JFlexUserCodeSectionImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitUserCodeSection(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JFlexJavaCode getJavaCode() {
    return PsiTreeUtil.getChildOfType(this, JFlexJavaCode.class);
  }

}
// ---- JFlexUserValueImpl.java -----------------
// license.txt
package org.intellij.jflex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.jflex.psi.JFlexTypes.*;
import org.intellij.jflex.psi.*;
import com.intellij.psi.tree.IElementType;

public class JFlexUserValueImpl extends JFlexCompositeImpl implements JFlexUserValue {

  public JFlexUserValueImpl(IElementType type) {
    super(type);
  }

  @Override
  public <R> R accept(@NotNull JFlexVisitor<R> visitor) {
    return visitor.visitUserValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JFlexVisitor) accept((JFlexVisitor)visitor);
    else super.accept(visitor);
  }

}
// ---- JFlexVisitor.java -----------------
// license.txt
package org.intellij.jflex.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;

public class JFlexVisitor<R> extends PsiElementVisitor {

  public R visitCharRange(@NotNull JFlexCharRange o) {
    return visitClassExpression(o);
  }

  public R visitChoiceExpression(@NotNull JFlexChoiceExpression o) {
    return visitExpression(o);
  }

  public R visitClassExpression(@NotNull JFlexClassExpression o) {
    return visitExpression(o);
  }

  public R visitDeclarationsSection(@NotNull JFlexDeclarationsSection o) {
    return visitFileSection(o);
  }

  public R visitExpression(@NotNull JFlexExpression o) {
    return visitComposite(o);
  }

  public R visitFileSection(@NotNull JFlexFileSection o) {
    return visitComposite(o);
  }

  public R visitJavaCode(@NotNull JFlexJavaCode o) {
    return visitComposite(o);
  }

  public R visitJavaName(@NotNull JFlexJavaName o) {
    return visitComposite(o);
  }

  public R visitJavaType(@NotNull JFlexJavaType o) {
    return visitComposite(o);
  }

  public R visitJavaTypeParameters(@NotNull JFlexJavaTypeParameters o) {
    return visitComposite(o);
  }

  public R visitLexicalRulesSection(@NotNull JFlexLexicalRulesSection o) {
    return visitFileSection(o);
  }

  public R visitLiteralExpression(@NotNull JFlexLiteralExpression o) {
    return visitExpression(o);
  }

  public R visitLookAhead(@NotNull JFlexLookAhead o) {
    return visitComposite(o);
  }

  public R visitMacroDefinition(@NotNull JFlexMacroDefinition o) {
    return visitNamedElement(o);
  }

  public R visitMacroRefExpression(@NotNull JFlexMacroRefExpression o) {
    return visitExpression(o);
  }

  public R visitMacroReference(@NotNull JFlexMacroReference o) {
    return visitComposite(o);
  }

  public R visitNotExpression(@NotNull JFlexNotExpression o) {
    return visitExpression(o);
  }

  public R visitOption(@NotNull JFlexOption o) {
    return visitComposite(o);
  }

  public R visitParenExpression(@NotNull JFlexParenExpression o) {
    return visitExpression(o);
  }

  public R visitPredefinedClassExpression(@NotNull JFlexPredefinedClassExpression o) {
    return visitExpression(o);
  }

  public R visitQuantifierExpression(@NotNull JFlexQuantifierExpression o) {
    return visitExpression(o);
  }

  public R visitRule(@NotNull JFlexRule o) {
    return visitComposite(o);
  }

  public R visitSequenceExpression(@NotNull JFlexSequenceExpression o) {
    return visitExpression(o);
  }

  public R visitStateDeclaration(@NotNull JFlexStateDeclaration o) {
    return visitComposite(o);
  }

  public R visitStateDefinition(@NotNull JFlexStateDefinition o) {
    return visitNamedElement(o);
  }

  public R visitStateList(@NotNull JFlexStateList o) {
    return visitComposite(o);
  }

  public R visitStateReference(@NotNull JFlexStateReference o) {
    return visitComposite(o);
  }

  public R visitUserCodeSection(@NotNull JFlexUserCodeSection o) {
    return visitFileSection(o);
  }

  public R visitUserValue(@NotNull JFlexUserValue o) {
    return visitComposite(o);
  }

  public R visitNamedElement(@NotNull JFlexNamedElement o) {
    return visitComposite(o);
  }

  public R visitComposite(@NotNull JFlexComposite o) {
    visitElement(o);
    return null;
  }

}
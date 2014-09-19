// This is a generated file. Not intended for manual editing.
package generated.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KtClassDeclaration extends PsiElement {

  @NotNull
  List<KtAnnotation> getAnnotationList();

  @Nullable
  KtClassBody getClassBody();

  @Nullable
  KtDelegationSpecifierExt getDelegationSpecifierExt();

  @Nullable
  KtEnumClassBody getEnumClassBody();

  @Nullable
  KtModifierList getModifierList();

  @Nullable
  KtPrimaryConstructorModifierList getPrimaryConstructorModifierList();

  @Nullable
  KtTypeConstraintExt getTypeConstraintExt();

  @Nullable
  KtTypeParameters getTypeParameters();

  @Nullable
  KtValueParameters getValueParameters();

}

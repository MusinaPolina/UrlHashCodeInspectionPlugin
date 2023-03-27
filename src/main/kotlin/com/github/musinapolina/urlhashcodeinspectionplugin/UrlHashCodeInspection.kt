package com.github.musinapolina.urlhashcodeinspectionplugin

import com.intellij.codeInspection.AbstractBaseJavaLocalInspectionTool
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.JavaElementVisitor
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.PsiMethodCallExpression

class UrlHashCodeInspection : AbstractBaseJavaLocalInspectionTool() {
    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return object : JavaElementVisitor() {
            override fun visitMethodCallExpression(expression: PsiMethodCallExpression?) {
                super.visitMethodCallExpression(expression)
                if (expression != null && expression.methodExpression.referenceName == "hashCode") {
                    val method = expression.resolveMethod()
                    if (method?.containingClass?.qualifiedName == "java.net.URL" && method.name == "hashCode") {
                        holder.registerProblem(
                            expression,
                            InspectionBundle.message("inspection.url.hashcode.problem.descriptor")
                        )
                    }
                }
            }
        }
    }
}

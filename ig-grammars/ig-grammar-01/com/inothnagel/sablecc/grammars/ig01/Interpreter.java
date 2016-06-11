package com.inothnagel.sablecc.grammars.ig01;

import com.inothnagel.sablecc.grammars.ig01.generated.analysis.DepthFirstAdapter;
import com.inothnagel.sablecc.grammars.ig01.generated.node.*;

/**
 * Created by inothnagel on 2016/06/11.
 */
public class Interpreter extends DepthFirstAdapter {
    public void caseANumberFactor(ANumberFactor node) {
        int arabicNumber = new NumberConverter().toArabic(node.getNumber());
        System.out.print(arabicNumber);
    }

    public void inAMulTerm(AMulTerm node)
    {
        System.out.print("(");
    }

    public void outAMulTerm(AMulTerm node)
    {
        System.out.print(")");
    }

    public void inADivTerm(ADivTerm node)
    {
        System.out.print("(");
    }

    public void outADivTerm(ADivTerm node)
    {
        System.out.print(")");
    }

    public void inAAddExpression(AAddExpression node) {
        System.out.print("(");
    }

    public void outAAddExpression(AAddExpression node) {
        System.out.print(")");
    }

    public void inAMinExpression(AMinExpression node) {
        System.out.print("(");
    }

    public void outAMinExpression(AMinExpression node) {
        System.out.print(")");
    }

    public void caseTAdd(TAdd node) {
        System.out.print("+");
    }

    public void caseTMin(TMin node) {
        System.out.print("-");
    }

    public void caseTMul(TMul node) {
        System.out.print("*");
    }

    public void caseTDiv(TDiv node) {
        System.out.print("/");
    }
}

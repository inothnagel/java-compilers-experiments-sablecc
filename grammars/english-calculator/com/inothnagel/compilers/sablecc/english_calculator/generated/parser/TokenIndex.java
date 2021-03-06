/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.compilers.sablecc.english_calculator.generated.parser;

import com.inothnagel.compilers.sablecc.english_calculator.generated.node.*;
import com.inothnagel.compilers.sablecc.english_calculator.generated.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 0;
    }

    @Override
    public void caseTAdd(@SuppressWarnings("unused") TAdd node)
    {
        this.index = 1;
    }

    @Override
    public void caseTMin(@SuppressWarnings("unused") TMin node)
    {
        this.index = 2;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 3;
    }

    @Override
    public void caseTMul(@SuppressWarnings("unused") TMul node)
    {
        this.index = 4;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 5;
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.inothnagel.compilers.visual_shapes_manipulator.generated.node;

import com.inothnagel.compilers.visual_shapes_manipulator.generated.analysis.*;

@SuppressWarnings("nls")
public final class TA extends Token
{
    public TA()
    {
        super.setText("a");
    }

    public TA(int line, int pos)
    {
        super.setText("a");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TA(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTA(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TA text.");
    }
}
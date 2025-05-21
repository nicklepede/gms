package com.google.android.gms.googlehelp.fragments;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class HelpConsoleNestedScrollView extends NestedScrollView {
    public HelpConsoleNestedScrollView(Context context) {
        super(context);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    public HelpConsoleNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HelpConsoleNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

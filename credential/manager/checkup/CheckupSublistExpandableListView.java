package com.google.android.gms.credential.manager.checkup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CheckupSublistExpandableListView extends ExpandableListView {
    public CheckupSublistExpandableListView(Context context) {
        super(context);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (isGroupExpanded(0)) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, JGCastService.FLAG_USE_TDLS));
        } else {
            super.onMeasure(i, 0);
        }
    }

    public CheckupSublistExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CheckupSublistExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.chip.ChipGroup;
import defpackage.elja;
import defpackage.iwe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CenteredChipGroup extends ChipGroup {
    private final ArrayList f;

    public CenteredChipGroup(Context context) {
        super(context);
        this.f = new ArrayList();
    }

    private final void f(List list, int i, int i2) {
        int right;
        int left;
        int[] iArr = iwe.a;
        boolean z = getLayoutDirection() == 1;
        if (z) {
            right = ((View) list.get(0)).getRight();
            left = ((View) elja.p(list)).getLeft();
        } else {
            right = ((View) elja.p(list)).getRight();
            left = ((View) list.get(0)).getLeft();
        }
        int i3 = right - left;
        int i4 = i2 - i;
        int right2 = (z ? (i4 + i3) / 2 : (i4 - i3) / 2) - (z ? ((View) list.get(0)).getRight() : ((View) list.get(0)).getLeft());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.layout(view.getLeft() + right2, view.getTop(), view.getRight() + right2, view.getBottom());
        }
    }

    @Override // defpackage.eebu, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 0) {
            return;
        }
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.add(getChildAt(0));
        for (int i5 = 1; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            View view = (View) elja.p(arrayList);
            int e = e(childAt);
            int e2 = e(view);
            if (childAt.getVisibility() != 8) {
                if (e2 != e) {
                    f(arrayList, i, i3);
                    arrayList.clear();
                }
                arrayList.add(childAt);
            }
        }
        f(arrayList, i, i3);
    }

    public CenteredChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new ArrayList();
    }

    public CenteredChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ArrayList();
    }
}

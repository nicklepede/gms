package com.google.android.gms.libs.layoutpreference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.preference.Preference;
import com.google.android.gms.R;
import defpackage.bwqs;
import defpackage.kmp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LayoutPreference extends Preference {
    private boolean a;
    private boolean b;
    private final View c;

    public LayoutPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void a(kmp kmpVar) {
        boolean z = this.v;
        View view = kmpVar.a;
        view.setFocusable(z);
        view.setClickable(z);
        kmpVar.v = this.a;
        kmpVar.w = this.b;
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        View view2 = this.c;
        ViewGroup viewGroup = (ViewGroup) view2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view2);
        }
        frameLayout.addView(view2);
    }

    public final View k(int i) {
        View view = this.c;
        return view.getId() == i ? view : view.findViewById(i);
    }

    public LayoutPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bwqs.a);
        this.a = obtainStyledAttributes.getBoolean(16, false);
        this.b = obtainStyledAttributes.getBoolean(17, false);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bwqs.a, i, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(3, 0);
        if (resourceId == 0) {
            throw new IllegalArgumentException("LayoutPreference requires a layout to be defined");
        }
        obtainStyledAttributes2.recycle();
        View inflate = LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null, false);
        this.B = R.layout.layout_preference_frame;
        this.c = inflate;
        O(false);
    }

    LayoutPreference(Context context, View view) {
        super(context);
        this.B = R.layout.layout_preference_frame;
        this.c = view;
        O(false);
    }
}

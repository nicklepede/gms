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
import defpackage.byzi;
import defpackage.mfa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LayoutPreference extends Preference {
    private boolean a;
    private boolean b;
    private final View c;

    public LayoutPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void a(mfa mfaVar) {
        boolean z = this.v;
        View view = mfaVar.a;
        view.setFocusable(z);
        view.setClickable(z);
        mfaVar.v = this.a;
        mfaVar.w = this.b;
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
        int[] iArr = byzi.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        this.a = obtainStyledAttributes.getBoolean(16, false);
        this.b = obtainStyledAttributes.getBoolean(17, false);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
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

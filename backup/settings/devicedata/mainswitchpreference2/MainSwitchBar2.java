package com.google.android.gms.backup.settings.devicedata.mainswitchpreference2;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.devicedata.mainswitchpreference2.MainSwitchBar2;
import defpackage.ajom;
import defpackage.kmq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MainSwitchBar2 extends LinearLayout implements CompoundButton.OnCheckedChangeListener {
    public final List a;
    protected TextView b;
    protected TextView c;
    protected CompoundButton d;
    private int e;
    private int f;

    public MainSwitchBar2(Context context) {
        this(context, null);
    }

    private final void e(boolean z) {
        setBackgroundColor(z ? this.f : this.e);
    }

    public final void a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        List list = this.a;
        if (list.contains(onCheckedChangeListener)) {
            return;
        }
        list.add(onCheckedChangeListener);
    }

    public final void b(boolean z) {
        CompoundButton compoundButton = this.d;
        if (compoundButton != null) {
            compoundButton.setChecked(z);
        }
        e(z);
    }

    public final void c(CharSequence charSequence) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
            this.c.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        }
    }

    public final void d(CharSequence charSequence) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        e(z);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((CompoundButton.OnCheckedChangeListener) it.next()).onCheckedChanged(this.d, z);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.d.setChecked(savedState.a);
        b(savedState.a);
        e(savedState.a);
        setVisibility(true != savedState.b ? 8 : 0);
        this.d.setOnCheckedChangeListener(true != savedState.b ? null : this);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.d.isChecked();
        savedState.b = getVisibility() == 0;
        return savedState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.d.performClick();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.d.setEnabled(z);
        TextView textView = this.c;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public MainSwitchBar2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new ajom();
        boolean a;
        boolean b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = ((Boolean) parcel.readValue(null)).booleanValue();
            this.b = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "MainSwitchBar.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " checked=" + this.a + " visible=" + this.b + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.a));
            parcel.writeValue(Boolean.valueOf(this.b));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MainSwitchBar2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MainSwitchBar2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.backup_settingslib_expressive_main_switch_bar, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
        this.f = obtainStyledAttributes.getColor(0, 0);
        this.e = context.getColor(R.color.material_grey_600);
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        findViewById(R.id.frame);
        this.b = (TextView) findViewById(R.id.switch_text);
        this.c = (TextView) findViewById(R.id.switch_summary);
        this.d = (CompoundButton) findViewById(android.R.id.switch_widget);
        a(new CompoundButton.OnCheckedChangeListener() { // from class: ajol
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MainSwitchBar2.this.b(z);
            }
        });
        if (this.d.getVisibility() == 0) {
            this.d.setOnCheckedChangeListener(this);
        }
        b(this.d.isChecked());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kmq.g, 0, 0);
            d(obtainStyledAttributes2.getText(4));
            c(obtainStyledAttributes2.getText(7));
            obtainStyledAttributes2.recycle();
        }
        e(this.d.isChecked());
    }
}

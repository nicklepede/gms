package com.google.android.gms.wallet.ui.component.filter;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import defpackage.djge;
import defpackage.djgf;
import defpackage.djgh;
import defpackage.djgi;
import defpackage.efee;
import defpackage.efej;
import defpackage.efvc;
import defpackage.efwz;
import defpackage.ehxv;
import defpackage.ehyq;
import defpackage.fasn;
import defpackage.fasq;
import defpackage.kzq;
import defpackage.laj;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FilterView extends FlexboxLayout implements View.OnClickListener, efee, efej, efvc {
    public ManageFiltersChipButton b;
    public fasn c;
    public djgf d;
    public efwz e;
    public djgh f;
    public boolean g;
    public laj h;
    public kzq i;

    public FilterView(Context context) {
        super(context);
    }

    @Override // defpackage.efvc
    public final boolean kP(List list) {
        return this.d.kP(list);
    }

    @Override // defpackage.efvc
    public final boolean kd(List list) {
        return this.d.kd(list);
    }

    @Override // defpackage.efvc
    public final boolean ke() {
        return this.d.ke();
    }

    @Override // defpackage.efee
    public final void ks() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof efee) {
                ((efee) childAt).ks();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        djgh djghVar;
        if (view != this.b || (djghVar = this.f) == null) {
            return;
        }
        djghVar.bE(this.c);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("parentState"));
        setVisibility(bundle.getInt("viewVisibility"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putInt("viewVisibility", getVisibility());
        return bundle;
    }

    @Override // defpackage.efej
    public final void q(ehyq ehyqVar, List list) {
        int a = ehxv.a(ehyqVar.e);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 27) {
            Locale locale = Locale.US;
            int a2 = ehxv.a(ehyqVar.e);
            if (a2 == 0) {
                a2 = 1;
            }
            throw new IllegalArgumentException(String.format(locale, "FilterView does not handle resulting action type %s", Integer.valueOf(a2 - 1)));
        }
        if (!this.g) {
            z();
            return;
        }
        kzq kzqVar = this.i;
        kzqVar.b = new djgi(this);
        this.h.e(kzqVar);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
        djgf djgfVar = this.d;
        djgfVar.a = (djge) djgfVar.b.b.findFragmentByTag("FilterCategoryDialogFragment");
        djge djgeVar = djgfVar.a;
        if (djgeVar != null) {
            djgeVar.kR(z);
        }
    }

    public final fasq x() {
        return this.d.a();
    }

    public final void z() {
        if (getVisibility() == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public FilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

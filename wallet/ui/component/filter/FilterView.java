package com.google.android.gms.wallet.ui.component.filter;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import defpackage.dlrx;
import defpackage.dlry;
import defpackage.dlsa;
import defpackage.dlsb;
import defpackage.ehrh;
import defpackage.ehrm;
import defpackage.eiif;
import defpackage.eikc;
import defpackage.eklb;
import defpackage.eklw;
import defpackage.fdhc;
import defpackage.fdhf;
import defpackage.msl;
import defpackage.mte;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FilterView extends FlexboxLayout implements View.OnClickListener, ehrh, ehrm, eiif {
    public ManageFiltersChipButton b;
    public fdhc c;
    public dlry d;
    public eikc e;
    public dlsa f;
    public boolean g;
    public mte h;
    public msl i;

    public FilterView(Context context) {
        super(context);
    }

    @Override // defpackage.ehrh
    public final void kH() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof ehrh) {
                ((ehrh) childAt).kH();
            }
        }
    }

    @Override // defpackage.eiif
    public final boolean ks(List list) {
        return this.d.ks(list);
    }

    @Override // defpackage.eiif
    public final boolean kt() {
        return this.d.kt();
    }

    @Override // defpackage.eiif
    public final boolean le(List list) {
        return this.d.le(list);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dlsa dlsaVar;
        if (view != this.b || (dlsaVar = this.f) == null) {
            return;
        }
        dlsaVar.bD(this.c);
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

    @Override // defpackage.ehrm
    public final void q(eklw eklwVar, List list) {
        int a = eklb.a(eklwVar.e);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 27) {
            Locale locale = Locale.US;
            int a2 = eklb.a(eklwVar.e);
            if (a2 == 0) {
                a2 = 1;
            }
            throw new IllegalArgumentException(String.format(locale, "FilterView does not handle resulting action type %s", Integer.valueOf(a2 - 1)));
        }
        if (!this.g) {
            z();
            return;
        }
        msl mslVar = this.i;
        mslVar.b = new dlsb(this);
        this.h.e(mslVar);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
        dlry dlryVar = this.d;
        dlryVar.a = (dlrx) dlryVar.b.b.findFragmentByTag("FilterCategoryDialogFragment");
        dlrx dlrxVar = dlryVar.a;
        if (dlrxVar != null) {
            dlrxVar.lg(z);
        }
    }

    public final fdhf x() {
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

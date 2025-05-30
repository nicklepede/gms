package com.google.android.gms.wallet.common.ui;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.Spinner;
import com.google.android.gms.R;
import com.google.android.gms.wallet.ow.RootChimeraActivity;
import defpackage.atyq;
import defpackage.dkwx;
import defpackage.dkwy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AccountSelector extends FrameLayout implements AdapterView.OnItemSelectedListener {
    public Account a;
    public Spinner b;
    public RootChimeraActivity c;

    public AccountSelector(Context context) {
        super(context);
        d(context);
    }

    private final void d(Context context) {
        LayoutInflater.from(context).inflate(R.layout.wallet_view_account_selector, (ViewGroup) this, true);
        Spinner spinner = (Spinner) findViewById(R.id.account_spinner);
        this.b = spinner;
        spinner.setOnItemSelectedListener(this);
    }

    public final void a(Account account) {
        if (atyq.b(this.a, account)) {
            return;
        }
        this.a = account;
        b();
        RootChimeraActivity rootChimeraActivity = this.c;
        if (rootChimeraActivity != null) {
            rootChimeraActivity.g(account);
        }
    }

    public final void b() {
        dkwy dkwyVar;
        if (this.a == null || !c()) {
            return;
        }
        Spinner spinner = this.b;
        Account account = this.a;
        int i = -1;
        if (c() && (dkwyVar = (dkwy) this.b.getAdapter()) != null) {
            int i2 = 0;
            while (true) {
                if (i2 < dkwyVar.getCount()) {
                    if (atyq.b(((dkwx) dkwyVar.getItem(i2)).a, account)) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        spinner.setSelection(i);
    }

    public final boolean c() {
        return this.b.getVisibility() == 0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        dkwx dkwxVar;
        if (view == null || (dkwxVar = (dkwx) view.getTag()) == null) {
            return;
        }
        a(dkwxVar.a);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
        a((Account) bundle.getParcelable("currentAccount"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("currentAccount", this.a);
        return bundle;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (c()) {
            this.b.setEnabled(z);
        }
    }

    public AccountSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public AccountSelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

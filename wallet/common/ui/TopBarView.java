package com.google.android.gms.wallet.common.ui;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TopBarView extends LinearLayout {
    public AccountSelector a;
    private boolean b;

    public TopBarView(Context context) {
        super(context);
        this.b = false;
        c(context);
    }

    private final void c(Context context) {
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.wallet_view_top_bar, (ViewGroup) this, true);
        this.a = (AccountSelector) findViewById(R.id.account_selector);
    }

    public final void a(Account account) {
        AccountSelector accountSelector = this.a;
        if (accountSelector != null) {
            accountSelector.a(account);
        }
    }

    public final void b(boolean z) {
        this.b = z;
        AccountSelector accountSelector = this.a;
        if (accountSelector != null) {
            accountSelector.setEnabled(z);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
        if (bundle.containsKey("visibleAccountSelector")) {
            this.b = bundle.getBoolean("visibleAccountSelector");
        }
        b(this.b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putBoolean("visibleAccountSelector", this.b);
        return bundle;
    }

    public TopBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        c(context);
    }

    public TopBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        c(context);
    }
}

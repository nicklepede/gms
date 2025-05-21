package com.google.android.gms.wearable.backup.phone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import defpackage.dg;
import defpackage.dkbd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class LoadingAccountsFragment extends dg {
    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dkbd.e(getArguments());
        View inflate = dkbd.c(e, layoutInflater).inflate(true != dkbd.h(e) ? R.layout.companion_restore_loading_accounts_fragment : R.layout.companion_restore_expressive_loading_accounts_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        dkbd.g(linearLayout, e, (TextView) linearLayout.findViewById(R.id.title), (TextView) linearLayout.findViewById(R.id.subtitle));
        return inflate;
    }
}

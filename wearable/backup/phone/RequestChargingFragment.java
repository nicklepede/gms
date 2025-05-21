package com.google.android.gms.wearable.backup.phone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import defpackage.dg;
import defpackage.djll;
import defpackage.djqh;
import defpackage.dkbd;
import defpackage.eiig;
import defpackage.jrh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RequestChargingFragment extends dg {
    private djqh a = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (djqh) new jrh((RestoreFlowChimeraActivity) context).a(djqh.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dkbd.e(getArguments());
        View inflate = dkbd.c(e, layoutInflater).inflate(true != dkbd.h(e) ? R.layout.companion_restore_request_charging_fragment : R.layout.companion_restore_expressive_request_charging_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        dkbd.g(linearLayout, e, (TextView) linearLayout.findViewById(R.id.title), (TextView) linearLayout.findViewById(R.id.subtitle));
        Button button = (Button) inflate.findViewById(R.id.cancel_action);
        final djqh djqhVar = this.a;
        eiig.x(djqhVar);
        button.setOnClickListener(new View.OnClickListener() { // from class: djop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                djqh.this.h(5);
            }
        });
        djll.a(inflate.findViewById(R.id.title));
        return inflate;
    }
}

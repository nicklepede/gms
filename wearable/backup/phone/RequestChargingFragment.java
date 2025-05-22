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
import defpackage.dlxe;
import defpackage.dmca;
import defpackage.dmmw;
import defpackage.ekvl;
import defpackage.jxw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class RequestChargingFragment extends dg {
    private dmca a = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (dmca) new jxw((RestoreFlowChimeraActivity) context).a(dmca.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dmmw.e(getArguments());
        View inflate = dmmw.c(e, layoutInflater).inflate(true != dmmw.h(e) ? R.layout.companion_restore_request_charging_fragment : R.layout.companion_restore_expressive_request_charging_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        dmmw.g(linearLayout, e, (TextView) linearLayout.findViewById(R.id.title), (TextView) linearLayout.findViewById(R.id.subtitle));
        Button button = (Button) inflate.findViewById(R.id.cancel_action);
        final dmca dmcaVar = this.a;
        ekvl.y(dmcaVar);
        button.setOnClickListener(new View.OnClickListener() { // from class: dmai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dmca.this.h(5);
            }
        });
        dlxe.a(inflate.findViewById(R.id.title));
        return inflate;
    }
}

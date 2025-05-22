package com.google.android.gms.wearable.backup.phone;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.RestoreFlowChimeraActivity;
import defpackage.caqj;
import defpackage.dg;
import defpackage.dlxe;
import defpackage.dmca;
import defpackage.dmmw;
import defpackage.ekvl;
import defpackage.fwfq;
import defpackage.jxw;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class RestoreStartFragment extends dg {
    private RestoreFlowChimeraActivity a;
    private dmca b = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (RestoreFlowChimeraActivity) context;
        this.b = (dmca) new jxw(this.a).a(dmca.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dmmw.e(getArguments());
        LayoutInflater c = dmmw.c(e, layoutInflater);
        dmca dmcaVar = this.b;
        ekvl.y(dmcaVar);
        View inflate = c.inflate(true != dmmw.h(e) ? R.layout.companion_restore_restore_start_fragment : R.layout.companion_restore_expressive_restore_start_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        dmmw.g(linearLayout, e, (TextView) linearLayout.findViewById(R.id.title), (TextView) linearLayout.findViewById(R.id.subtitle));
        if (!fwfq.e()) {
            ((TextView) inflate.findViewById(R.id.subtitle)).setText(getString(R.string.companion_restore_restore_start_fragment_subtitle, dmcaVar.a()));
        }
        dlxe.a(inflate.findViewById(R.id.title));
        return inflate;
    }

    @Override // defpackage.dg
    public final void onResume() {
        super.onResume();
        caqj caqjVar = new caqj();
        final RestoreFlowChimeraActivity restoreFlowChimeraActivity = this.a;
        ekvl.y(restoreFlowChimeraActivity);
        Objects.requireNonNull(restoreFlowChimeraActivity);
        caqjVar.postDelayed(new Runnable() { // from class: dmcb
            @Override // java.lang.Runnable
            public final void run() {
                RestoreFlowChimeraActivity.this.finish();
            }
        }, fwfq.a.lK().a());
    }
}

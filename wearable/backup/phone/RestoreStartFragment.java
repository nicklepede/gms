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
import defpackage.byhr;
import defpackage.dg;
import defpackage.djll;
import defpackage.djqh;
import defpackage.dkbd;
import defpackage.eiig;
import defpackage.ftjy;
import defpackage.jrh;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RestoreStartFragment extends dg {
    private RestoreFlowChimeraActivity a;
    private djqh b = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (RestoreFlowChimeraActivity) context;
        this.b = (djqh) new jrh(this.a).a(djqh.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dkbd.e(getArguments());
        LayoutInflater c = dkbd.c(e, layoutInflater);
        djqh djqhVar = this.b;
        eiig.x(djqhVar);
        View inflate = c.inflate(true != dkbd.h(e) ? R.layout.companion_restore_restore_start_fragment : R.layout.companion_restore_expressive_restore_start_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        dkbd.g(linearLayout, e, (TextView) linearLayout.findViewById(R.id.title), (TextView) linearLayout.findViewById(R.id.subtitle));
        if (!ftjy.e()) {
            ((TextView) inflate.findViewById(R.id.subtitle)).setText(getString(R.string.companion_restore_restore_start_fragment_subtitle, djqhVar.a()));
        }
        djll.a(inflate.findViewById(R.id.title));
        return inflate;
    }

    @Override // defpackage.dg
    public final void onResume() {
        super.onResume();
        byhr byhrVar = new byhr();
        final RestoreFlowChimeraActivity restoreFlowChimeraActivity = this.a;
        eiig.x(restoreFlowChimeraActivity);
        Objects.requireNonNull(restoreFlowChimeraActivity);
        byhrVar.postDelayed(new Runnable() { // from class: djqi
            @Override // java.lang.Runnable
            public final void run() {
                RestoreFlowChimeraActivity.this.finish();
            }
        }, ftjy.a.a().a());
    }
}

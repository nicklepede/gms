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
import defpackage.djqh;
import defpackage.dkbd;
import defpackage.eiig;
import defpackage.jpd;
import defpackage.jrh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class DecryptBackupFragment extends dg {
    public djqh a = null;
    public TextView b = null;
    public TextView c = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (djqh) new jrh((RestoreFlowChimeraActivity) context).a(djqh.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dkbd.e(getArguments());
        View inflate = dkbd.c(e, layoutInflater).inflate(true != dkbd.h(e) ? R.layout.companion_restore_decrypt_backup_fragment : R.layout.companion_restore_expressive_decrypt_backup_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        dkbd.g(linearLayout, e, (TextView) linearLayout.findViewById(R.id.title));
        final djqh djqhVar = this.a;
        eiig.x(djqhVar);
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
        ((Button) inflate.findViewById(R.id.cancel_action)).setOnClickListener(new View.OnClickListener() { // from class: djoi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                djqh.a.h("Cancelling key recovery", new Object[0]);
                final djqh djqhVar2 = djqh.this;
                dfaq a = djqhVar2.c.a();
                a.z(new dfak() { // from class: djpy
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        djqh.this.f();
                    }
                });
                a.y(new djqc(djqhVar2, null, 5));
            }
        });
        djqhVar.i.g(this, new jpd() { // from class: djoj
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
            
                if (r10 == 0) goto L38;
             */
            @Override // defpackage.jpd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 257
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.djoj.a(java.lang.Object):void");
            }
        });
        return inflate;
    }
}

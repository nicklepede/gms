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
import defpackage.dmca;
import defpackage.dmmw;
import defpackage.ekvl;
import defpackage.jvs;
import defpackage.jxw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class DecryptBackupFragment extends dg {
    public dmca a = null;
    public TextView b = null;
    public TextView c = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (dmca) new jxw((RestoreFlowChimeraActivity) context).a(dmca.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dmmw.e(getArguments());
        View inflate = dmmw.c(e, layoutInflater).inflate(true != dmmw.h(e) ? R.layout.companion_restore_decrypt_backup_fragment : R.layout.companion_restore_expressive_decrypt_backup_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.header);
        dmmw.g(linearLayout, e, (TextView) linearLayout.findViewById(R.id.title));
        final dmca dmcaVar = this.a;
        ekvl.y(dmcaVar);
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
        ((Button) inflate.findViewById(R.id.cancel_action)).setOnClickListener(new View.OnClickListener() { // from class: dmab
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dmca.a.h("Cancelling key recovery", new Object[0]);
                final dmca dmcaVar2 = dmca.this;
                dhlw a = dmcaVar2.c.a();
                a.z(new dhlq() { // from class: dmbr
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        dmca.this.f();
                    }
                });
                a.y(new dmbv(dmcaVar2, null, 5));
            }
        });
        dmcaVar.i.g(this, new jvs() { // from class: dmac
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
            
                if (r10 == 0) goto L38;
             */
            @Override // defpackage.jvs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 257
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dmac.a(java.lang.Object):void");
            }
        });
        return inflate;
    }
}

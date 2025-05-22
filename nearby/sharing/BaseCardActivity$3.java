package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.BaseCardActivity$3;
import defpackage.cnuu;
import defpackage.cojh;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.jvr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BaseCardActivity$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ cnuu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardActivity$3(cnuu cnuuVar) {
        super("nearby", "NearbySharingStatusReceiver");
        this.a = cnuuVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(final Context context, Intent intent) {
        cnuu cnuuVar = this.a;
        cojh cojhVar = cnuuVar.k;
        if (cojhVar == null) {
            return;
        }
        dhlw d = cojhVar.d();
        d.z(new dhlq() { // from class: cnuo
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                cnuu cnuuVar2 = BaseCardActivity$3.this.a;
                Account account = (Account) obj;
                cnuuVar2.u.l(account);
                colj coljVar = cnuuVar2.o;
                if (coljVar != null) {
                    coljVar.h(context.getApplicationContext(), account);
                }
            }
        });
        d.y(new dhln() { // from class: cnup
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                cnuu cnuuVar2 = BaseCardActivity$3.this.a;
                cnuuVar2.u.l(null);
                colj coljVar = cnuuVar2.o;
                if (coljVar != null) {
                    coljVar.h(context.getApplicationContext(), null);
                }
            }
        });
        dhlw l = cnuuVar.k.l();
        final jvr jvrVar = cnuuVar.v;
        Objects.requireNonNull(jvrVar);
        l.z(new dhlq() { // from class: cnuq
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                jvr.this.l((Boolean) obj);
            }
        });
    }
}

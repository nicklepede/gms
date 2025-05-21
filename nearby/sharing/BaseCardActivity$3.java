package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.BaseCardActivity$3;
import defpackage.clmm;
import defpackage.cmaz;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.jpc;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class BaseCardActivity$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ clmm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardActivity$3(clmm clmmVar) {
        super("nearby", "NearbySharingStatusReceiver");
        this.a = clmmVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(final Context context, Intent intent) {
        clmm clmmVar = this.a;
        cmaz cmazVar = clmmVar.k;
        if (cmazVar == null) {
            return;
        }
        dfaq d = cmazVar.d();
        d.z(new dfak() { // from class: clmg
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                clmm clmmVar2 = BaseCardActivity$3.this.a;
                Account account = (Account) obj;
                clmmVar2.u.l(account);
                cmdb cmdbVar = clmmVar2.o;
                if (cmdbVar != null) {
                    cmdbVar.h(context.getApplicationContext(), account);
                }
            }
        });
        d.y(new dfah() { // from class: clmh
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                clmm clmmVar2 = BaseCardActivity$3.this.a;
                clmmVar2.u.l(null);
                cmdb cmdbVar = clmmVar2.o;
                if (cmdbVar != null) {
                    cmdbVar.h(context.getApplicationContext(), null);
                }
            }
        });
        dfaq l = clmmVar.k.l();
        final jpc jpcVar = clmmVar.v;
        Objects.requireNonNull(jpcVar);
        l.z(new dfak() { // from class: clmi
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                jpc.this.l((Boolean) obj);
            }
        });
    }
}

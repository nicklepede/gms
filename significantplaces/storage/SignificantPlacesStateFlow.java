package com.google.android.gms.significantplaces.storage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bqpm;
import defpackage.bqpn;
import defpackage.byhp;
import defpackage.dcnb;
import defpackage.dcnc;
import defpackage.fuww;
import defpackage.fuyp;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvbx;
import defpackage.fvgt;
import defpackage.fvic;
import defpackage.fvid;
import defpackage.fvnp;
import defpackage.fvnv;
import defpackage.fvqq;
import defpackage.fvrd;
import defpackage.fvrx;
import defpackage.fvrz;
import defpackage.fvsa;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignificantPlacesStateFlow extends TracingBroadcastReceiver implements fvrx {
    public final Context a;
    public final fvrz b;
    private final /* synthetic */ fvrx c;
    private final fvic d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignificantPlacesStateFlow(fvic fvicVar, Context context) {
        super(context);
        fvbo.f(context, "context");
        fvrz a = fvsa.a(fuww.a);
        this.c = new fvrd(a);
        this.a = context;
        this.b = a;
        fvic d = fvid.d(fvicVar, bqpm.d(byhp.HIGH_SPEED));
        this.d = d;
        fvqq fvqqVar = new fvqq(a.c(), new dcnb(new fvbx(), this, d, null));
        fuyx fuyxVar = bqpn.a;
        fvnv.d(fvqqVar, fvid.d(d, bqpn.f));
    }

    @Override // defpackage.fvrx
    public final /* bridge */ /* synthetic */ Object b() {
        return (List) this.c.b();
    }

    public final void c() {
        fvgt.b(this.d, null, null, new dcnc(this, null), 3);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        fvbo.f(context, "context");
        fvbo.f(intent, "intent");
        synchronized (this) {
            c();
        }
    }

    @Override // defpackage.fvre, defpackage.fvno
    public final Object nB(fvnp fvnpVar, fuyp fuypVar) {
        return this.c.nB(fvnpVar, fuypVar);
    }
}

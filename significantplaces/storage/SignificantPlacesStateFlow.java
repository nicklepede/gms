package com.google.android.gms.significantplaces.storage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bsxd;
import defpackage.bsxe;
import defpackage.caqh;
import defpackage.deye;
import defpackage.deyf;
import defpackage.fxsu;
import defpackage.fxun;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fxxv;
import defpackage.fycr;
import defpackage.fyea;
import defpackage.fyeb;
import defpackage.fyjn;
import defpackage.fyjt;
import defpackage.fymo;
import defpackage.fynb;
import defpackage.fynv;
import defpackage.fynx;
import defpackage.fyny;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignificantPlacesStateFlow extends TracingBroadcastReceiver implements fynv {
    public final Context a;
    public final fynx b;
    private final /* synthetic */ fynv c;
    private final fyea d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignificantPlacesStateFlow(fyea fyeaVar, Context context) {
        super(context);
        fxxm.f(context, "context");
        fynx a = fyny.a(fxsu.a);
        this.c = new fynb(a);
        this.a = context;
        this.b = a;
        fyea d = fyeb.d(fyeaVar, bsxd.d(caqh.HIGH_SPEED));
        this.d = d;
        fymo fymoVar = new fymo(a.c(), new deye(new fxxv(), this, d, null));
        fxuv fxuvVar = bsxe.a;
        fyjt.d(fymoVar, fyeb.d(d, bsxe.f));
    }

    @Override // defpackage.fynv
    public final /* bridge */ /* synthetic */ Object b() {
        return (List) this.c.b();
    }

    public final void c() {
        fycr.b(this.d, null, null, new deyf(this, null), 3);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        fxxm.f(context, "context");
        fxxm.f(intent, "intent");
        synchronized (this) {
            c();
        }
    }

    @Override // defpackage.fync, defpackage.fyjm
    public final Object nY(fyjn fyjnVar, fxun fxunVar) {
        return this.c.nY(fyjnVar, fxunVar);
    }
}

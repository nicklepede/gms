package com.google.android.gms.networktransparency.init;

import android.app.Application;
import com.google.android.gms.chimera.modules.networktransparency.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.crsp;
import defpackage.cwlp;
import defpackage.cwlq;
import defpackage.cwnd;
import defpackage.cwol;
import defpackage.fnat;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class Pommel_NetworkDataUpdateTaskBoundService extends GmsTaskBoundService implements cwlq, cwol {
    private volatile cwnd a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.cwol
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cwnd g() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new cwnd(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.cwlq
    public final Application e() {
        return fnat.c() ? cwlp.a(getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override // defpackage.cwok
    public final Object h() {
        return g().h();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((crsp) h()).a((NetworkDataUpdateTaskBoundService) this);
        }
        super.onCreate();
    }
}

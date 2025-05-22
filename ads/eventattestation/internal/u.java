package com.google.android.gms.ads.eventattestation.internal;

import android.content.Context;
import com.google.android.gms.common.Feature;
import defpackage.aszk;
import defpackage.aszp;
import defpackage.aszq;
import defpackage.aszs;
import defpackage.atac;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.bbry;
import defpackage.dhma;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class u extends atad implements com.google.android.gms.ads.eventattestation.a {
    public static final /* synthetic */ int a = 0;
    private static final aszs b;
    private static final aszk c;
    private static final aszq d;

    static {
        aszk aszkVar = new aszk();
        c = aszkVar;
        t tVar = new t();
        d = tVar;
        b = new aszs("SecureEvent.API", tVar, aszkVar);
    }

    public u(Context context) {
        super(context, b, (aszp) null, atac.a);
    }

    @Override // com.google.android.gms.ads.eventattestation.a
    public final void a() {
        atfn atfnVar = new atfn();
        atfnVar.c = new Feature[]{bbry.a};
        atfnVar.a = new atfd() { // from class: com.google.android.gms.ads.eventattestation.internal.s
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = u.a;
                ((dhma) obj2).b(null);
            }
        };
        jd(atfnVar.a());
    }
}

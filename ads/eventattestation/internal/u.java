package com.google.android.gms.ads.eventattestation.internal;

import android.content.Context;
import com.google.android.gms.common.Feature;
import defpackage.aqwv;
import defpackage.aqxa;
import defpackage.aqxb;
import defpackage.aqxd;
import defpackage.aqxn;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.azoc;
import defpackage.dfau;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class u extends aqxo implements com.google.android.gms.ads.eventattestation.a {
    public static final /* synthetic */ int a = 0;
    private static final aqxd b;
    private static final aqwv c;
    private static final aqxb d;

    static {
        aqwv aqwvVar = new aqwv();
        c = aqwvVar;
        t tVar = new t();
        d = tVar;
        b = new aqxd("SecureEvent.API", tVar, aqwvVar);
    }

    public u(Context context) {
        super(context, b, (aqxa) null, aqxn.a);
    }

    @Override // com.google.android.gms.ads.eventattestation.a
    public final void a() {
        arcy arcyVar = new arcy();
        arcyVar.c = new Feature[]{azoc.a};
        arcyVar.a = new arco() { // from class: com.google.android.gms.ads.eventattestation.internal.s
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = u.a;
                ((dfau) obj2).b(null);
            }
        };
        iO(arcyVar.a());
    }
}

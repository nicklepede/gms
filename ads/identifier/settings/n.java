package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import defpackage.aukz;
import defpackage.aula;
import defpackage.aupz;
import defpackage.ekut;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.eqhc;
import defpackage.evtn;
import defpackage.evto;
import defpackage.fgpr;
import defpackage.fgrc;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class n {
    public final eqgo b = new aupz(1, 9);
    public final RequestQueue a = aula.b();

    public final eqgl a(Context context, final byte[] bArr, final byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        String encodeToString = Base64.encodeToString(bArr, 2);
        eqgo eqgoVar = this.b;
        eqgb h = eqgb.h(eqgoVar.submit(new m(encodeToString, Base64.encodeToString(bArr2, 2), context)));
        ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.identifier.settings.f
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalStateException("Signals is empty.");
                }
                return str;
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.f(eqdl.g(eqdl.f(eqdl.f(h, ekutVar, eqexVar), new ekut() { // from class: com.google.android.gms.ads.identifier.settings.g
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                fgrc v = evtn.a.v();
                fgpr A = fgpr.A((String) obj);
                if (!v.b.L()) {
                    v.U();
                }
                byte[] bArr3 = bArr;
                ((evtn) v.b).c = A;
                fgpr w = fgpr.w(bArr3);
                if (!v.b.L()) {
                    v.U();
                }
                byte[] bArr4 = bArr2;
                ((evtn) v.b).d = w;
                fgpr w2 = fgpr.w(bArr4);
                if (!v.b.L()) {
                    v.U();
                }
                evtn evtnVar = (evtn) v.b;
                evtnVar.b |= 1;
                evtnVar.e = w2;
                return (evtn) v.Q();
            }
        }, eqgoVar), new eqdv() { // from class: com.google.android.gms.ads.identifier.settings.h
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                final eqhc eqhcVar = new eqhc();
                byte[] r = ((evtn) obj).r();
                evto evtoVar = evto.a;
                Objects.requireNonNull(eqhcVar);
                Response.Listener listener = new Response.Listener() { // from class: com.google.android.gms.ads.identifier.settings.j
                    @Override // com.android.volley.Response.Listener
                    public final void onResponse(Object obj2) {
                        eqhc.this.q((evto) obj2);
                    }
                };
                Objects.requireNonNull(eqhcVar);
                final aukz aukzVar = new aukz(1, "https://deviceintegritytokens-pa.googleapis.com/v1/getAdEventToken?alt=PROTO&key=AIzaSyA8mcvQcsqT5QLTUyhjjH_DeDkTqP9u2_w", r, evtoVar, listener, new Response.ErrorListener() { // from class: com.google.android.gms.ads.identifier.settings.k
                    @Override // com.android.volley.Response.ErrorListener
                    public final void onErrorResponse(VolleyError volleyError) {
                        eqhc.this.r(volleyError);
                    }
                }, null, null, false, new HashMap(), 22272, -1);
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.identifier.settings.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (eqhc.this.isCancelled()) {
                            aukzVar.cancel();
                        }
                    }
                };
                n nVar = n.this;
                eqhcVar.hD(runnable, nVar.b);
                nVar.a.add(aukzVar);
                return eqhcVar;
            }
        }, eqgoVar), new ekut() { // from class: com.google.android.gms.ads.identifier.settings.i
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                return ((evto) obj).b.M();
            }
        }, eqexVar);
    }
}

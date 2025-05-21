package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import defpackage.ashf;
import defpackage.ashg;
import defpackage.asmf;
import defpackage.eiho;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.enss;
import defpackage.ensv;
import defpackage.entj;
import defpackage.etdv;
import defpackage.etdw;
import defpackage.feay;
import defpackage.fecj;
import j$.util.Objects;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class n {
    public final ensv b = new asmf(1, 9);
    public final RequestQueue a = ashg.b();

    public final enss a(Context context, final byte[] bArr, final byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        String encodeToString = Base64.encodeToString(bArr, 2);
        ensv ensvVar = this.b;
        ensi h = ensi.h(ensvVar.submit(new m(encodeToString, Base64.encodeToString(bArr2, 2), context)));
        eiho eihoVar = new eiho() { // from class: com.google.android.gms.ads.identifier.settings.f
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalStateException("Signals is empty.");
                }
                return str;
            }
        };
        enre enreVar = enre.a;
        return enps.f(enps.g(enps.f(enps.f(h, eihoVar, enreVar), new eiho() { // from class: com.google.android.gms.ads.identifier.settings.g
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                fecj v = etdv.a.v();
                feay A = feay.A((String) obj);
                if (!v.b.L()) {
                    v.U();
                }
                byte[] bArr3 = bArr;
                ((etdv) v.b).c = A;
                feay w = feay.w(bArr3);
                if (!v.b.L()) {
                    v.U();
                }
                byte[] bArr4 = bArr2;
                ((etdv) v.b).d = w;
                feay w2 = feay.w(bArr4);
                if (!v.b.L()) {
                    v.U();
                }
                etdv etdvVar = (etdv) v.b;
                etdvVar.b |= 1;
                etdvVar.e = w2;
                return (etdv) v.Q();
            }
        }, ensvVar), new enqc() { // from class: com.google.android.gms.ads.identifier.settings.h
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                final entj entjVar = new entj();
                byte[] r = ((etdv) obj).r();
                etdw etdwVar = etdw.a;
                Objects.requireNonNull(entjVar);
                Response.Listener listener = new Response.Listener() { // from class: com.google.android.gms.ads.identifier.settings.j
                    @Override // com.android.volley.Response.Listener
                    public final void onResponse(Object obj2) {
                        entj.this.q((etdw) obj2);
                    }
                };
                Objects.requireNonNull(entjVar);
                final ashf ashfVar = new ashf(1, "https://deviceintegritytokens-pa.googleapis.com/v1/getAdEventToken?alt=PROTO&key=AIzaSyA8mcvQcsqT5QLTUyhjjH_DeDkTqP9u2_w", r, etdwVar, listener, new Response.ErrorListener() { // from class: com.google.android.gms.ads.identifier.settings.k
                    @Override // com.android.volley.Response.ErrorListener
                    public final void onErrorResponse(VolleyError volleyError) {
                        entj.this.r(volleyError);
                    }
                }, null, null, false, new HashMap(), 22272, -1);
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.identifier.settings.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (entj.this.isCancelled()) {
                            ashfVar.cancel();
                        }
                    }
                };
                n nVar = n.this;
                entjVar.hn(runnable, nVar.b);
                nVar.a.add(ashfVar);
                return entjVar;
            }
        }, ensvVar), new eiho() { // from class: com.google.android.gms.ads.identifier.settings.i
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                return ((etdw) obj).b.M();
            }
        }, enreVar);
    }
}

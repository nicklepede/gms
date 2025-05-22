package com.google.android.gms.ads.httpcache;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.httpcache.HttpRequestParcel;
import com.google.android.gms.ads.internal.httpcache.HttpResponseParcel;
import com.google.android.gms.ads.internal.request.LargeParcelTeleporter;
import com.google.android.gms.ads.internal.util.future.i;
import com.google.android.gms.ads.internal.util.r;
import com.google.android.gms.ads.internal.util.z;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.ekut;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f {
    public static f a;
    public static final Executor b = new aupz(Integer.MAX_VALUE, 9);
    private static final ScheduledExecutorService c = new aupv(5, 9);
    private final RequestQueue d;

    public f(Context context) {
        this.d = r.a(context, new BasicNetwork((BaseHttpStack) new HurlStack()));
    }

    public final eqgl a(HttpRequestParcel httpRequestParcel) {
        z zVar;
        i iVar = new i();
        String[] strArr = httpRequestParcel.b;
        int length = strArr.length;
        String[] strArr2 = httpRequestParcel.c;
        if (length != strArr2.length) {
            zVar = new z(httpRequestParcel.a, null, iVar);
        } else {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i++) {
                hashMap.put(strArr[i], strArr2[i]);
            }
            zVar = new z(httpRequestParcel.a, hashMap, iVar);
        }
        this.d.add(zVar);
        ekut ekutVar = new ekut() { // from class: com.google.android.gms.ads.httpcache.a
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                NetworkResponse networkResponse = (NetworkResponse) obj;
                int size = networkResponse.headers.size();
                String[] strArr3 = new String[size];
                String[] strArr4 = new String[size];
                int i2 = 0;
                for (Map.Entry entry : networkResponse.headers.entrySet()) {
                    strArr3[i2] = (String) entry.getKey();
                    strArr4[i2] = (String) entry.getValue();
                    i2++;
                }
                return new HttpResponseParcel(false, null, networkResponse.statusCode, networkResponse.data, strArr3, strArr4, networkResponse.notModified, networkResponse.networkTimeMs);
            }
        };
        Executor executor = b;
        return eqcq.g(eqgc.q(eqdl.f(eqcq.g(eqdl.f(iVar, ekutVar, executor), VolleyError.class, new eqdv() { // from class: com.google.android.gms.ads.httpcache.b
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                f fVar = f.a;
                return eqgc.i(new HttpResponseParcel(true, ((VolleyError) obj).getMessage(), 0, null, null, null, false, 0L));
            }
        }, executor), new ekut() { // from class: com.google.android.gms.ads.httpcache.c
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                f fVar = f.a;
                return new LargeParcelTeleporter((HttpResponseParcel) obj).a();
            }
        }, executor), ((Integer) p.au.g()).intValue(), TimeUnit.MILLISECONDS, c), Throwable.class, new eqdv() { // from class: com.google.android.gms.ads.httpcache.d
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                f fVar = f.a;
                return eqgc.i(null);
            }
        }, executor);
    }

    public final void b(com.google.android.gms.ads.internal.httpcache.f fVar, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            fVar.a(parcelFileDescriptor);
        } catch (Throwable unused) {
        }
    }
}

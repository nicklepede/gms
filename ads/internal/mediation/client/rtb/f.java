package com.google.android.gms.ads.internal.mediation.client.rtb;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.u;
import defpackage.bblp;
import defpackage.qmq;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f extends qmq implements IInterface {
    private final com.google.android.gms.ads.mediation.rtb.a a;

    public f() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    private final void c(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.m.getBundle(this.a.getClass().getName()) != null) {
            return;
        }
        new Bundle();
    }

    private static void d(String str) {
        com.google.android.gms.ads.internal.util.client.h.k("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
            throw new RemoteException();
        }
    }

    private static void e(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f) {
            return;
        }
        u.b();
        com.google.android.gms.ads.internal.util.client.f.i();
    }

    private static void f(String str, AdRequestParcel adRequestParcel) {
        String str2 = adRequestParcel.u;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    public final void a(String str, AdRequestParcel adRequestParcel, bblp bblpVar) {
        try {
            d(str);
            c(adRequestParcel);
            e(adRequestParcel);
            Location location = adRequestParcel.k;
            int i = adRequestParcel.g;
            int i2 = adRequestParcel.t;
            f(str, adRequestParcel);
            throw null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.h.h("Adapter failed to render native ad.", th);
            com.google.android.gms.ads.internal.mediation.client.b.a(bblpVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                d(str);
                c(adRequestParcel);
                e(adRequestParcel);
                Location location2 = adRequestParcel.k;
                int i3 = adRequestParcel.g;
                int i4 = adRequestParcel.t;
                f(str, adRequestParcel);
                throw null;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.h.h("Adapter failed to render native ad.", th2);
                com.google.android.gms.ads.internal.mediation.client.b.a(bblpVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x051f, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.config.p.bR.g()).booleanValue() != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04e3, code lost:
    
        if (r10.equals("app_open") != false) goto L279;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean fz(int r10, android.os.Parcel r11, android.os.Parcel r12) {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.mediation.client.rtb.f.fz(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public f(com.google.android.gms.ads.mediation.rtb.a aVar) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.a = aVar;
    }
}

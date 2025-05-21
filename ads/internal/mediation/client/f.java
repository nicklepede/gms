package com.google.android.gms.ads.internal.mediation.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azht;
import defpackage.otn;
import defpackage.tcd;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f extends otn implements IInterface {
    private final Object a;
    private m b;
    private azht c;
    private com.google.android.gms.ads.internal.reward.mediation.client.a d;

    public f() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    private final Bundle g(String str, AdRequestParcel adRequestParcel, String str2) {
        com.google.android.gms.ads.internal.util.client.h.d("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (adRequestParcel != null) {
                    bundle.putInt("tagForChildDirectedTreatment", adRequestParcel.g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.h.g(th);
            throw new RemoteException();
        }
    }

    private final void h(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.m.getBundle(this.a.getClass().getName()) != null) {
            return;
        }
        new Bundle();
    }

    private static boolean i(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f) {
            return true;
        }
        u.b();
        return com.google.android.gms.ads.internal.util.client.f.i();
    }

    private static void j(String str, AdRequestParcel adRequestParcel) {
        String str2 = adRequestParcel.u;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    public final void a(azht azhtVar, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, i iVar) {
        tcd tcdVar;
        Object obj = this.a;
        boolean z = obj instanceof com.google.android.gms.ads.mediation.d;
        if (!z && !(obj instanceof com.google.android.gms.ads.mediation.a)) {
            com.google.android.gms.ads.internal.util.client.h.k(com.google.android.gms.ads.mediation.d.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.h.d("Requesting banner ad from adapter.");
        if (adSizeParcel.n) {
            int i = adSizeParcel.e;
            int i2 = adSizeParcel.b;
            tcd tcdVar2 = new tcd(i, i2);
            tcdVar2.f = true;
            tcdVar2.g = i2;
            tcdVar = tcdVar2;
        } else {
            tcdVar = new tcd(adSizeParcel.e, adSizeParcel.b, adSizeParcel.a);
        }
        if (!z) {
            Object obj2 = this.a;
            if (obj2 instanceof com.google.android.gms.ads.mediation.a) {
                try {
                    g(str, adRequestParcel, str2);
                    h(adRequestParcel);
                    i(adRequestParcel);
                    Location location = adRequestParcel.k;
                    int i3 = adRequestParcel.g;
                    int i4 = adRequestParcel.t;
                    j(str, adRequestParcel);
                    throw null;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.h.g(th);
                    b.a(azhtVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.d dVar = (com.google.android.gms.ads.mediation.d) obj;
            List list = adRequestParcel.e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = adRequestParcel.b;
            if (j != -1) {
                new Date(j);
            }
            int i5 = adRequestParcel.d;
            Location location2 = adRequestParcel.k;
            boolean i6 = i(adRequestParcel);
            int i7 = adRequestParcel.g;
            boolean z2 = adRequestParcel.r;
            int i8 = adRequestParcel.t;
            j(str, adRequestParcel);
            dVar.requestBannerAd((Context) ObjectWrapper.a(azhtVar), new m(iVar), g(str, adRequestParcel, str2), tcdVar, new l(hashSet, i6, i7, z2), adRequestParcel.m.getBundle(dVar.getClass().getName()));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.h.g(th2);
            b.a(azhtVar, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    public final void c(azht azhtVar, AdRequestParcel adRequestParcel, String str, String str2, i iVar) {
        Object obj = this.a;
        boolean z = obj instanceof com.google.android.gms.ads.mediation.g;
        if (!z && !(obj instanceof com.google.android.gms.ads.mediation.a)) {
            com.google.android.gms.ads.internal.util.client.h.k(com.google.android.gms.ads.mediation.g.class.getCanonicalName() + " or " + com.google.android.gms.ads.mediation.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.h.d("Requesting interstitial ad from adapter.");
        if (!z) {
            Object obj2 = this.a;
            if (obj2 instanceof com.google.android.gms.ads.mediation.a) {
                try {
                    g(str, adRequestParcel, str2);
                    h(adRequestParcel);
                    i(adRequestParcel);
                    Location location = adRequestParcel.k;
                    int i = adRequestParcel.g;
                    int i2 = adRequestParcel.t;
                    j(str, adRequestParcel);
                    throw null;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.h.g(th);
                    b.a(azhtVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            com.google.android.gms.ads.mediation.g gVar = (com.google.android.gms.ads.mediation.g) obj;
            List list = adRequestParcel.e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = adRequestParcel.b;
            if (j != -1) {
                new Date(j);
            }
            int i3 = adRequestParcel.d;
            Location location2 = adRequestParcel.k;
            boolean i4 = i(adRequestParcel);
            int i5 = adRequestParcel.g;
            boolean z2 = adRequestParcel.r;
            int i6 = adRequestParcel.t;
            j(str, adRequestParcel);
            gVar.requestInterstitialAd((Context) ObjectWrapper.a(azhtVar), new m(iVar), g(str, adRequestParcel, str2), new l(hashSet, i4, i5, z2), adRequestParcel.m.getBundle(gVar.getClass().getName()));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.h.g(th2);
            b.a(azhtVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    public final void d() {
        Object obj = this.a;
        if (!(obj instanceof com.google.android.gms.ads.mediation.g)) {
            com.google.android.gms.ads.internal.util.client.h.k(b.b(obj, com.google.android.gms.ads.mediation.g.class));
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.h.d("Showing interstitial from adapter.");
        try {
            ((com.google.android.gms.ads.mediation.g) obj).showInterstitial();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.h.g(th);
            throw new RemoteException();
        }
    }

    public final void e(azht azhtVar, AdRequestParcel adRequestParcel, String str) {
        Object obj = this.a;
        if (!(obj instanceof com.google.android.gms.ads.mediation.a)) {
            com.google.android.gms.ads.internal.util.client.h.k(b.b(obj, com.google.android.gms.ads.mediation.a.class));
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.h.d("Requesting rewarded ad from adapter.");
        try {
            g(str, adRequestParcel, null);
            h(adRequestParcel);
            i(adRequestParcel);
            Location location = adRequestParcel.k;
            int i = adRequestParcel.g;
            int i2 = adRequestParcel.t;
            j(str, adRequestParcel);
            throw null;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
            b.a(azhtVar, e, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    public final void f(AdRequestParcel adRequestParcel, String str) {
        Object obj = this.a;
        if (!(obj instanceof com.google.android.gms.ads.mediation.a)) {
            com.google.android.gms.ads.internal.util.client.h.k(b.b(obj, com.google.android.gms.ads.mediation.a.class));
            throw new RemoteException();
        }
        azht azhtVar = this.c;
        new h((com.google.android.gms.ads.mediation.a) obj, this.d);
        e(azhtVar, adRequestParcel, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x032d, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.config.p.bQ.g()).booleanValue() != false) goto L162;
     */
    @Override // defpackage.otn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean fm(int r26, android.os.Parcel r27, android.os.Parcel r28) {
        /*
            Method dump skipped, instructions count: 2542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.mediation.client.f.fm(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public f(com.google.android.gms.ads.mediation.a aVar) {
        this();
        this.a = aVar;
    }

    public f(com.google.android.gms.ads.mediation.c cVar) {
        this();
        this.a = cVar;
    }
}

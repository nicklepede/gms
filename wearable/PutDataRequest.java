package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.djkm;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PutDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djkm();
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    public final Uri a;
    public final Bundle b;
    public byte[] c;
    public long d;

    static {
        new SecureRandom();
    }

    public PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.a = uri;
        this.b = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        arwm.s(classLoader);
        bundle.setClassLoader(classLoader);
        this.c = bArr;
        this.d = j;
    }

    public static PutDataRequest a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (str.startsWith("//")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        return b(new Uri.Builder().scheme("wear").path(str).build());
    }

    public static PutDataRequest b(Uri uri) {
        arwm.t(uri, "uri must not be null");
        return new PutDataRequest(uri, new Bundle(), null, e);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            hashMap.put(str, (Asset) bundle.getParcelable(str));
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    public final void d(String str, Asset asset) {
        arwm.s(str);
        arwm.s(asset);
        this.b.putParcelable(str, asset);
    }

    public final void e() {
        this.d = 0L;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.c;
        sb.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Bundle bundle = this.b;
        sb.append(", numAssets=" + bundle.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        sb.append(", syncDeadline=" + this.d);
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : bundle.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(bundle.getParcelable(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arwm.t(parcel, "dest must not be null");
        Uri uri = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, uri, i, false);
        arxc.g(parcel, 4, this.b, false);
        arxc.i(parcel, 5, this.c, false);
        arxc.q(parcel, 6, this.d);
        arxc.c(parcel, a);
    }
}

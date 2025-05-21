package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.djka;
import defpackage.djkb;
import defpackage.dkiw;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DataItemParcelable extends AbstractSafeParcelable implements djka {
    public static final Parcelable.Creator CREATOR = new dkiw();
    public final Uri a;
    public final Map b;
    public byte[] c;

    public DataItemParcelable(Uri uri) {
        HashMap hashMap = new HashMap();
        this.a = uri;
        this.b = hashMap;
        this.c = null;
    }

    @Override // defpackage.djka
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.djka
    public final Map b() {
        throw null;
    }

    @Override // defpackage.djka
    public final byte[] c() {
        return this.c;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.c;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Map map = this.b;
        sb.append(a.V(map, ", numAssets="));
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.a))));
        if (!isLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : map.keySet()) {
            sb.append("\n    " + str + ": " + String.valueOf(map.get(str)));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, uri, i, false);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        arwm.s(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((djkb) entry.getValue()));
        }
        arxc.g(parcel, 4, bundle, false);
        arxc.i(parcel, 5, this.c, false);
        arxc.c(parcel, a);
    }

    public DataItemParcelable(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        arwm.s(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            arwm.s(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.b = hashMap;
        this.c = bArr;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}

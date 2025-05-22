package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dlvt;
import defpackage.dlvu;
import defpackage.dmup;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DataItemParcelable extends AbstractSafeParcelable implements dlvt {
    public static final Parcelable.Creator CREATOR = new dmup();
    public final Uri a;
    public final Map b;
    public byte[] c;

    public DataItemParcelable(Uri uri) {
        HashMap hashMap = new HashMap();
        this.a = uri;
        this.b = hashMap;
        this.c = null;
    }

    @Override // defpackage.dlvt
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.dlvt
    public final Map b() {
        throw null;
    }

    @Override // defpackage.dlvt
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
        sb.append(a.X(map, ", numAssets="));
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, uri, i, false);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        atzb.s(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((dlvu) entry.getValue()));
        }
        atzr.g(parcel, 4, bundle, false);
        atzr.i(parcel, 5, this.c, false);
        atzr.c(parcel, a);
    }

    public DataItemParcelable(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        atzb.s(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            atzb.s(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.b = hashMap;
        this.c = bArr;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}

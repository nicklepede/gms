package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bacc;
import defpackage.epus;
import defpackage.eput;
import defpackage.epuv;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class BulletPoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bacc();
    public HashMap a = new HashMap();

    public BulletPoint(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof BulletPoint) && ((BulletPoint) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
    }

    public BulletPoint(epus epusVar) {
        if (epusVar.b.size() != 0) {
            for (eput eputVar : epusVar.b) {
                HashMap hashMap = this.a;
                int a = epuv.a(eputVar.b);
                if (a == 0) {
                    a = 1;
                }
                hashMap.put(Integer.valueOf(a - 1), eputVar.c);
            }
        }
    }
}

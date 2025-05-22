package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bcfy;
import defpackage.esir;
import defpackage.esis;
import defpackage.esiu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class BulletPoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bcfy();
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

    public BulletPoint(esir esirVar) {
        if (esirVar.b.size() != 0) {
            for (esis esisVar : esirVar.b) {
                HashMap hashMap = this.a;
                int a = esiu.a(esisVar.b);
                if (a == 0) {
                    a = 1;
                }
                hashMap.put(Integer.valueOf(a - 1), esisVar.c);
            }
        }
    }
}

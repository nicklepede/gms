package com.google.android.gms.backup.migrate.helper;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alho;
import defpackage.alhy;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ParcelableBrokerRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alhy();
    public final alho a;
    public final fgsd b;

    public ParcelableBrokerRequest(Parcel parcel) {
        alho alhoVar = null;
        try {
            byte[] createByteArray = parcel.createByteArray();
            fgri y = fgri.y(alho.a, createByteArray, 0, createByteArray.length, fgqp.a());
            fgri.M(y);
            alhoVar = (alho) y;
            e = null;
        } catch (fgsd e) {
            e = e;
        }
        this.a = alhoVar;
        this.b = e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.r());
    }
}

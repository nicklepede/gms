package com.google.android.gms.backup.migrate.helper;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alhq;
import defpackage.alhz;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ParcelableBrokerResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alhz();
    private final alhq a;

    public ParcelableBrokerResponse(alhq alhqVar) {
        this.a = alhqVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a.r());
    }

    public ParcelableBrokerResponse(Parcel parcel) {
        alhq alhqVar;
        try {
            byte[] createByteArray = parcel.createByteArray();
            fgri y = fgri.y(alhq.a, createByteArray, 0, createByteArray.length, fgqp.a());
            fgri.M(y);
            alhqVar = (alhq) y;
        } catch (fgsd unused) {
            alhqVar = null;
        }
        this.a = alhqVar;
    }
}

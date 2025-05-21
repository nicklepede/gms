package com.google.android.gms.backup.migrate.helper;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ajgy;
import defpackage.ajhh;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ParcelableBrokerResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ajhh();
    private final ajgy a;

    public ParcelableBrokerResponse(ajgy ajgyVar) {
        this.a = ajgyVar;
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
        ajgy ajgyVar;
        try {
            byte[] createByteArray = parcel.createByteArray();
            fecp y = fecp.y(ajgy.a, createByteArray, 0, createByteArray.length, febw.a());
            fecp.M(y);
            ajgyVar = (ajgy) y;
        } catch (fedk unused) {
            ajgyVar = null;
        }
        this.a = ajgyVar;
    }
}

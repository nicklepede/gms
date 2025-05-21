package com.google.android.gms.backup.migrate.helper;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ajgw;
import defpackage.ajhg;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ParcelableBrokerRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ajhg();
    public final ajgw a;
    public final fedk b;

    public ParcelableBrokerRequest(Parcel parcel) {
        ajgw ajgwVar = null;
        try {
            byte[] createByteArray = parcel.createByteArray();
            fecp y = fecp.y(ajgw.a, createByteArray, 0, createByteArray.length, febw.a());
            fecp.M(y);
            ajgwVar = (ajgw) y;
            e = null;
        } catch (fedk e) {
            e = e;
        }
        this.a = ajgwVar;
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

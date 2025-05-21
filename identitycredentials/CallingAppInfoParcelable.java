package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmlx;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CallingAppInfoParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bmlx();
    private final String a;
    private final List b;
    private final String c;

    public CallingAppInfoParcelable(String str, List list, String str2) {
        fvbo.f(str, "packageName");
        fvbo.f(list, "packageCertificates");
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        parcel.writeString(this.a);
        List<byte[]> list = this.b;
        parcel.writeInt(list.size());
        for (byte[] bArr : list) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        parcel.writeString(this.c);
    }
}

package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acpz;
import defpackage.atzr;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acpz();
    final int a;
    public final String b;
    public final byte[] c;
    public final String d;
    public final List e;
    public final String f;

    public DeviceMetadata(int i, String str, byte[] bArr, String str2, List list, String str3) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
        this.e = list;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.y(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.asterism;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wgc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetAsterismConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wgc();
    public final int a;
    public final String b;
    public final String c;

    public SetAsterismConsentResponse(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}

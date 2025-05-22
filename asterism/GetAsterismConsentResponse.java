package com.google.android.gms.asterism;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.fmer;
import defpackage.wfz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetAsterismConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wfz();
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public GetAsterismConsentResponse(int i, int i2, String str, String str2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    public static boolean a(fmer fmerVar) {
        return fmerVar == fmer.CONSENTED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}

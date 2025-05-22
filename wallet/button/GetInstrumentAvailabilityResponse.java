package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkur;
import defpackage.dkus;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetInstrumentAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkus();
    public String a;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    private GetInstrumentAvailabilityResponse() {
    }

    public static dkur a() {
        return new dkur(new GetInstrumentAvailabilityResponse());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.c(parcel, a);
    }

    public GetInstrumentAvailabilityResponse(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }
}

package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagx;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class InvitationParam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bagx();
    public final String a;
    public final WakeUpRequest b;
    public final String c;
    public final int d;
    public final String e;

    public InvitationParam(String str, WakeUpRequest wakeUpRequest, String str2, int i, String str3) {
        fxxm.f(wakeUpRequest, "wakeUpRequest");
        this.a = str;
        this.b = wakeUpRequest;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}

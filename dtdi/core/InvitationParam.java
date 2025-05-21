package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycx;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class InvitationParam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aycx();
    public final String a;
    public final WakeUpRequest b;
    public final String c;
    public final int d;
    public final String e;

    public InvitationParam(String str, WakeUpRequest wakeUpRequest, String str2, int i, String str3) {
        fvbo.f(wakeUpRequest, "wakeUpRequest");
        this.a = str;
        this.b = wakeUpRequest;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}

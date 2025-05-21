package com.google.android.gms.dtdi.core;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ayda;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayda();
    public final IBinder a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public RemoteDevice(IBinder iBinder, String str, String str2, String str3, List list) {
        fvbo.f(iBinder, "token");
        fvbo.f(str, "deviceName");
        fvbo.f(list, "capabilities");
        this.a = iBinder;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, iBinder);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.E(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}

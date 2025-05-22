package com.google.android.gms.dtdi.core;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.baha;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new baha();
    public final IBinder a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public RemoteDevice(IBinder iBinder, String str, String str2, String str3, List list) {
        fxxm.f(iBinder, "token");
        fxxm.f(str, "deviceName");
        fxxm.f(list, "capabilities");
        this.a = iBinder;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, iBinder);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.E(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}

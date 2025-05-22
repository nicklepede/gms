package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bahe;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class WakeUpRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bahe();
    public final String a;
    public final List b;
    public final String c;
    public final List d;

    public WakeUpRequest(String str, List list, String str2, List list2) {
        fxxm.f(str, "action");
        fxxm.f(list, "extras");
        fxxm.f(str2, "reason");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}

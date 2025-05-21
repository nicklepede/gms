package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aydf;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class WakeUpRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aydf();
    public final String a;
    public final List b;
    public final String c;
    public final List d;

    public WakeUpRequest(String str, List list, String str2, List list2) {
        fvbo.f(str, "action");
        fvbo.f(list, "extras");
        fvbo.f(str2, "reason");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}

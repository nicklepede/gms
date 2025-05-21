package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bako;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bako();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ServiceDumpRequest[] f;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, ServiceDumpRequest[] serviceDumpRequestArr) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = serviceDumpRequestArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.e(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.e(parcel, 6, this.e);
        arxc.J(parcel, 7, this.f, i);
        arxc.c(parcel, a);
    }
}

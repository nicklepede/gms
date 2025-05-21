package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bzha;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ActivityRecognitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzha();
    public final long a;
    public final boolean b;
    public final WorkSource c;
    public final String d;
    public final int[] e;
    public final boolean f;
    public final String g;
    public final long h;
    public String i;

    public ActivityRecognitionRequest(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.a = j;
        this.b = z;
        this.c = workSource;
        this.d = str;
        this.e = iArr;
        this.f = z2;
        this.g = str2;
        this.h = j2;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arwm.s(parcel);
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.p(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.v(parcel, 7, this.g, false);
        arxc.q(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.c(parcel, a);
    }
}

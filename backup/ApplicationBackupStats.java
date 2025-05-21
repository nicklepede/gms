package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahhg;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ApplicationBackupStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahhg();
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;

    public ApplicationBackupStats(String str, int i, int i2, long j, long j2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}

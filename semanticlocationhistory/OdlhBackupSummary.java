package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dacr;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OdlhBackupSummary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dacr();
    public final long a;
    public final String b;
    public final boolean c;
    public final long d;
    public final List e;
    public final String f;

    public OdlhBackupSummary(long j, String str, boolean z, long j2, List list, String str2) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = j2;
        this.e = list;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.x(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}

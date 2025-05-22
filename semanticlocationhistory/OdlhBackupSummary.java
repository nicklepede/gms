package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dcmz;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OdlhBackupSummary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcmz();
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.x(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}

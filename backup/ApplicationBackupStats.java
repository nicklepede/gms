package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajhw;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ApplicationBackupStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajhw();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}

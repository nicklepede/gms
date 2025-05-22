package com.google.android.gms.lockbox.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdsd;
import defpackage.cdtf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LockboxSignedInStatus extends AbstractSafeParcelable implements cdsd {
    public static final Parcelable.Creator CREATOR = new cdtf();
    public final String a;
    public final String b;
    public final long c;

    public LockboxSignedInStatus(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.cdsd
    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.q(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.lockbox.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cbjl;
import defpackage.cbkn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LockboxSignedInStatus extends AbstractSafeParcelable implements cbjl {
    public static final Parcelable.Creator CREATOR = new cbkn();
    public final String a;
    public final String b;
    public final long c;

    public LockboxSignedInStatus(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.cbjl
    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.q(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}

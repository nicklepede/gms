package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dipl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WarmUpUiProcessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dipl();
    long a;

    public WarmUpUiProcessRequest(long j) {
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.c(parcel, a);
    }

    public WarmUpUiProcessRequest() {
        this(SystemClock.elapsedRealtime());
    }
}

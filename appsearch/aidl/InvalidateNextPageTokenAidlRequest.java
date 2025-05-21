package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class InvalidateNextPageTokenAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufn();
    public final AppSearchAttributionSource a;
    public final long b;
    public final UserHandle c;
    public final long d;
    public final boolean e;

    public InvalidateNextPageTokenAidlRequest(AppSearchAttributionSource appSearchAttributionSource, long j, UserHandle userHandle, long j2, boolean z) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = j;
        this.c = (UserHandle) Objects.requireNonNull(userHandle);
        this.d = j2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.q(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}

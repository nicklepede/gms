package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.uff;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetNextPageAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uff();
    public final AppSearchAttributionSource a;
    public final String b;
    public final long c;
    public final int d;
    public final UserHandle e;
    public final long f;
    public final boolean g;

    public GetNextPageAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, long j, int i, UserHandle userHandle, long j2, boolean z) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = (UserHandle) Objects.requireNonNull(userHandle);
        this.f = j2;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.q(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}

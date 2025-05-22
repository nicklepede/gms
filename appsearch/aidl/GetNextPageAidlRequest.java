package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wbe;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetNextPageAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wbe();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, appSearchAttributionSource, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.q(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}

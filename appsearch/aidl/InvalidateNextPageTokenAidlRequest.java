package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wbm;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class InvalidateNextPageTokenAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wbm();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, appSearchAttributionSource, i, false);
        atzr.q(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.q(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}

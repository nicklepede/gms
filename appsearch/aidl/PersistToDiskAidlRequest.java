package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wbn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PersistToDiskAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wbn();
    public final AppSearchAttributionSource a;
    public final UserHandle b;
    public final long c;

    public PersistToDiskAidlRequest(AppSearchAttributionSource appSearchAttributionSource, UserHandle userHandle, long j) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (UserHandle) Objects.requireNonNull(userHandle);
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, appSearchAttributionSource, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}

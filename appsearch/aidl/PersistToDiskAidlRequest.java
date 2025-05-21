package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PersistToDiskAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufo();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}

package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufg;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetSchemaAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufg();
    public final AppSearchAttributionSource a;
    public final String b;
    public final String c;
    public final UserHandle d;
    public final long e;
    public final boolean f;

    public GetSchemaAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, String str2, UserHandle userHandle, long j, boolean z) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (String) Objects.requireNonNull(str);
        this.c = (String) Objects.requireNonNull(str2);
        this.d = (UserHandle) Objects.requireNonNull(userHandle);
        this.e = j;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.q(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}

package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufu;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SetSchemaAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufu();
    public final AppSearchAttributionSource a;
    public final String b;
    public final List c;
    public final List d;
    public final boolean e;
    public final int f;
    public final UserHandle g;
    public final long h;
    public final int i;

    public SetSchemaAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, List list, List list2, boolean z, int i, UserHandle userHandle, long j, int i2) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (String) Objects.requireNonNull(str);
        this.c = (List) Objects.requireNonNull(list);
        this.d = (List) Objects.requireNonNull(list2);
        this.e = z;
        this.f = i;
        this.g = (UserHandle) Objects.requireNonNull(userHandle);
        this.h = j;
        this.i = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.q(parcel, 8, this.h);
        arxc.o(parcel, 9, this.i);
        arxc.c(parcel, a);
    }
}

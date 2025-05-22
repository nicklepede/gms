package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.appsearch.RemoveByDocumentIdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wbq;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RemoveByDocumentIdAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wbq();
    public final AppSearchAttributionSource a;
    public final String b;
    final RemoveByDocumentIdRequest c;
    public final UserHandle d;
    public final long e;

    public RemoveByDocumentIdAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, RemoveByDocumentIdRequest removeByDocumentIdRequest, UserHandle userHandle, long j) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (String) Objects.requireNonNull(str);
        this.c = (RemoveByDocumentIdRequest) Objects.requireNonNull(removeByDocumentIdRequest);
        this.d = (UserHandle) Objects.requireNonNull(userHandle);
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, appSearchAttributionSource, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}

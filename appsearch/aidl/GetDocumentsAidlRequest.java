package com.google.android.gms.appsearch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.android.gms.appsearch.GetByDocumentIdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ufe;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetDocumentsAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ufe();
    public final AppSearchAttributionSource a;
    public final String b;
    public final String c;
    public final GetByDocumentIdRequest d;
    public final UserHandle e;
    public final long f;
    public final boolean g;

    public GetDocumentsAidlRequest(AppSearchAttributionSource appSearchAttributionSource, String str, String str2, GetByDocumentIdRequest getByDocumentIdRequest, UserHandle userHandle, long j, boolean z) {
        this.a = (AppSearchAttributionSource) Objects.requireNonNull(appSearchAttributionSource);
        this.b = (String) Objects.requireNonNull(str);
        this.c = (String) Objects.requireNonNull(str2);
        this.d = (GetByDocumentIdRequest) Objects.requireNonNull(getByDocumentIdRequest);
        this.e = (UserHandle) Objects.requireNonNull(userHandle);
        this.f = j;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppSearchAttributionSource appSearchAttributionSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appSearchAttributionSource, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.q(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}

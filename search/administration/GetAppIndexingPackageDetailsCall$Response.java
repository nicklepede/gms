package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cykj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetAppIndexingPackageDetailsCall$Response extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cykj();
    public final Status a;
    public final CorpusConfigParcelable[] b;
    public final long c;
    public final AppIndexingErrorInfo[] d;
    public final AppIndexingUserActionInfo[] e;
    public final boolean f;
    public final boolean g;

    public GetAppIndexingPackageDetailsCall$Response(Status status, CorpusConfigParcelable[] corpusConfigParcelableArr, long j, AppIndexingErrorInfo[] appIndexingErrorInfoArr, AppIndexingUserActionInfo[] appIndexingUserActionInfoArr, boolean z, boolean z2) {
        this.a = status;
        this.b = corpusConfigParcelableArr;
        this.c = j;
        this.d = appIndexingErrorInfoArr;
        this.e = appIndexingUserActionInfoArr;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.q(parcel, 3, this.c);
        arxc.J(parcel, 4, this.d, i);
        arxc.J(parcel, 5, this.e, i);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}

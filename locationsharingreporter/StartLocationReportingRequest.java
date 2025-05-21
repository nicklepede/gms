package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.caty;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class StartLocationReportingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new caty();
    public final int a;
    public final int b;
    public final LocationShare c;
    public final long d;
    public final NoticeAckedUpdateRequest e;

    public StartLocationReportingRequest(int i, int i2, LocationShare locationShare, long j, NoticeAckedUpdateRequest noticeAckedUpdateRequest) {
        this.a = i;
        this.b = i2;
        this.d = j;
        this.c = locationShare;
        this.e = noticeAckedUpdateRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}

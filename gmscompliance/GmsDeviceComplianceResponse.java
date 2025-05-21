package com.google.android.gms.gmscompliance;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bimn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GmsDeviceComplianceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bimn();
    final int a;
    public boolean b;
    public PendingIntent c;
    public boolean d;
    public long e;
    public byte[] f;

    public GmsDeviceComplianceResponse(int i, boolean z, PendingIntent pendingIntent, boolean z2, long j, byte[] bArr) {
        this.a = i;
        this.b = z;
        this.c = pendingIntent;
        this.d = z2;
        this.e = j;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.e(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.i(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }

    public GmsDeviceComplianceResponse() {
        this(1, true, null, false, 0L, null);
    }

    public GmsDeviceComplianceResponse(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        this(gmsDeviceComplianceResponse.a, gmsDeviceComplianceResponse.b, gmsDeviceComplianceResponse.c, gmsDeviceComplianceResponse.d, gmsDeviceComplianceResponse.e, gmsDeviceComplianceResponse.f);
    }
}

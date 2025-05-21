package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.artz;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new artz();
    public final RootTelemetryConfiguration a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = rootTelemetryConfiguration;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RootTelemetryConfiguration rootTelemetryConfiguration = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, rootTelemetryConfiguration, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.p(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.p(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}

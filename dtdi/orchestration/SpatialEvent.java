package com.google.android.gms.dtdi.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arxc;
import defpackage.azgj;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SpatialEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new azgj();
    public final PresenceDevice a;
    public final int b;
    public final int c;
    public final List d;
    public final AnalyticsInfo e;

    public SpatialEvent(PresenceDevice presenceDevice, int i, int i2, List list, AnalyticsInfo analyticsInfo) {
        fvbo.f(presenceDevice, "device");
        fvbo.f(list, "motionTypes");
        fvbo.f(analyticsInfo, "analyticsInfo");
        this.a = presenceDevice;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = analyticsInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        PresenceDevice presenceDevice = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, presenceDevice, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.E(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}

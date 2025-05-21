package com.google.android.gms.semanticlocation;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.WifiScan;
import defpackage.arxc;
import defpackage.czgc;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class InputSignals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgc();
    public final long a;
    public final int b;
    public final Location c;
    public final WifiScan d;
    public final List e;
    public final List f;
    public final RtslDebugData g;

    public InputSignals(long j, int i, Location location, WifiScan wifiScan, List list, List list2, RtslDebugData rtslDebugData) {
        this.a = j;
        this.b = i;
        this.c = location;
        this.d = wifiScan;
        this.e = list;
        this.f = list2;
        this.g = rtslDebugData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.y(parcel, 5, this.e, false);
        arxc.y(parcel, 6, this.f, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
    }
}

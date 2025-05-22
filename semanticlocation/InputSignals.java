package com.google.android.gms.semanticlocation;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.WifiScan;
import defpackage.atzr;
import defpackage.dbqa;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class InputSignals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqa();
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.y(parcel, 5, this.e, false);
        atzr.y(parcel, 6, this.f, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }
}

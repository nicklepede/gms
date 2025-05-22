package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cclf;
import defpackage.elgo;
import defpackage.elpg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cclf();
    public final List a;
    public final PendingIntent b;
    public final String c;

    public RemoveGeofencingRequest(List list, PendingIntent pendingIntent, String str) {
        elgo i;
        if (list == null) {
            int i2 = elgo.d;
            i = elpg.a;
        } else {
            i = elgo.i(list);
        }
        this.a = i;
        this.b = pendingIntent;
        this.c = str;
    }

    public static RemoveGeofencingRequest a(List list) {
        atzb.t(list, "geofence can't be null.");
        atzb.c(!list.isEmpty(), "Geofences must contains at least one id.");
        return new RemoveGeofencingRequest(list, null, "");
    }

    public static RemoveGeofencingRequest b(PendingIntent pendingIntent) {
        atzb.t(pendingIntent, "PendingIntent can not be null.");
        return new RemoveGeofencingRequest(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.x(parcel, 1, list, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}

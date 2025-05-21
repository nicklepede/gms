package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.caco;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class RemoveGeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new caco();
    public final List a;
    public final PendingIntent b;
    public final String c;

    public RemoveGeofencingRequest(List list, PendingIntent pendingIntent, String str) {
        eitj i;
        if (list == null) {
            int i2 = eitj.d;
            i = ejcb.a;
        } else {
            i = eitj.i(list);
        }
        this.a = i;
        this.b = pendingIntent;
        this.c = str;
    }

    public static RemoveGeofencingRequest a(List list) {
        arwm.t(list, "geofence can't be null.");
        arwm.c(!list.isEmpty(), "Geofences must contains at least one id.");
        return new RemoveGeofencingRequest(list, null, "");
    }

    public static RemoveGeofencingRequest b(PendingIntent pendingIntent) {
        arwm.t(pendingIntent, "PendingIntent can not be null.");
        return new RemoveGeofencingRequest(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 1, list, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}

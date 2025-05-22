package com.google.android.gms.location.fused.manager;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import defpackage.atzr;
import defpackage.cbqi;
import defpackage.cbvp;
import defpackage.cbvq;
import defpackage.ccba;
import defpackage.ekvl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PendingIntentLocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ccba();
    public static final Feature[] a = {cbqi.k};
    public final cbvq b;
    public final String c;
    public final String d;
    public final int e;

    public PendingIntentLocationRequest(PendingIntent pendingIntent, cbvq cbvqVar, ClientIdentity clientIdentity) {
        ekvl.q(!clientIdentity.n());
        this.b = cbvqVar;
        this.c = clientIdentity.e.equals(pendingIntent.getCreatorPackage()) ? null : clientIdentity.e;
        this.d = clientIdentity.f;
        int i = 0;
        for (char c = 0; c <= 0; c = 1) {
            Feature feature = a[0];
            if (feature != null && clientIdentity.s(feature)) {
                i = 1;
            }
        }
        this.e = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        String str = this.c;
        if (str != null) {
            sb.append(str);
        } else {
            sb.append('-');
        }
        String str2 = this.d;
        if (str2 != null) {
            sb.append('/');
            sb.append(str2);
        }
        int i = this.e;
        if (i != 0) {
            sb.append(" 0b");
            sb.append(Integer.toBinaryString(i));
        }
        sb.append(", ");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cbvq cbvqVar = this.b;
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 1, cbvqVar.a(), i, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.o(parcel, 4, this.e);
        atzr.c(parcel, a2);
    }

    public PendingIntentLocationRequest(LocationRequest locationRequest, String str, String str2, int i) {
        this.b = new cbvp(locationRequest).a();
        this.c = str;
        this.d = str2;
        this.e = i;
    }
}

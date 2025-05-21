package com.google.android.gms.location.fused.manager;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import defpackage.arxc;
import defpackage.bzhr;
import defpackage.bzmy;
import defpackage.bzmz;
import defpackage.bzsj;
import defpackage.eiig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PendingIntentLocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bzsj();
    public static final Feature[] a = {bzhr.k};
    public final bzmz b;
    public final String c;
    public final String d;
    public final int e;

    public PendingIntentLocationRequest(PendingIntent pendingIntent, bzmz bzmzVar, ClientIdentity clientIdentity) {
        eiig.p(!clientIdentity.n());
        this.b = bzmzVar;
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
        bzmz bzmzVar = this.b;
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 1, bzmzVar.a(), i, false);
        arxc.v(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.d, false);
        arxc.o(parcel, 4, this.e);
        arxc.c(parcel, a2);
    }

    public PendingIntentLocationRequest(LocationRequest locationRequest, String str, String str2, int i) {
        this.b = new bzmy(locationRequest).a();
        this.c = str;
        this.d = str2;
        this.e = i;
    }
}

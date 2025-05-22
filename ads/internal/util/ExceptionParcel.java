package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ekvk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ExceptionParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new t();
    public final String a;
    public final int b;

    public ExceptionParcel(String str, int i) {
        this.a = str == null ? "" : str;
        this.b = i;
    }

    public static ExceptionParcel a(Throwable th) {
        AdErrorParcel a;
        if (th instanceof com.google.android.gms.ads.nonagon.render.a) {
            int i = ((com.google.android.gms.ads.nonagon.render.a) th).a;
            throw null;
        }
        if (th instanceof com.google.android.gms.ads.nonagon.load.a) {
            a = th.getMessage() == null ? com.google.android.gms.ads.nonagon.util.b.a(((com.google.android.gms.ads.nonagon.load.a) th).a) : com.google.android.gms.ads.nonagon.util.b.b(((com.google.android.gms.ads.nonagon.load.a) th).a, th.getMessage());
        } else {
            if (th instanceof s) {
                throw null;
            }
            a = com.google.android.gms.ads.nonagon.util.b.a(1);
        }
        return new ExceptionParcel(ekvk.c(th.getMessage()) ? a.b : th.getMessage(), a.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}

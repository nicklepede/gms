package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PassInstance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmm();
    public PassType a;
    public String b;
    public String c;
    public String d;
    public Bitmap e;
    public String f;
    public PendingIntent g;
    public String h;
    public Bitmap i;
    public final int j;

    private PassInstance() {
        this.j = 14343392;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassInstance) {
            PassInstance passInstance = (PassInstance) obj;
            if (atyq.b(this.a, passInstance.a) && atyq.b(this.b, passInstance.b) && atyq.b(this.c, passInstance.c) && atyq.b(this.d, passInstance.d) && atyq.b(this.e, passInstance.e) && atyq.b(this.f, passInstance.f) && atyq.b(this.g, passInstance.g) && atyq.b(this.h, passInstance.h) && atyq.b(this.i, passInstance.i) && atyq.b(Integer.valueOf(this.j), Integer.valueOf(passInstance.j))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Integer.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.o(parcel, 10, this.j);
        atzr.c(parcel, a);
    }

    public PassInstance(PassType passType, String str, String str2, String str3, Bitmap bitmap, String str4, PendingIntent pendingIntent, String str5, Bitmap bitmap2, int i) {
        this.a = passType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bitmap;
        this.f = str4;
        this.g = pendingIntent;
        this.h = str5;
        this.i = bitmap2;
        this.j = i;
    }
}

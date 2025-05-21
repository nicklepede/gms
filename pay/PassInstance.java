package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PassInstance extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdh();
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
            if (arwb.b(this.a, passInstance.a) && arwb.b(this.b, passInstance.b) && arwb.b(this.c, passInstance.c) && arwb.b(this.d, passInstance.d) && arwb.b(this.e, passInstance.e) && arwb.b(this.f, passInstance.f) && arwb.b(this.g, passInstance.g) && arwb.b(this.h, passInstance.h) && arwb.b(this.i, passInstance.i) && arwb.b(Integer.valueOf(this.j), Integer.valueOf(passInstance.j))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.o(parcel, 10, this.j);
        arxc.c(parcel, a);
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

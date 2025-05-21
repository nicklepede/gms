package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PayGlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdr();
    public int a;
    public String b;
    public Bitmap c;
    public String d;
    public String e;
    public String f;
    public Bitmap g;
    public PendingIntent h;
    public int i;

    private PayGlobalActionCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayGlobalActionCard) {
            PayGlobalActionCard payGlobalActionCard = (PayGlobalActionCard) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(payGlobalActionCard.a)) && arwb.b(this.b, payGlobalActionCard.b) && arwb.b(this.c, payGlobalActionCard.c) && arwb.b(this.d, payGlobalActionCard.d) && arwb.b(this.e, payGlobalActionCard.e) && arwb.b(this.f, payGlobalActionCard.f) && arwb.b(this.g, payGlobalActionCard.g) && arwb.b(this.h, payGlobalActionCard.h) && arwb.b(Integer.valueOf(this.i), Integer.valueOf(payGlobalActionCard.i))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h, Integer.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.g, i, false);
        arxc.t(parcel, 7, this.h, i, false);
        arxc.v(parcel, 8, this.f, false);
        arxc.o(parcel, 9, this.i);
        arxc.c(parcel, a);
    }

    public PayGlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent, int i2) {
        this.a = i;
        this.b = str;
        this.c = bitmap;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = bitmap2;
        this.h = pendingIntent;
        this.i = i2;
    }
}

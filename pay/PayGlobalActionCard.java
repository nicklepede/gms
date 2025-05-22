package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PayGlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmw();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(payGlobalActionCard.a)) && atyq.b(this.b, payGlobalActionCard.b) && atyq.b(this.c, payGlobalActionCard.c) && atyq.b(this.d, payGlobalActionCard.d) && atyq.b(this.e, payGlobalActionCard.e) && atyq.b(this.f, payGlobalActionCard.f) && atyq.b(this.g, payGlobalActionCard.g) && atyq.b(this.h, payGlobalActionCard.h) && atyq.b(Integer.valueOf(this.i), Integer.valueOf(payGlobalActionCard.i))) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.g, i, false);
        atzr.t(parcel, 7, this.h, i, false);
        atzr.v(parcel, 8, this.f, false);
        atzr.o(parcel, 9, this.i);
        atzr.c(parcel, a);
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

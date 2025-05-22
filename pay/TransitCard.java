package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransitCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnx();
    public int a;
    public String b;
    public Bitmap c;
    public Bitmap d;
    public String e;
    public String f;
    public PendingIntent g;
    public TransitCardDialog h;

    private TransitCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitCard) {
            TransitCard transitCard = (TransitCard) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(transitCard.a)) && atyq.b(this.b, transitCard.b) && atyq.b(this.c, transitCard.c) && atyq.b(this.d, transitCard.d) && atyq.b(this.e, transitCard.e) && atyq.b(this.f, transitCard.f) && atyq.b(this.g, transitCard.g) && atyq.b(this.h, transitCard.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.c(parcel, a);
    }

    public TransitCard(int i, String str, Bitmap bitmap, Bitmap bitmap2, String str2, String str3, PendingIntent pendingIntent, TransitCardDialog transitCardDialog) {
        this.a = i;
        this.b = str;
        this.c = bitmap;
        this.d = bitmap2;
        this.e = str2;
        this.f = str3;
        this.g = pendingIntent;
        this.h = transitCardDialog;
    }
}

package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctes;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransitCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctes();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(transitCard.a)) && arwb.b(this.b, transitCard.b) && arwb.b(this.c, transitCard.c) && arwb.b(this.d, transitCard.d) && arwb.b(this.e, transitCard.e) && arwb.b(this.f, transitCard.f) && arwb.b(this.g, transitCard.g) && arwb.b(this.h, transitCard.h)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.c(parcel, a);
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

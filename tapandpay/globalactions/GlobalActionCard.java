package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.deyc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deyc();
    public int a;
    public String b;
    public Bitmap c;
    public String d;
    public String e;
    public String f;
    public Bitmap g;
    public PendingIntent h;

    private GlobalActionCard() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(globalActionCard.a)) && arwb.b(this.b, globalActionCard.b) && arwb.b(this.c, globalActionCard.c) && arwb.b(this.d, globalActionCard.d) && arwb.b(this.e, globalActionCard.e) && arwb.b(this.f, globalActionCard.f) && arwb.b(this.g, globalActionCard.g) && arwb.b(this.h, globalActionCard.h)) {
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
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.g, i, false);
        arxc.t(parcel, 7, this.h, i, false);
        arxc.v(parcel, 8, this.f, false);
        arxc.c(parcel, a);
    }

    public GlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent) {
        this.a = i;
        this.b = str;
        this.c = bitmap;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = bitmap2;
        this.h = pendingIntent;
    }
}

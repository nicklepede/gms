package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctet;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TransitCardDialog extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctet();
    public String a;
    public String b;
    public String c;
    public PendingIntent d;
    public String e;
    public PendingIntent f;
    public Bitmap g;
    public Bitmap[] h;
    public Animation i;

    private TransitCardDialog() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitCardDialog) {
            TransitCardDialog transitCardDialog = (TransitCardDialog) obj;
            if (arwb.b(this.a, transitCardDialog.a) && arwb.b(this.b, transitCardDialog.b) && arwb.b(this.c, transitCardDialog.c) && arwb.b(this.d, transitCardDialog.d) && arwb.b(this.e, transitCardDialog.e) && arwb.b(this.f, transitCardDialog.f) && arwb.b(this.g, transitCardDialog.g) && Arrays.equals(this.h, transitCardDialog.h) && arwb.b(this.i, transitCardDialog.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.J(parcel, 8, this.h, i);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
    }

    public TransitCardDialog(String str, String str2, String str3, PendingIntent pendingIntent, String str4, PendingIntent pendingIntent2, Bitmap bitmap, Bitmap[] bitmapArr, Animation animation) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pendingIntent;
        this.e = str4;
        this.f = pendingIntent2;
        this.g = bitmap;
        this.h = bitmapArr;
        this.i = animation;
    }
}

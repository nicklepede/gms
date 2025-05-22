package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvny;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransitCardDialog extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvny();
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
            if (atyq.b(this.a, transitCardDialog.a) && atyq.b(this.b, transitCardDialog.b) && atyq.b(this.c, transitCardDialog.c) && atyq.b(this.d, transitCardDialog.d) && atyq.b(this.e, transitCardDialog.e) && atyq.b(this.f, transitCardDialog.f) && atyq.b(this.g, transitCardDialog.g) && Arrays.equals(this.h, transitCardDialog.h) && atyq.b(this.i, transitCardDialog.i)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.J(parcel, 8, this.h, i);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.c(parcel, a);
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

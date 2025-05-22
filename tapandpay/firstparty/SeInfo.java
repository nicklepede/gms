package com.google.android.gms.tapandpay.firstparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhim;
import defpackage.dhix;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhix();
    public int a;
    public String b;
    public String c;
    public RichCardArtAttributesParcelable d;
    public String e;
    public String f;
    public String g;
    public String h;
    private dhim i;

    private SeInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeInfo) {
            SeInfo seInfo = (SeInfo) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(seInfo.a)) && atyq.b(this.b, seInfo.b) && atyq.b(this.c, seInfo.c) && atyq.b(this.i, seInfo.i) && atyq.b(this.d, seInfo.d) && atyq.b(this.e, seInfo.e) && atyq.b(this.f, seInfo.f) && atyq.b(this.g, seInfo.g) && atyq.b(this.h, seInfo.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.i, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.f, false);
        atzr.v(parcel, 3, this.g, false);
        atzr.v(parcel, 4, this.c, false);
        dhim dhimVar = this.i;
        atzr.D(parcel, 5, dhimVar == null ? null : dhimVar.a);
        atzr.t(parcel, 6, this.d, i, false);
        atzr.v(parcel, 7, this.e, false);
        atzr.v(parcel, 8, this.b, false);
        atzr.v(parcel, 9, this.h, false);
        atzr.c(parcel, a);
    }

    public SeInfo(int i, String str, String str2, IBinder iBinder, RichCardArtAttributesParcelable richCardArtAttributesParcelable, String str3, String str4, String str5, String str6) {
        dhim dhimVar;
        if (iBinder == null) {
            dhimVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.firstparty.IRenderCallback");
            dhimVar = queryLocalInterface instanceof dhim ? (dhim) queryLocalInterface : new dhim(iBinder);
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.i = dhimVar;
        this.d = richCardArtAttributesParcelable;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }
}

package com.google.android.gms.tapandpay.firstparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dexi;
import defpackage.dext;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dext();
    public int a;
    public String b;
    public String c;
    public RichCardArtAttributesParcelable d;
    public String e;
    public String f;
    public String g;
    public String h;
    private dexi i;

    private SeInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeInfo) {
            SeInfo seInfo = (SeInfo) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(seInfo.a)) && arwb.b(this.b, seInfo.b) && arwb.b(this.c, seInfo.c) && arwb.b(this.i, seInfo.i) && arwb.b(this.d, seInfo.d) && arwb.b(this.e, seInfo.e) && arwb.b(this.f, seInfo.f) && arwb.b(this.g, seInfo.g) && arwb.b(this.h, seInfo.h)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.f, false);
        arxc.v(parcel, 3, this.g, false);
        arxc.v(parcel, 4, this.c, false);
        dexi dexiVar = this.i;
        arxc.D(parcel, 5, dexiVar == null ? null : dexiVar.a);
        arxc.t(parcel, 6, this.d, i, false);
        arxc.v(parcel, 7, this.e, false);
        arxc.v(parcel, 8, this.b, false);
        arxc.v(parcel, 9, this.h, false);
        arxc.c(parcel, a);
    }

    public SeInfo(int i, String str, String str2, IBinder iBinder, RichCardArtAttributesParcelable richCardArtAttributesParcelable, String str3, String str4, String str5, String str6) {
        dexi dexiVar;
        if (iBinder == null) {
            dexiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.firstparty.IRenderCallback");
            dexiVar = queryLocalInterface instanceof dexi ? (dexi) queryLocalInterface : new dexi(iBinder);
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.i = dexiVar;
        this.d = richCardArtAttributesParcelable;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }
}

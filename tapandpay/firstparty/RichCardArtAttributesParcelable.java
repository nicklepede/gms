package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dexs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RichCardArtAttributesParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexs();
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public String h;

    private RichCardArtAttributesParcelable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RichCardArtAttributesParcelable) {
            RichCardArtAttributesParcelable richCardArtAttributesParcelable = (RichCardArtAttributesParcelable) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(richCardArtAttributesParcelable.a)) && arwb.b(this.b, richCardArtAttributesParcelable.b) && arwb.b(this.c, richCardArtAttributesParcelable.c) && arwb.b(this.d, richCardArtAttributesParcelable.d) && arwb.b(this.e, richCardArtAttributesParcelable.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(richCardArtAttributesParcelable.f)) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(richCardArtAttributesParcelable.g)) && arwb.b(this.h, richCardArtAttributesParcelable.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.o(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }

    public RichCardArtAttributesParcelable(int i, String str, String str2, String str3, String str4, int i2, int i3, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = i3;
        this.h = str5;
    }
}

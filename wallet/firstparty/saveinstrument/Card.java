package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diqb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class Card extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diqb();
    public String a;
    public String b;
    public int c;
    public int d;

    public Card() {
    }

    public final String a() {
        String str = this.b;
        return str != null ? str.replaceAll("[\\s\\-]", "") : "";
    }

    public final String b() {
        return this.a.replaceAll("[\\s\\-]", "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public Card(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }
}

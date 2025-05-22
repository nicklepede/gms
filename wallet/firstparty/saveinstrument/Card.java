package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlbm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class Card extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlbm();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public Card(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }
}

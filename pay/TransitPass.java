package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvoa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TransitPass extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvoa();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;

    private TransitPass() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitPass) {
            TransitPass transitPass = (TransitPass) obj;
            if (atyq.b(this.a, transitPass.a) && atyq.b(this.b, transitPass.b) && atyq.b(this.c, transitPass.c) && atyq.b(this.d, transitPass.d) && atyq.b(this.e, transitPass.e) && atyq.b(this.f, transitPass.f) && atyq.b(Integer.valueOf(this.g), Integer.valueOf(transitPass.g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.v(parcel, 4, this.e, false);
        atzr.v(parcel, 5, this.f, false);
        atzr.o(parcel, 6, this.g);
        atzr.v(parcel, 7, this.c, false);
        atzr.c(parcel, a);
    }

    public TransitPass(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
    }
}

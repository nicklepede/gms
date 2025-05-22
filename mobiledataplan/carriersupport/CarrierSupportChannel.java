package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgko;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CarrierSupportChannel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgko();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    public CarrierSupportChannel() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportChannel) {
            CarrierSupportChannel carrierSupportChannel = (CarrierSupportChannel) obj;
            if (atyq.b(this.a, carrierSupportChannel.a) && atyq.b(this.b, carrierSupportChannel.b) && atyq.b(this.c, carrierSupportChannel.c) && atyq.b(this.d, carrierSupportChannel.d) && atyq.b(this.e, carrierSupportChannel.e) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(carrierSupportChannel.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("Title", this.a, arrayList);
        atyp.b("SubTitle", this.b, arrayList);
        atyp.b("Target", this.c, arrayList);
        atyp.b("DefaultMessageSubject", this.d, arrayList);
        atyp.b("DefaultMessageBody", this.e, arrayList);
        atyp.b("Type", Integer.valueOf(this.f), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
    }

    public CarrierSupportChannel(String str, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }
}

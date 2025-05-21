package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cebh;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CarrierSupportChannel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cebh();
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
            if (arwb.b(this.a, carrierSupportChannel.a) && arwb.b(this.b, carrierSupportChannel.b) && arwb.b(this.c, carrierSupportChannel.c) && arwb.b(this.d, carrierSupportChannel.d) && arwb.b(this.e, carrierSupportChannel.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(carrierSupportChannel.f))) {
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
        arwa.b("Title", this.a, arrayList);
        arwa.b("SubTitle", this.b, arrayList);
        arwa.b("Target", this.c, arrayList);
        arwa.b("DefaultMessageSubject", this.d, arrayList);
        arwa.b("DefaultMessageBody", this.e, arrayList);
        arwa.b("Type", Integer.valueOf(this.f), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
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

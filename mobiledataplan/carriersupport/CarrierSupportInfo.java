package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cebi;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CarrierSupportInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cebi();
    public String a;
    public String b;
    public CarrierSupportChannel[] c;

    public CarrierSupportInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportInfo) {
            CarrierSupportInfo carrierSupportInfo = (CarrierSupportInfo) obj;
            if (arwb.b(this.a, carrierSupportInfo.a) && arwb.b(this.b, carrierSupportInfo.b) && Arrays.equals(this.c, carrierSupportInfo.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("TitleMessage", this.a, arrayList);
        arwa.b("LanguageCode", this.b, arrayList);
        arwa.b("SupportChannels", Arrays.toString(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.J(parcel, 3, this.c, i);
        arxc.c(parcel, a);
    }

    public CarrierSupportInfo(String str, String str2, CarrierSupportChannel[] carrierSupportChannelArr) {
        this.a = str;
        this.b = str2;
        this.c = carrierSupportChannelArr;
    }
}
